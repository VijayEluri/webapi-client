import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import AllegroWebApi.ItemInfo;

import com.google.gdata.client.calendar.CalendarQuery;
import com.google.gdata.client.calendar.CalendarService;
import com.google.gdata.data.DateTime;
import com.google.gdata.data.Feed;
import com.google.gdata.data.PlainTextConstruct;
import com.google.gdata.data.calendar.CalendarEventEntry;
import com.google.gdata.data.calendar.CalendarEventFeed;
import com.google.gdata.data.extensions.When;
import com.google.gdata.util.AuthenticationException;
import com.google.gdata.util.ServiceException;

/**
 * Add pending auctions at Allegro.pl to Google Calendar.
 * 
 * This version uses Google Calendar API to add events.
 */
public class GoogleCalendarApiSynchronizer {

	public static void main(String[] args) throws Exception {
		
		AllegroWebApiClient allegroClient = new AllegroWebApiClient(args[0], args[1], args[2]);
		List<ItemInfo> auctions = allegroClient.getIncomingAuctions();
		
		GoogleCalendarApiClient googleClient = new GoogleCalendarApiClient(args[3], args[4]);
		
		for (Iterator<ItemInfo> iterator = auctions.iterator(); iterator.hasNext();) {
			ItemInfo itemInfo = (ItemInfo) iterator.next();
			if (!googleClient.isAuctionAdded(itemInfo))
				googleClient.addAuction(itemInfo);
		}
	}
}
