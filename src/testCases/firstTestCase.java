package testCases;

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
	
	@Test
	public void SecondTest() {
		System.out.println("Good Bye");
	}

}
