package Demo02;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class ActionDragAndDropTest1 {
	WebDriver driver;
	
  @Test
  public void f() {
	  //Switch to Frame(whenever any element is not found)
	  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	  WebElement drag= driver.findElement(By.id("draggable")) ;
	  WebElement drop= driver.findElement(By.id("droppable")) ;
	  
	  Actions act1=new Actions(driver);
	  act1.dragAndDrop(drag, drop).perform();
	  //using clickAndHold and Release -2 operations so build() is must needed
	  //sact1.clickAndHold(drag).release(drop).build().perform();    
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\smruti.priya\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://jqueryui.com/droppable/");
  }

  @AfterMethod
  public void afterMethod() {
  }

}
