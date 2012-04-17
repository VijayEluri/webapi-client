package webapi;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import webapi.client.AllegroWebApiClient;

import com.allegro.webapi.ItemInfo;

/**
 * Imports lost auctions list from Allegro.pl to a spreadsheet at Google Docs. 
 *
 */
public class LostAuctionsImporter {
	public static void main(String[] args) throws Exception {
		
		AllegroWebApiClient allegroWebApiClient = new AllegroWebApiClient(args[0], args[1], args[2]);
		List<ItemInfo> itemInfos = allegroWebApiClient.collectAuctions("not_won");
		
		LostAuctionsImporter importer = new LostAuctionsImporter();
		System.out.print("Generating CSV file... ");
		File newFile = importer.saveAsCSV(itemInfos);
		System.out.println("done.");
		
		System.out.print("Merging with previously collected data... ");
		importer.merge(new File("output/merged-raw.csv"), newFile);
		System.out.println("done.");

		System.out.println("End of line.");
	}
	
	private File saveAsCSV(List<ItemInfo> itemInfos) throws IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Calendar c1 = Calendar.getInstance(); // today
		// TODO: filter out auctions without a winner
		return writeReversedItemsToFile(itemInfos.toArray(new ItemInfo[0]), "output/" + sdf.format(c1.getTime()) + ".csv");
	}
	
	public void merge(File oldFile, File newFile) throws IOException {
		String[] oldFileLines = IOUtils.readLines(oldFile);
		String[] newFileLines = IOUtils.readLines(newFile);
		Set<String> set = new HashSet<String>(oldFileLines.length);
		set.addAll(Arrays.asList(oldFileLines));
		set.addAll(Arrays.asList(newFileLines));
		List<String> list = new ArrayList<String>(set);
		Collections.sort(list);
		IOUtils.createFile(oldFile, list);
	}
	
	private String dateLongToString(long l) {
		Date date = new Date(l);
		DateFormat dataformat = DateFormat.getDateInstance(DateFormat.MEDIUM);
		String s = dataformat.format(date);
		return s;
	}
	
	private File writeReversedItemsToFile(ItemInfo[] items,
			String filePath) throws IOException {
		File file = new File(filePath);
		List<String> itemsAsString = new ArrayList<String>(items.length);
		for (int i = items.length - 1; i >= 0; i--) {
			ItemInfo item = items[i];
			itemsAsString.add(dateLongToString(item.getItEndingTime()) + ";"
					+ Float.toString(item.getItPrice()).replace('.', ',') + ";"
					+ item.getItId() + ";" + item.getItName());
		}
		return IOUtils.createFile(file, itemsAsString);
	}
}