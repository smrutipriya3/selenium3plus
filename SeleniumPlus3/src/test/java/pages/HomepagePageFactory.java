package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//Intialize the elements from the class
public class HomepagePageFactory {

	WebDriver driver;
	
	//Locator for webelements
	@FindBy(name="userName") WebElement username;
	@FindBy(name="password") WebElement password;
	@FindBy(xpath="//input[@value='Login']") WebElement signin;
	
	//constructor
	
	public  HomepagePageFactory(WebDriver driver) {
		this.driver=driver;
	}
	
	//method
	public void enterun(String uid){
		username.sendKeys(uid);
	}
	public void enterpsd(String psd){
		password.sendKeys(psd);
	}
	public void clicklogin(){
		signin.click();
	}

}
