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
	
	@Test
	public void MobileLoginHomeLoan2() {
		// Appium code
		System.out.println("mobile login home 2");
	}
	@Test
	public void MobileLogoutHomeLoan2() {
		// Appium code
		System.out.println("mobile logout home 2");
	}
	
	@Test
	public void LoginAPIHomeLoan() {
		// Rest API automation
		System.out.println("API login home");
	}
}
