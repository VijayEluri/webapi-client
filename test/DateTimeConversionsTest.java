import webapi.client.AllegroWebApiClient;
import webapi.client.GoogleCalendarApiClient;
import junit.framework.TestCase;

public class DateTimeConversionsTest extends TestCase {

	public void testTheBeginningOfTime() {
		assertEquals("1970-01-01T00:00:00+0:00", GoogleCalendarApiClient
				.dateLongToGoogleDateString(0));
	}

	public void testAllegroToLongToGoogle() {
		long l = AllegroWebApiClient.dateStringToLong("2010-10-19 22:22:22");
		assertEquals("2010-10-19T22:22:22+02:00", GoogleCalendarApiClient
				.dateLongToGoogleDateString(l));
	}

	public void testLeadingZeros() {
		long l = AllegroWebApiClient.dateStringToLong("2010-01-01 05:08:01");
		assertEquals("2010-01-01T05:08:01+02:00", GoogleCalendarApiClient
				.dateLongToGoogleDateString(l));
	}

	public void test1274911352() {
		long l = AllegroWebApiClient.dateStringToLong("2010-10-21 12:57:10");
		assertEquals("2010-10-21T12:57:10+02:00", GoogleCalendarApiClient
				.dateLongToGoogleDateString(l));
	}
}
