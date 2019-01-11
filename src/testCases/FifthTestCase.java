package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

public class FifthTestCase extends TestBase{

	@Test
	public void OpeningBrowser() throws IOException {
		// This opens the browser
		Login();
		System.out.println("Executing opening browser");
	}
}
