package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
    WebDriver driver;
    public LandingPage(WebDriver driver	)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    	
    
    }
    
	@FindBy(id="userEmail")
	WebElement useremail;
	
	@FindBy(id="userPassword")
	WebElement password;
	
	@FindBy(id="login")
	WebElement submit;
	
	public void LoginApplication(String email, String Password)
	{
		useremail.sendKeys();;
		password.sendKeys();
		submit.click();
		
		
		
	}
	public void goTo()
	{
		
		driver.get("https://rahulshettyacademy.com/client/");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
