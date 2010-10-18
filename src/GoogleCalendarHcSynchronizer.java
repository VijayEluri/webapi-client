import java.io.IOException;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;

/**
 * Add pending auctions at Allegro.pl to Google Calendar.
 * 
 * This version uses HttpClient to add Calendar events.
 */
public class GoogleCalendarHcSynchronizer {
	public static void main(String[] args) {
		HttpClient client = new HttpClient();

		PostMethod method = new PostMethod(
				"https://www.google.com/accounts/ClientLogin");
		method.setParameter("Email", "");
		method.setParameter("Passwd", "");
		method.setParameter("source", "private-GoogleCalendarSynchronizer-0.1");
		method.setParameter("service", "cl");

		try {
			int statusCode = client.executeMethod(method);

			if (statusCode != HttpStatus.SC_OK) {
				System.err.println("Method failed: " + method.getStatusLine());
			}

			Header authToken = method.getResponseHeader("auth");

			System.out.println(authToken);

		} catch (HttpException e) {
			System.err.println("Fatal protocol violation: " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Fatal transport error: " + e.getMessage());
			e.printStackTrace();
		} finally {
			method.releaseConnection();
		}
	}
}
