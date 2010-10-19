import junit.framework.TestCase;

public class DateTimeConversionsTest extends TestCase {

	public void testTheBeginningOfTime() {
		assertEquals("1970-01-01T00:00:00+00:00", GoogleCalendarApiClient
				.dateLongToGoogleDateString(0));
	}

	public void testAllegroToLongToGoogle() {
		long l = AllegroWebApiClient.dateStringToLong("2010-10-19 22:22:22");
		assertEquals("2010-10-19T22:22:22+00:00", GoogleCalendarApiClient
				.dateLongToGoogleDateString(l));
	}
	
	public void testLeadingZeros() {
		long l = AllegroWebApiClient.dateStringToLong("2010-01-01 05:08:01");
		assertEquals("2010-01-01T05:08:01+00:00", GoogleCalendarApiClient
				.dateLongToGoogleDateString(l));
	}
}
