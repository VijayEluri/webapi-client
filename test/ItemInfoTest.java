import junit.framework.TestCase;
import AllegroWebApi.ItemInfo;

public class ItemInfoTest extends TestCase {
	
	public void test1280557925() {
		String[] s = new String[] {
				"1280557925", // checked
				"NULL",
				"81.00", // checked
				"NULL",
				"89.00",
				"NULL",
				"NULL",
				"2010-10-23 20:44:58", // checked
				"0",
				"Psychologia i życie. ZIMBARDO (NOWE WYDANIE)", // checked
				"8",
				"13128314",
				"1",
				"NULL",
				"NULL",
				"0.00",
				"NULL",
				"NULL",
				"NULL",
				"NULL",
				"NULL",
				"K...9",
				"14",
				"1",
				"mgrzyska", // checked
				"2", // checked
				"1",
				"NULL",
				"NULL",
				"1073743872",
				"0",
				"NULL",
				"NULL",
				"NULL",
				"NULL",
				"NULL" 
		};
		
		ItemInfo item = AllegroWebApiClient.stringArrayToItemInfo(s);
		assertEquals(item.getItId(), 1280557925);
		assertEquals(item.getItPrice(), 81.00f);
		assertEquals(item.getItName(), "Psychologia i życie. ZIMBARDO (NOWE WYDANIE)");
		assertEquals(item.getItEndingTime(), AllegroWebApiClient.dateStringToLong("2010-10-23 20:44:58"));
		assertEquals(item.getItSellerLogin(), "mgrzyska");
		assertEquals(item.getItSellerRating(), 2);
		// TODO: check the others
	}
}
