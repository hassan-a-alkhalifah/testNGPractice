package testCases;
import org.testng.annotations.Test;

public class ThirdDummyTest {

	@Test(groups={"Smoke"})
	public void WebLoginCarLone() {
		// Selenium code
		System.out.println("web login car");
	}
	
	@Test
	public void MobileLoginCarLoan() {
		// Appium code
		System.out.println("mobile login car");
	}
	
	@Test(groups={"Smoke"})
	public void LoginAPICarLoan() {
		// Rest API automation
		System.out.println("API login car");
	}
}
