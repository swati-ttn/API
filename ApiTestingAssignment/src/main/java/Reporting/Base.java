package Reporting;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Base {

	
	@BeforeTest
	public void startReport() {
		// initialize the HtmlReporter
		
	}

	@AfterMethod
	public void getResult(ITestResult result) {
		
	}

	@AfterTest
	public void tearDown() {
		// to write or update test information to reporter
		
	}
}
