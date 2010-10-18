import javax.xml.rpc.holders.LongHolder;
import javax.xml.rpc.holders.StringHolder;

import AllegroWebApi.AllegroWebApiPortType;
import AllegroWebApi.AllegroWebApiServiceLocator;
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
		System.out.print("Accessing lost auctions... ");
		MyAccountStruct2[] doMyAccount2;
		do {
			doMyAccount2 = port.doMyAccount2(sessionHandlePart.value,
					accountType, offset, itemsArray, limit);

			for (int i = 0; i < doMyAccount2.length; i++) {
				String[] myAccountArray = doMyAccount2[i].getMyAccountArray();
				System.out.println("=> item #" + (offset+i)+ " id="+myAccountArray[0]+", cena="+myAccountArray[2]+", end="+myAccountArray[7]+", title="+myAccountArray[9]);
			}
			
			offset += limit;
		} while(doMyAccount2.length > 0);
		System.out.println("done.");
	}
}