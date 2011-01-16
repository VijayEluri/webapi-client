package webapi;
import java.util.Iterator;
import java.util.List;

import webapi.client.AllegroWebApiClient;
import webapi.client.GoogleCalendarApiClient;

import AllegroWebApi.ItemInfo;

/**
 * Add pending auctions at Allegro.pl to Google Calendar.
 * 
 * This version uses Google Calendar API to add events.
 */
public class GoogleCalendarSynchronizer {

	public static void main(String[] args) throws Exception {
		
		AllegroWebApiClient allegroClient = new AllegroWebApiClient(args[0], args[1], args[2]);
		List<ItemInfo> auctions = allegroClient.collectAuctions("bid");
		
		GoogleCalendarApiClient googleClient = new GoogleCalendarApiClient(args[3], args[4]);
		
		for (Iterator<ItemInfo> iterator = auctions.iterator(); iterator.hasNext();) {
			ItemInfo itemInfo = (ItemInfo) iterator.next();
			if (googleClient.isInFuture(itemInfo) && !googleClient.isAuctionAdded(itemInfo))
				googleClient.addAuction(itemInfo);
		}

		System.out.println("End of line.");
	}
}
