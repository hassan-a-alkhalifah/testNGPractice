package testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FourthDummyTest {
	
	// dataProvider take return values from getData method 
	// and gives test method available parameters to
	// utilize. As the return value is a multidimensional
	// array, the test method will run multiple times
	// based on the array length
	@Test(dataProvider="getData")
	public void WebLoginHomeLone(String userName, String password) {
		// Selenium code
		System.out.println("web login home");
		System.out.println(userName);
		System.out.println(password);
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
	// Runs test with multiple set data
	@DataProvider
	public Object[][] getData() {
		//1st combo - username password - good credit history
		//2nd combo - username password - no credit history
		//3rd combo - username password - fraud credit history
		//This is a multidimensional array
		Object[][] data = new Object[3][2];
		// 1st combo
		data[0][0]="firstsetusername";
		data[0][1]="firstsetpassword";
		// 2nd combo
		data[1][0]="secondsetusername";
		data[1][1]="secondsetpassword";
		// 3rd combo
		data[2][0]="thirdsetusername";
		data[2][1]="thirdsetpassword";
		
		return data;
	}
}
