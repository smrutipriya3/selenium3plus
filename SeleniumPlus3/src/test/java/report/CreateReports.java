package report;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Demo02.CaptureScreen2;
import Drivers.GetDriver;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class CreateReports {
	
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	
  @Test
  public void f() throws IOException {
	  driver=GetDriver.driverName("chrome");
	  driver.get("http://newtours.demoaut.com");
	  //String title=driver.getTitle();
	  
	 if( driver.getTitle().contains("Welcome: Mercury Tours1"))
	 {
		test.log(LogStatus.PASS, "If you have navigated to Homepage successfully.");
	 }
	 else 
	 {
		// test.log(LogStatus.FAIL, "There is some issue with the URLs.");
		 test.log(LogStatus.FAIL, test.addScreenCapture(CaptureScreen2.capturescreen(driver)+"Test Failed"));
	 }
  }
  
  @BeforeClass
  public void beforeClass() {
	  report=new ExtentReports("C:\\Users\\smruti.priya\\Sel-Screenshots\\Reports\\Selenium_report.html",false);
	  test=report.startTest("CreateReports");  
  }

  @AfterClass
  public void afterClass() {
	  report.endTest(test);
	  report.flush();//have to add this  otherwise report will not be created.
	  driver.close();
  }
  

}
