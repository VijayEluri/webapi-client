import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for default package");
		//$JUnit-BEGIN$
		suite.addTestSuite(DateTimeConversionsTest.class);
		suite.addTestSuite(ItemInfoTest.class);
		//$JUnit-END$
		return suite;
	}

}
