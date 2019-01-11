package testCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ThirdDummyTest {
	
	@Test
	public void Login() throws IOException {
		
		// Use Properties class to gain access to load method
		// to load global variables
		Properties props = new Properties();
		// User FileInputStream to get access to global variables
		FileInputStream fis = new FileInputStream("C:\\Users\\zzmar_000\\Desktop\\IT_Related\\TestNG\\src\\testCases\\dataDrive.properties");
		props.load(fis);
		// User getProperty method to gain access of the value of
		// key username from the dataDrive global variables
		System.out.println(props.getProperty("username"));
	}

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
