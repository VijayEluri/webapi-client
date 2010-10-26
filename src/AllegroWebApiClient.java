import java.io.UnsupportedEncodingException;
import java.rmi.RemoteException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.rpc.ServiceException;
import javax.xml.rpc.holders.LongHolder;
import javax.xml.rpc.holders.StringHolder;

import org.apache.axis.encoding.Base64;

import AllegroWebApi.AllegroWebApiPortType;
import AllegroWebApi.AllegroWebApiServiceLocator;
import AllegroWebApi.ItemInfo;
import AllegroWebApi.MyAccountStruct2;

public class AllegroWebApiClient {
	private AllegroWebApiPortType port;
	private StringHolder sessionHandlePart;

	public AllegroWebApiClient(String username, String password, String key)
			throws RemoteException, ServiceException, NoSuchAlgorithmException,
			UnsupportedEncodingException {

		// Make a service
		AllegroWebApiServiceLocator service = new AllegroWebApiServiceLocator();

		// Now use the service to get a stub which implements the SDI.
		port = service.getAllegroWebApiPort();

		// Make the actual call
		final String userLogin = username;
		final String userPassword = password;
		final int countryCode = 1;
		final String webapiKey = key;
		final long localVerKey = 17501172;

		StringHolder info = new StringHolder();
		LongHolder currentVerKey = new LongHolder();

		System.out.print("Receving key version... ");
		port.doQuerySysStatus(1, countryCode, webapiKey, info, currentVerKey);
		System.out.println("done. Current version key=" + currentVerKey.value);
		
		if (localVerKey != currentVerKey.value) {
			System.out.println("Key versions don't match! Aborting.");
			System.exit(-1);
		}

		sessionHandlePart = new StringHolder();
		LongHolder userId = new LongHolder();
		LongHolder serverTime = new LongHolder();
		System.out.print("Logging in... ");
		port.doLoginEnc(userLogin, encryptAndEncodePassword(userPassword),
				countryCode, webapiKey, localVerKey, sessionHandlePart, userId,
				serverTime);
		System.out.println("done.");
	}

	private String encryptAndEncodePassword(String password)
			throws NoSuchAlgorithmException, UnsupportedEncodingException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(password.getBytes("UTF-8"));
		return Base64.encode(md.digest());
	}
	
	public List<ItemInfo> collectAuctions(final String accountType) throws RemoteException {
		int offset = 0;
		int itemsArray[] = {};
		int limit = 25;
		System.out.println("Accessing lost auctions... ");
		MyAccountStruct2[] doMyAccount2;
		List<ItemInfo> infoItems = new ArrayList<ItemInfo>();
		do {
			doMyAccount2 = port.doMyAccount2(sessionHandlePart.value,
					accountType, offset, itemsArray, limit);

			for (int i = 0; i < doMyAccount2.length; i++) {
				String[] myAccountArray = doMyAccount2[i].getMyAccountArray();
				System.out.println("=> item #" + (offset + i + 1) + " id="
						+ myAccountArray[0] + ", cena=" + myAccountArray[2]
						+ ", end=" + myAccountArray[7] + ", title="
						+ myAccountArray[9]);
				ItemInfo item = stringArrayToItemInfo(myAccountArray);
				infoItems.add(item);
			}
			
			offset += limit;
		} while(doMyAccount2.length > 0);
		System.out.println("done.");
		
		return infoItems;
	}
	
	public static ItemInfo stringArrayToItemInfo(String s[]) {
		ItemInfo item = new ItemInfo();
		
		// [0] identyfikator aukcji,
		item.setItId(Long.parseLong(s[0]));
		// [1] cena wywoławcza przedmiotu (lub 0.00 gdy nie została ustawiona),
		item.setItStartingPrice(s[1].equals("NULL") ? 0f : Float.parseFloat(s[1]));
		// [2] obecna cena przedmiotu,
		item.setItPrice(Float.parseFloat(s[2]));
		// [3] cena minimalna przedmiotu (lub 0.00 gdy nie została ustawiona),
		item.setItReservePrice(s[3].equals("NULL") ? 0f : Float.parseFloat(s[3]));
		// [4] cena Kup Teraz! (lub 0.00 gdy nie została ustawiona),
		item.setItBuyNowPrice(Float.parseFloat(s[4]));
		// [5] liczba przedmiotów dostępnych na aukcji,
		// [6] czas rozpoczęcia aukcji (w czasie jej trwania, widzi ją tylko sprzedający),
		// [7] czas zakończenia aukcji,
		item.setItEndingTime(dateStringToLong(s[7])); 
		// [8] identyfikator kupującego oferującego najwyższą cenę (lub 0 gdy nikt jeszcze nie złożył oferty),
		item.setItHighBidderLogin(s[8]);
		// [9] tytuł aukcji,
		item.setItName(s[9]);
		// [10] liczba złożonych w aukcji ofert,
		item.setItBidCount(Integer.parseInt(s[10]));
		// [11] identyfikator sprzedającego,
		item.setItSellerId(Long.parseLong(s[11]));
		// [12] identyfikator kraju,
		item.setItCountry(Integer.parseInt(s[12]));
		// [13] wartość informująca o wybranych dla aukcji opcjach dodatkowych (więcej),
		// [14] maksymalna cena oferowana za przedmiot przez użytkownika,
		// [15] maksymalna cena oferowana za przedmiot,
		// [16] liczba przedmiotów, które do tej pory nie zostały sprzedane, ale jeszcze mogą zostać sprzedane (dot. aukcji trwających),
		// [17] liczba przedmiotów, które zostały do tej pory sprzedane (dot. aukcji trwających),
		// [18] pole zdezaktualizowane (zawsze będzie zwracać NULL),
		// [19] liczba sprzedanych przedmiotów (dot. aukcji zakończonych),
		// [20] liczba niesprzedanych przedmiotów (dot. aukcji zakończonych),
		// [21] nazwa kupującego (lub 0 w przypadku braku ofert, pełna wartość pola widoczna jest tylko dla sprzedającego w danej aukcji, dla pozostałych w polu zwracana jest nazwa użytkownika w formie zanonimizowanej: X...Y),
		item.setItHighBidderLogin(s[21]);
		// [22] liczba punktów kupującego (lub 0 w przypadku braku ofert),
		// [23] kraj kupującego (lub 0 w przypadku braku ofert),
		// [24] nazwa sprzedającego,
		item.setItSellerLogin(s[24]);
		// [25]	liczba punktów sprzedającego,
		item.setItSellerRating(Integer.parseInt(s[25]));
		// [26]	kraj sprzedającego,
		// [27]	liczba osób obserwujących aukcję (lub '-' w przypadku braku obserwujących),
		// [28]	informacja o tym, czy w aukcji włączona  jest opcja Kup Teraz! (1 - jest, 0 - nie jest),
		item.setItBuyNowActive(s[28].equals("NULL") ? 0 : Integer.parseInt(s[28]));
		// [29]	liczba zdjęć dołączonych do aukcji,
		item.setItHighBidder(Integer.parseInt(s[29]));
//		item.setItFotoCount(Integer.parseInt(s[29]));
		// [30]	treść notatki dodanej przez sprzedającego do aukcji (widoczna tylko dla sprzedającego, dla pozostałych oraz w przypadku braku notatki zwracane jest 0),
		// [31]	informacja o tym, na ile minut przed końcem aukcji ma zostać wysłane e-mailem przypomnienie o tym fakcie (dot. aukcji obserwowanych),
		// [32]	tekstowy status aukcji oczekującej na wystawienie (np. 'Oczekuje', 'Wstrzymana przez administratora Allegro', itp.),
		// [33]	liczba wyświetleń aukcji,
		// [34]	pole zdezaktualizowane (zawsze będzie zwracać NULL),
		// [35]	pole zdezaktualizowane (zawsze będzie zwracać NULL).
		
		// item.setItBankAccount1();
		// item.setItBankAccount2(itBankAccount2);
		// item.setItBidCount(itBidCount);
		// item.setItDescription(itDescription);
		// item.setItIsEco(itIsEco);
		// item.setItLocation(itLocation);
		// item.setItOptions(itOptions);
		// item.setItPostcode(itPostcode);
		// item.setItQuantity(itQuantity);
		// item.setItStartingQuantity(itStartingQuantity);
		// item.setItStartingTime(dateStringToLong(myAccountArray[6]));
		// item.setItState(itState);
		// item.setItVatInvoice(itVatInvoice);
		return item;
	}
	
	public static long dateStringToLong(String s) {
		try {
			DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = (Date) formatter.parse(s);
			long l = date.getTime();
			return l;
		} catch (ParseException e) {
			System.out.println("Exception :" + e);
		}
		return 0;
	}
}
