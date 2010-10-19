import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import AllegroWebApi.ItemInfo;

/**
 * Imports lost auctions list from Allegro.pl to a spreadsheet at Google Docs. 
 *
 */
public class LostAuctionsImporter {
	public static void main(String[] args) throws Exception {
		
		AllegroWebApiClient allegroWebApiClient = new AllegroWebApiClient(args[0], args[1], args[2]);
		List<ItemInfo> infoItems = allegroWebApiClient.collectAuctions("not_won");
		
		System.out.print("Generating CSV file... ");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Calendar c1 = Calendar.getInstance(); // today
		writeReversedItemsToFile(infoItems.toArray(new ItemInfo[0]), sdf.format(c1.getTime()) + ".txt");
		System.out.println("done.");
	}
	
	private static String dateLongToString(long l) {
		Date date = new Date(l);
		DateFormat dataformat = DateFormat.getDateInstance(DateFormat.MEDIUM);
		String s = dataformat.format(date);
		return s;
	}
	
	private static void writeReversedItemsToFile(ItemInfo[] items,
			String filePath) throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(filePath));
		for (int i = items.length - 1; i >= 0; i--) {
			ItemInfo item = items[i];
			out.write(dateLongToString(item.getItEndingTime()) + ";"
					+ Float.toString(item.getItPrice()).replace('.', ',') + ";"
					+ item.getItId() + ";" + item.getItName());
			out.newLine();
		}
		out.close();
	}
}