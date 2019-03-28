package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Drivers.GetDriver;
import pages.HomepagePageFactory;

public class VerifyLoginPageFactory {
	WebDriver driver;
	HomepagePageFactory hpf;
	
  @Test
  public void f() throws InterruptedException {
	  driver=GetDriver.driverName("chrome");
	  driver.get("http://newtours.demoaut.com");
	 
	  hpf=PageFactory.initElements(driver, HomepagePageFactory.class);
	  
	  hpf.enterun("mercury");
	  hpf.enterpsd("mercury");
	  hpf.clicklogin();
	  Thread.sleep(2000);
	  driver.close();
	  
  }
}
