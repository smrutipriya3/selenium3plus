package Demo02;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class cookies {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\smruti.priya\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://google.com");
	  
	  Set<Cookie> cookies=driver.manage().getCookies();
	  System.out.println("1st Count of cookies:"+cookies.size());
	  
	  for(Cookie cookiedetails:cookies)
	  {
		  System.out.println("Cookie Name: "+cookiedetails.getName());
		  System.out.println("Cookie Value: "+cookiedetails.getValue());
		  System.out.println("Cookie Path: "+cookiedetails.getPath());
		  System.out.println("Cookie Domain: "+cookiedetails.getDomain());
	  }
	  
	  Cookie add= new Cookie("username", "Smruti");
	  driver.manage().addCookie(add);
	  Set<Cookie> cookies1=driver.manage().getCookies();
	  System.out.println("2nd Count of cookies:"+cookies1.size());
	  driver.quit();
  }
}
