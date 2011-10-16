package webapi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IOUtils {
	
	public static File createFile(File file, List<String> list)
			throws IOException {
		File parent = file.getParentFile();
		if (!parent.exists())
			parent.mkdir();
		BufferedWriter out = new BufferedWriter(new FileWriter(file));
		for (Iterator<String> iter = list.iterator(); iter.hasNext(); ) {
			out.write(iter.next());
		    if (iter.hasNext())
		    	out.newLine();
		}
		out.close();
		return file;
	}
	
	public static File createFile(File file, String...lines) throws IOException {
		return createFile(file, Arrays.asList(lines));
	}
	
	public static String[] readLines(File file) throws IOException {
		if (!file.exists())
			return new String[0];
		BufferedReader in = new BufferedReader(new FileReader(file));
		List<String> result = new ArrayList<String>();
		String line;
		while ((line = in.readLine()) != null) {
			result.add(line);
		}
		in.close();
		return result.toArray(new String[0]);
	}
}
