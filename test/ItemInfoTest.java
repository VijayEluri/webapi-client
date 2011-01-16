import webapi.client.AllegroWebApiClient;
import junit.framework.TestCase;
import AllegroWebApi.ItemInfo;

public class ItemInfoTest extends TestCase {
	
	public void test1280557925() {
		String[] s = new String[] {
				"1280557925", //0 checked
				"NULL", //1
				"81.00", //2 checked
				"NULL", //3
				"89.00", //4
				"NULL", //5
				"NULL", //6
				"2010-10-23 20:44:58", //7 checked
				"0", //8
				"Psychologia i życie. ZIMBARDO (NOWE WYDANIE)", //9 checked
				"8", //10 checked
				"13128314", //11
				"1", //12
				"NULL", //13
				"NULL", //14
				"0.00", //15
				"NULL", //16
				"NULL", //17
				"NULL", //18
				"NULL", //19
				"NULL", //20
				"K...9", //21
				"14", //22
				"1", //23
				"mgrzyska", //24 checked
				"2", //25 checked
				"1", //26
				"NULL", //27
				"NULL", //28
				"1073743872", //29
				"0", //30
				"NULL", //31
				"NULL", //32
				"NULL", //33
				"NULL", //34
				"NULL" //35
		};
		
		// [34]	pole zdezaktualizowane (zawsze będzie zwracać NULL),
		assertEquals("NULL", s[34]);
		// [35]	pole zdezaktualizowane (zawsze będzie zwracać NULL).
		assertEquals("NULL", s[35]);
		
		ItemInfo item = AllegroWebApiClient.stringArrayToItemInfo(s);
		assertEquals(item.getItId(), 1280557925);
		assertEquals(item.getItPrice(), 81.00f);
		assertEquals(item.getItName(), "Psychologia i życie. ZIMBARDO (NOWE WYDANIE)");
		assertEquals(item.getItEndingTime(), AllegroWebApiClient.dateStringToLong("2010-10-23 20:44:58"));
		assertEquals(item.getItSellerLogin(), "mgrzyska");
		assertEquals(item.getItSellerId(), 13128314);
		assertEquals(item.getItSellerRating(), 2);
		assertEquals(item.getItBidCount(), 8);
		assertEquals(item.getItHighBidderLogin(), "K...9");
		assertEquals(item.getItHighBidder(), 1073743872);
		
		// TODO: check the others
	}
}
