package testCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestBase {

WebDriver driver = null;
	
	@Test
	public void Login() throws IOException {
		
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\zzmar_000\\Desktop\\IT_Related\\TestNG\\src\\testCases\\dataDrive.properties");
		props.load(fis);
		if(props.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
			driver = new ChromeDriver();
		} else if(props.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get(props.getProperty("url"));
	}
	
}
