import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import junit.framework.TestCase;
import webapi.IOUtils;
import webapi.LostAuctionsImporter;


public class LostAuctionsImporterTest extends TestCase{

	final String line1 = "2010-11-02;86,55;;";
	final String line2 = "2010-11-03;80;1297860816;1 uncja srebra 999, 2010r. -okazja!";
	final String line3 = "2010-11-03;87;1297860829;1 uncja srebra 999, 2010r. -okazja!";
	final String line4 = "2010-11-04;97;1291946580;SZWAJCARIA 1 UNCJA SREBRA 999 1997 Z CERTYFIKATEM";
	
	private LostAuctionsImporter importer;
	private List<File> filesToDelete;
	private Random r;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		r = new Random();
		importer = new LostAuctionsImporter();
		filesToDelete = new ArrayList<File>();
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		for (File file : filesToDelete) {
			assertTrue(file.delete());
			assertFalse(file.exists());
		}
	}
	
	public void testMerge() throws Exception {
		File oldFile = createFile(line1, line2, line3);
		File newFile = createFile(line4);
		importer.merge(oldFile, newFile);
		String[] lines = IOUtils.readLines(oldFile);
		assertEquals(4, lines.length);
		assertEquals(line1, lines[0]);
		assertEquals(line2, lines[1]);
		assertEquals(line3, lines[2]);
		assertEquals(line4, lines[3]);
	}
	
	public void testMergeDoubledLastLine() throws Exception {
		File oldFile = createFile(line1, line2, line3);
		File newFile = createFile(line3);
		importer.merge(oldFile, newFile);
		String[] lines = IOUtils.readLines(oldFile);
		assertEquals(3, lines.length);
		assertEquals(line1, lines[0]);
		assertEquals(line2, lines[1]);
		assertEquals(line3, lines[2]);
	}
	
	public void testMergeSameDayDifferentAuctions() throws Exception {
		File oldFile = createFile(line1, line2);
		File newFile = createFile(line3, line4);
		importer.merge(oldFile, newFile);
		String[] lines = IOUtils.readLines(oldFile);
		assertEquals(4, lines.length);
		assertEquals(line1, lines[0]);
		assertEquals(line2, lines[1]);
		assertEquals(line3, lines[2]);
		assertEquals(line4, lines[3]);
	}
	
	public void testMergeMixedAuctions() throws Exception {
		File oldFile = createFile(line3, line1);
		File newFile = createFile(line2, line4, line1);
		importer.merge(oldFile, newFile);
		String[] lines = IOUtils.readLines(oldFile);
		assertEquals(4, lines.length);
		assertEquals(line1, lines[0]);
		assertEquals(line2, lines[1]);
		assertEquals(line3, lines[2]);
		assertEquals(line4, lines[3]);
	}
	
	public void testMergeNoOldFile() throws Exception {
		File oldFile = new File("old.csv");
		filesToDelete.add(oldFile);
		File newFile = createFile(line3, line4);
		importer.merge(oldFile, newFile);
		String[] lines = IOUtils.readLines(oldFile);
		assertEquals(2, lines.length);
		assertEquals(line3, lines[0]);
		assertEquals(line4, lines[1]);
	}
	
	private File createFile(String...lines) throws IOException {
		long currentTimeMillis = System.currentTimeMillis();
		File file = new File(String.format("%d-%d.csv", currentTimeMillis, r.nextInt()));
		file = IOUtils.createFile(file, lines);
		filesToDelete.add(file);
		return file;
	}
}
