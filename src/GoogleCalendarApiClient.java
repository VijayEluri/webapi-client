import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

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

	private class Auction {
		String title = "Tennis with Beth";
		String description = "Meet for a quick lesson.";
		String endTime = "2010-10-19T17:00:00+00:00";
		public Auction() {
			// TODO Auto-generated constructor stub
		}
	}

	public GoogleCalendarApiClient(String username, String password)
			throws AuthenticationException, MalformedURLException {
		myService = new CalendarService("exampleCo-exampleApp-1");
		myService.setUserCredentials(username, password);

		feedUrl = new URL("https://www.google.com/calendar/feeds/" + username
				+ "/private/full");
	}
	
	public boolean isAuctionAdded(ItemInfo itemInfo) throws IOException, ServiceException {
		
		CalendarQuery myQuery = new CalendarQuery(feedUrl);
		myQuery.setMinimumStartTime(DateTime.parseDateTime("2010-10-19T17:00:00"));
		myQuery.setMaximumStartTime(DateTime.parseDateTime("2010-10-19T17:00:00"));

		
		CalendarEventFeed resultFeed = myService.query(myQuery, CalendarEventFeed.class);
		if (resultFeed.getEntries().size() > 0) {
			CalendarEventEntry firstMatchEntry = (CalendarEventEntry)
			resultFeed.getEntries().get(0); 
			String myEntryTitle = firstMatchEntry.getTitle().getPlainText();
		}
		return false;
	}

	public CalendarEventEntry addAuction(ItemInfo itemInfo) throws IOException, ServiceException {
		CalendarEventEntry myEntry = new CalendarEventEntry();

		myEntry.setTitle(new PlainTextConstruct("Tennis with Beth"));
		myEntry.setContent(new PlainTextConstruct("Meet for a quick lesson."));

		DateTime startTime = DateTime.parseDateTime("2010-10-19T15:00:00+00:00");
		DateTime endTime = DateTime.parseDateTime("2010-10-19T17:00:00+00:00");
		When eventTimes = new When();
		eventTimes.setStartTime(startTime);
		eventTimes.setEndTime(endTime);
		myEntry.addTime(eventTimes);

		// Send the request and receive the response:
		CalendarEventEntry insertedEntry = myService.insert(feedUrl, myEntry);
		System.out.println("Event '"+insertedEntry.getTitle().getPlainText()+"' has been created.");
		return insertedEntry;
		
	}
}
