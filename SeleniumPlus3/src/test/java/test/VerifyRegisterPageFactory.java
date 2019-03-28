package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Demo02.CaptureScreen;
import Drivers.GetDriver;
import pages.RegisterPageFactory;

public class VerifyRegisterPageFactory {
	WebDriver driver;
	RegisterPageFactory rpf;
	
  @Test
  public void f() throws IOException, InterruptedException {
	  driver=GetDriver.driverName("chrome");
	  driver.get("http://newtours.demoaut.com");
	  
	  rpf=PageFactory.initElements(driver, RegisterPageFactory.class);
	  rpf.clickRegisterLink();
	  Thread.sleep(2000);
	  
	  rpf.enterFirstname("Smruti");
	  rpf.enterLastname("Priya");
	  rpf.enterPhone("112233");
	  rpf.enterEmail("spriya@email.com");
	  rpf.enterAddress1("G-7, Delhi");
	  rpf.enterCity("New Delhi");
	  rpf.enterState("Delhi");
	  rpf.enterPostalcode("110011");
	  rpf.enterCountry(3);
	  rpf.enterUsername("mercury");
	  rpf.enterPassword("mercury");
	  rpf.enterConfirmPassword("mercury");
	  
	  CaptureScreen.capturescreen(driver);
	  
	  rpf.clickRegister();
	  Thread.sleep(2000);
	  
	  
	  
	  driver.close();
	  
  }
}
