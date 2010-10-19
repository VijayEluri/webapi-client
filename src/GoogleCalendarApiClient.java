import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import AllegroWebApi.ItemInfo;

import com.google.gdata.client.calendar.CalendarQuery;
import com.google.gdata.client.calendar.CalendarService;
import com.google.gdata.data.DateTime;
import com.google.gdata.data.PlainTextConstruct;
import com.google.gdata.data.calendar.CalendarEventEntry;
import com.google.gdata.data.calendar.CalendarEventFeed;
import com.google.gdata.data.extensions.When;
import com.google.gdata.util.AuthenticationException;
import com.google.gdata.util.ServiceException;

public class GoogleCalendarApiClient {
	private CalendarService myService;
	private URL feedUrl;
	private static final String ENTRY_PREFIX = "Allegro: ";
	private static final long ENTRY_START = 30 * 60 * 1000; // 30 minutes

	public GoogleCalendarApiClient(String username, String password)
			throws AuthenticationException, MalformedURLException {
		System.out.print("Logging in to Google... ");
		myService = new CalendarService("exampleCo-exampleApp-1");
		myService.setUserCredentials(username, password);

		feedUrl = new URL("https://www.google.com/calendar/feeds/" + username
				+ "/private/full");
		System.out.println("done.");
	}

	public boolean isAuctionAdded(ItemInfo itemInfo) throws IOException,
			ServiceException {
		
		// TODO: check by auction ID not time
		
		// FIXME: return true when entry added for '2010-10-20 15:33:00' 
		// and checked for '2010-10-20 15:35:13' and '2010-10-20 15:39:42'
		
		CalendarQuery myQuery = new CalendarQuery(feedUrl);
		// use the same time for min and max
		myQuery.setMinimumStartTime(DateTime
				.parseDateTime(dateLongToGoogleDateString(itemInfo
						.getItEndingTime()
						- ENTRY_START - 60 * 1000))); // minute before
		myQuery.setMaximumStartTime(DateTime
				.parseDateTime(dateLongToGoogleDateString(itemInfo
						.getItEndingTime()
						- ENTRY_START + 60 * 1000))); // minute after

		CalendarEventFeed resultFeed = myService.query(myQuery,
				CalendarEventFeed.class);
		if (resultFeed.getEntries().size() > 0) {
			CalendarEventEntry firstMatchEntry = (CalendarEventEntry) resultFeed
					.getEntries().get(0);
			String entryTitle = firstMatchEntry.getTitle().getPlainText();
			if (entryTitle.equals(ENTRY_PREFIX + itemInfo.getItName()))
				return true;
		}
		return false;
	}

	public CalendarEventEntry addAuction(ItemInfo itemInfo) throws IOException,
			ServiceException {
		CalendarEventEntry myEntry = new CalendarEventEntry();

		myEntry.setTitle(new PlainTextConstruct(ENTRY_PREFIX
				+ itemInfo.getItName()));
		// myEntry.setContent(new
		// PlainTextConstruct("Meet for a quick lesson."));
		// TODO: link to the auction

		DateTime startTime = DateTime
				.parseDateTime(dateLongToGoogleDateString(itemInfo
						.getItEndingTime()
						- ENTRY_START));
		DateTime endTime = DateTime
				.parseDateTime(dateLongToGoogleDateString(itemInfo
						.getItEndingTime()));
		When eventTimes = new When();
		eventTimes.setStartTime(startTime);
		eventTimes.setEndTime(endTime);
		myEntry.addTime(eventTimes);

		// Send the request and receive the response:
		CalendarEventEntry insertedEntry = myService.insert(feedUrl, myEntry);
		System.out.println("Event '" + insertedEntry.getTitle().getPlainText()
				+ "' has been created.");
		return insertedEntry;
	}

	public static String dateLongToGoogleDateString(long l) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String d = sdf.format(l);
		sdf = new SimpleDateFormat("HH:mm:ss");
		String t = sdf.format(l);
		return d + "T" + t + "+02:00";
	}

	public boolean isInFuture(ItemInfo itemInfo) {
		return itemInfo.getItEndingTime() > Calendar.getInstance().getTimeInMillis(); 
	}
}
