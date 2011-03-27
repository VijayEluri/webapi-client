package webapi.client;
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
import com.google.gdata.data.extensions.Reminder;
import com.google.gdata.data.extensions.When;
import com.google.gdata.util.AuthenticationException;
import com.google.gdata.util.ServiceException;

public class GoogleCalendarApiClient {
	private CalendarService myService;
	private URL feedUrl;
	private static final String ENTRY_PREFIX = "Allegro: ";
	private static final long ENTRY_START = 1 * 60 * 1000; // 1 minute

	public GoogleCalendarApiClient(String username, String password)
			throws AuthenticationException, MalformedURLException {
		System.out.print("Logging to Google... ");
		myService = new CalendarService("exampleCo-exampleApp-1");
		myService.setUserCredentials(username, password);

		feedUrl = new URL("https://www.google.com/calendar/feeds/" + username
				+ "/private/full");
		System.out.println("done.");
	}

	public boolean isAuctionAdded(ItemInfo itemInfo) throws IOException,
			ServiceException {
		
		CalendarQuery myQuery = new CalendarQuery(feedUrl);
		// use the same time for min and max
		myQuery.setMinimumStartTime(DateTime
				.parseDateTime(dateLongToGoogleDateString(itemInfo
						.getItEndingTime()
						- ENTRY_START - 1000))); // a second before
		myQuery.setMaximumStartTime(DateTime
				.parseDateTime(dateLongToGoogleDateString(itemInfo
						.getItEndingTime()
						- ENTRY_START + 1000))); // a second after

		CalendarEventFeed resultFeed = myService.query(myQuery,
				CalendarEventFeed.class);
		for (CalendarEventEntry entry : resultFeed.getEntries()) {
			String entryTitle = entry.getTitle().getPlainText();
			if (entryTitle.equals(ENTRY_PREFIX + itemInfo.getItName() + "("
					+ itemInfo.getItId() + ")"))
				return true;
		}
		return false;
	}

	public CalendarEventEntry addAuction(ItemInfo itemInfo) throws IOException,
			ServiceException {
		CalendarEventEntry myEntry = new CalendarEventEntry();

		myEntry.setTitle(new PlainTextConstruct(ENTRY_PREFIX
				+ itemInfo.getItName() + "(" + itemInfo.getItId() + ")"));
		myEntry.setContent(new PlainTextConstruct(
				"http://allegro.pl/show_item.php?item=" + itemInfo.getItId()));

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
		
		Reminder reminder = new Reminder();
		reminder.setMethod(Reminder.Method.SMS);
		reminder.setMinutes(new Integer(15));
		myEntry.getReminder().add(reminder);
		
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
