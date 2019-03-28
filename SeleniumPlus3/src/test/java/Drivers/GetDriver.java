package Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDriver {
	static WebDriver driver;
	
	public static WebDriver driverName(String browsername) {
		
			if (browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\smruti.priya\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			  driver = new ChromeDriver();
			}
			/*else if(browsername.equals("firefox")){
					System.setProperty("webdriver.gecko.driver","C:\\Users\\saranya.a.shanmugam\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
					  driver=new FirefoxDriver();
			}*/
				
				
			return driver;

		}
	}

