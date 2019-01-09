package testCases;

import org.testng.annotations.Test;

public class FourthDummyTest {

	@Test
	public void WebLoginHomeLone() {
		// Selenium code
		System.out.println("web login home");
	}
	
	@Test
	public void MobileLoginHomeLoan() {
		// Appium code
		System.out.println("mobile login home");
	}
	
	@Test(groups={"Smoke"})
	public void MobileLogoutHomeLoan() {
		// Appium code
		System.out.println("mobile logout home");
	}
	
	// timeOut will continue to try to execute test method for
	// specified time, only if it runs past specified time will
	// it fail
	@Test(timeOut=4000)
	public void MobileLoginHomeLoan2() {
		// Appium code
		System.out.println("mobile login home 2");
	}
	
	@Test
	public void MobileLogoutHomeLoan2() {
		// Appium code
		System.out.println("mobile logout home 2");
	}
	
	// enabled helper attribute will skip this test method
	@Test(enabled=false)
	public void LoginAPIHomeLoan() {
		// Rest API automation
		System.out.println("API login home");
	}
}
