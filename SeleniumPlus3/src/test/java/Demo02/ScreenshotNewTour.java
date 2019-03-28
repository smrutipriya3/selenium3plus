package Demo02;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotNewTour {
	WebDriver driver;
	
	  @Test
	  public void f() throws InterruptedException, IOException {
		  
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\smruti.priya\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://newtours.demoaut.com/");
		  
		  try {
			  
			  driver.findElement(By.name("username")).sendKeys("mercury");
			  
		  }catch(Exception e)
		  {
			  System.out.println(e.getMessage());
			  CaptureScreen.capturescreen(driver);
		  }
		  
		  try {
			  
			  driver.findElement(By.name("password")).sendKeys("pass2222");
			  
		  }catch(Exception e)
		  {
			  System.out.println(e.getMessage());
			  CaptureScreen.capturescreen(driver);
		  }
		 
		  try {
			  
			  driver.findElement(By.name("logi")).click();
			  
		  }catch(Exception e)
		  {
			  System.out.println(e.getMessage());
			  CaptureScreen.capturescreen(driver);
		  }
		 
	  }
}
