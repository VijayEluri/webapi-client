import java.io.IOException;
import java.net.URL;

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

	private class Auction {
		String title = "Tennis with Beth";
		String description = "Meet for a quick lesson.";
		String endTime = "2010-10-19T17:00:00+00:00";
		public Auction() {
			// TODO Auto-generated constructor stub
		}
	}
	
	public static void main(String[] args) {
		
		GoogleCalendarApiSynchronizer synchronizer = new GoogleCalendarApiSynchronizer();
		synchronizer.run(args[0], args[1]);
		
	}

	private void run(String username, String password) {
		Auction[] auctions = new Auction[] {new Auction()};
		
		try {
			
			CalendarService myService = new CalendarService(
					"exampleCo-exampleApp-1");
			myService.setUserCredentials(username, password);
			
			URL feedUrl =
				  new URL("https://www.google.com/calendar/feeds/"+username+"/private/full");
			
			
			for (int i = 0; i < auctions.length; i++) {
				
			// TODO: check if exist
			
			CalendarQuery myQuery = new CalendarQuery(feedUrl);
			myQuery.setMinimumStartTime(DateTime.parseDateTime("2010-10-19T17:00:00"));
			myQuery.setMaximumStartTime(DateTime.parseDateTime("2010-10-19T17:00:00"));


			// Send the request and receive the response:
			CalendarEventFeed resultFeed = myService.query(myQuery, CalendarEventFeed.class);
			if (resultFeed.getEntries().size() > 0) {
				  CalendarEventEntry firstMatchEntry = (CalendarEventEntry)
				      resultFeed.getEntries().get(0); 
				  String myEntryTitle = firstMatchEntry.getTitle().getPlainText();
				}
			
				
			//--- add if not exist
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
				
			}
		} catch (AuthenticationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
