package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	//Define all the Web elements in this page i.e. XPath/Locators
	
	By un=By.name("userName");
	By psd=By.name("password");
	By signin=By.name("login");
	By registerlink= By.linkText("REGISTER");
	
	//Constructor to intialize:
	
		public HomePage(WebDriver driver){
			this.driver=driver;
		}
	
	//Create Methods
	
	public void typeUsername(String uid) {
		
		driver.findElement(un).sendKeys(uid);
	}
	
	public void typePassword(String pass) {
		
		driver.findElement(psd).sendKeys(pass);
	}
	
	public void clickSignin() {
		
		driver.findElement(signin).click();;
	}
	
	public void clickRegister() {
		
		driver.findElement(registerlink).click();;
	}
	
	
	
	
}
