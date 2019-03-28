package Demo02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionSearchTextTest1 {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\smruti.priya\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com/");
	  
	  //Assert.assertTrue(driver.getTitle().contains("Demo Web Shop"));
	  WebElement search=driver.findElement(By.xpath("//input[@value='Search store']"));
	  search.sendKeys("computer");

	  Actions act=new Actions(driver);
	  
	  act.moveToElement(search).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
	  Thread.sleep(5000);
	  
	  WebElement text=driver.findElement(By.name("q"));
	  System.out.println(text.getText());
	  Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Search");
	  
  }
}
