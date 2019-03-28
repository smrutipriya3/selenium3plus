package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Demo02.CaptureScreen;
import Drivers.GetDriver;
import pages.HomePage;


public class VerifyLogin {
	WebDriver driver;
	
  @Test
  public void f() throws IOException {
	  driver=GetDriver.driverName("chrome");
	  driver.get("http://newtours.demoaut.com");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  HomePage hp=new HomePage(driver);
	  
	  hp.typeUsername("mercury");
	  hp.typePassword("mercury");
	  hp.clickSignin();
	  CaptureScreen.capturescreen(driver);
	  driver.close();

	  
  }
}
