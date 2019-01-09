package testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class firstTestCase {

	// TODO Auto-generated method stub
	@Test
	// TestNG doesn't require Java complier to run test cases
	// Any method below @Test will be treated as a test case 
	//with TestNG
	public void Demo() {
		System.out.println("Hello World");
	}
	
	// By adding a second @Test, this is treated as a second
	// test case. Every @Test with new method is treated as a
	// new test case
	
	// dependsOnMethods is basically saying that SecondTest
	// method depends on Demo method, so run Demo method first
	// then run SecondTest method
	// You can depend on multiple methods as well:
	// @Test(dependsOnMethods={"testMethod1","testMethod2"})
	@Test(dependsOnMethods= {"Demo"})
	public void SecondTest() {
		System.out.println("Good Bye");
	}
	
	@BeforeTest
	// Runs before all test cases within test folder(test module)
	// scope
	public void prerequiste() {
		System.out.println("I will execute first");
	}
	
	@AfterTest
	// Runs after all test cases within test folder(test module)
	// scope
	public void lastExecution() {
		System.out.println("I will execute last");
	}
	
	@BeforeSuite
	// Runs before suite which contains all test cases
	public void BfSuite() {
		System.out.println("I will execute before suite");
	}
	
	@AfterSuite
	// Runs after suite which contains all test cases
	public void AfSuite() {
		System.out.println("I will execute aefore suite");
	}
	
	@BeforeMethod
	// Runs before each test method with in test case scope
	public void BfMethod() {
		System.out.println("I will execute before each method");
	}
	
	@AfterMethod
	// Runs after each test method with in test case scope
	public void AfMethod() {
		System.out.println("I will execute after each method");
	}
	
	@BeforeClass
	// Run before class
	public void BfClass() {
		System.out.println("I will execute before class");
	}
	
	@AfterClass
	// Runs after class
	public void AfClass() {
		System.out.println("I will execute after class");
	}

}
