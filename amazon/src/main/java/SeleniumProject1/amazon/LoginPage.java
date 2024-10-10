package SeleniumProject1.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;

	// Step = 1
	@FindBy(id = "ap_email")
	WebElement username;

	@FindBy(id = "continue")
	WebElement countinuebutton;

	@FindBy(id = "ap_password")
	WebElement password;

	@FindBy(id = "signInSubmit")
	WebElement signinsubmit;

	// Step = 2
	public void Correctdetails() 
	{
		username.sendKeys("mhetre340@gmail.com");
		countinuebutton.click();
		password.sendKeys("Santosh@123");
		signinsubmit.click();
	}

	public void InCorrectdetails() 
	{
		username.sendKeys("mhetre140@gmail.com");
		countinuebutton.click();
		password.sendKeys("Santosh@23");
		signinsubmit.click();
	}

	// step3
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

}
