package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class RegisterPageFactory {
	WebDriver driver;
	
	//constructor
	public RegisterPageFactory(WebDriver driver){
		this.driver=driver;
		}
	
	//Webelements
	@FindBy(how=How.LINK_TEXT, using="REGISTER") WebElement registerlink;
	
	@FindBy(xpath="//input[@name='firstName']") WebElement firstname;
	@FindBy(xpath="//input[@name='lastName']") WebElement lastname;
	@FindBy(xpath="//input[@name='phone']") WebElement phone;
	@FindBy(xpath="//input[@name='userName']") WebElement email;
	@FindBy(xpath="//input[@name='address1']") WebElement address1;
	@FindBy(xpath="//input[@name='city']") WebElement city;
	@FindBy(xpath="//input[@name='state']") WebElement state;
	@FindBy(xpath="//input[@name='postalCode']") WebElement postalcode;
	@FindBy(xpath="//select[@name='country']") Select country;
	
	@FindBy(xpath="//input[@name='email']") WebElement username;
	@FindBy(xpath="//input[@name='password']") WebElement password;
	@FindBy(xpath="//input[@name='confirmPassword']") WebElement confirmPassword;
	@FindBy(xpath="//input[@name='register']") WebElement register;
	
	//Methods
    public void clickRegisterLink() {
    	registerlink.click();
	}
    
    public void enterFirstname(String s){
    	firstname.sendKeys(s);
	}
    
    public void enterLastname(String s){
    	lastname.sendKeys(s);
	}
    
    public void enterPhone(String s){
    	phone.sendKeys(s);
	}
    
    public void enterEmail(String s){
    	email.sendKeys(s);
	}
    
    public void enterAddress1(String s){
    	address1.sendKeys(s);
	}
    
    public void enterCity(String s){
    	city.sendKeys(s);
	}
    
    public void enterState(String s){
    	state.sendKeys(s);
	}
    
    public void enterPostalcode(String s){
    	postalcode.sendKeys(s);
	}
    
    public void enterCountry(int n){
    	try {
    	     country.selectByIndex(n);
    		 //country.selectByVisibleText("AUSTRIA");
    	}catch(Exception e) {
    		System.out.println("SMRUTI Error message:"+e.getMessage());
    	}
	}
    
    public void enterUsername(String s){
    	username.sendKeys(s);
	}
    
    public void enterPassword(String s){
    	password.sendKeys(s);
	}

    
    public void enterConfirmPassword(String s){
    	confirmPassword.sendKeys(s);
	}
    

	public void clickRegister(){
		register.click();
	}
}


