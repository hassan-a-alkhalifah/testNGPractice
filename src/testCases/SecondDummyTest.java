package testCases;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SecondDummyTest {
	// passing parameters url and userName from test suite within testng.xml
	@Parameters({"url", "userName"})
	@Test(groups={"Smoke"})
	public void testCase(String urlname, String userName) {
		System.out.println("Dummy testcase");
		System.out.println(urlname);
		System.out.println(userName);
	}
}
