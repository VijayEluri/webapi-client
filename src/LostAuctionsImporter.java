import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.xml.rpc.holders.LongHolder;
import javax.xml.rpc.holders.StringHolder;

import AllegroWebApi.AllegroWebApiPortType;
import AllegroWebApi.AllegroWebApiServiceLocator;
import AllegroWebApi.ItemInfo;
import AllegroWebApi.MyAccountStruct2;

/**
 * Imports lost auctions list from Allegro.pl to a spreadsheet at Google Docs. 
 *
 */
public class LostAuctionsImporter {
	public static void main(String[] args) throws Exception {
		// Make a service
		AllegroWebApiServiceLocator service = new AllegroWebApiServiceLocator();

		// Now use the service to get a stub which implements the SDI.
		AllegroWebApiPortType port = service.getAllegroWebApiPort();

		// Make the actual call
		final String userLogin = args[0];
		final String userPassword = args[1];
		final int countryCode = 1;
		final String webapiKey = args[2];
		final long localVerKey = 27553933;
		
		StringHolder info = new StringHolder();
		LongHolder currentVerKey = new LongHolder();
		
		System.out.print("Receving key version... ");
		port.doQuerySysStatus(1, countryCode, webapiKey, info, currentVerKey);
		System.out.println("done. Current version key=" + currentVerKey.value);
		
		assert(localVerKey == currentVerKey.value);
		
		StringHolder sessionHandlePart = new StringHolder();
		LongHolder userId = new LongHolder();
		LongHolder serverTime = new LongHolder();
		System.out.print("Logging in... ");
		port.doLogin(userLogin, userPassword, countryCode, webapiKey,
				localVerKey, sessionHandlePart, userId, serverTime);
		System.out.println("done.");

		String accountType = "not_won";
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
				System.out.println("=> item #" + (offset+i+1)+ " id="+myAccountArray[0]+", cena="+myAccountArray[2]+", end="+myAccountArray[7]+", title="+myAccountArray[9]);
				ItemInfo item = new ItemInfo();
//				item.setItBankAccount1();
//				item.setItBankAccount2(itBankAccount2);
//				item.setItBidCount(itBidCount);
//				item.setItBuyNowActive(itBuyNowActive);
				item.setItBuyNowPrice(Float.parseFloat(myAccountArray[4]));
//				item.setItCountry(itCountry);
//				item.setItDescription(itDescription);
				item.setItEndingTime(dateStringToLong(myAccountArray[7])); 
//				item.setItFotoCount(itFotoCount);
//				item.setItHighBidder(itHighBidder);
				item.setItHighBidderLogin(myAccountArray[8]);
				item.setItHitCount(Long.parseLong(myAccountArray[10]));
				item.setItId(Long.parseLong(myAccountArray[0]));
//				item.setItIsEco(itIsEco);
//				item.setItLocation(itLocation);
				item.setItName(myAccountArray[9]);
//				item.setItOptions(itOptions);
//				item.setItPostcode(itPostcode);
				item.setItPrice(Float.parseFloat(myAccountArray[2]));
//				item.setItQuantity(itQuantity);
//				item.setItReservePrice(Float.parseFloat(myAccountArray[3]));
//				item.setItSellerId(itSellerId);
				item.setItSellerLogin(myAccountArray[10]);
//				item.setItSellerRating(itSellerRating);
//				item.setItStartingPrice(Float.parseFloat(myAccountArray[1]));
//				item.setItStartingQuantity(itStartingQuantity);
//				item.setItStartingTime(dateStringToLong(myAccountArray[6]));
//				item.setItState(itState);
//				item.setItVatInvoice(itVatInvoice);
				infoItems.add(item);
			}
			
			offset += limit;
		} while(doMyAccount2.length > 0);
		System.out.println("done.");
		
		System.out.print("Generating CSV file... ");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Calendar c1 = Calendar.getInstance(); // today
		writeReversedItemsToFile(infoItems.toArray(new ItemInfo[0]), sdf.format(c1.getTime()) + ".txt");
		System.out.println("done.");
	}
	
	private static long dateStringToLong(String s) {
		try {
			DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			Date date = (Date) formatter.parse(s);
			long l = date.getTime();
			return l;
		} catch (ParseException e) {
			System.out.println("Exception :" + e);
		}
		return 0;
	}
	
	private static String dateLongToString(long l) {
		Date date = new Date(l);
		DateFormat dataformat = DateFormat.getDateInstance(DateFormat.MEDIUM);
		String s = dataformat.format(date);
		return s;
	}
	
	public static void writeReversedItemsToFile(ItemInfo[] items,
			String filePath) throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(filePath));
		for (int i = items.length - 1; i >= 0; i--) {
			ItemInfo item = items[i];
			out.write(dateLongToString(item.getItEndingTime()) + ";"
					+ Float.toString(item.getItPrice()).replace('.', ',') + ";"
					+ item.getItId() + ";" + item.getItName());
			out.newLine();
		}
		out.close();
	}
}