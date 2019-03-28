package Demo02;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class javaScriptExecutor {
	WebDriver driver;
	
  @Test
  public void f() throws IOException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\smruti.priya\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://newtours.demoaut.com/");
	  driver.manage().window().maximize();
	 
	  
		//Java script to perform Scrol down- window.scrollby(x,y)
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		CaptureScreen.capturescreen(driver);
	  
		//Java script to Highlight Field
	  	WebElement un= driver.findElement(By.name("userName"));
	  	js.executeScript("arguments[0].value='mercury'",un);
	  	//Java script to Highlight Field
	  	js.executeScript("arguments[0].style.border='2px dotted red'",un);
	  	CaptureScreen.capturescreen(driver);  
			  
	  driver.quit();
  }
}
