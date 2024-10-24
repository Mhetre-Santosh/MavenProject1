package amazon_Project1.Amazon1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends ExcelSheet
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
	public void Correctdetails() throws EncryptedDocumentException, IOException 
	{
		LoginData();
		username.sendKeys(usr);
		countinuebutton.click();
		password.sendKeys(pwd);
		signinsubmit.click();
	}

	public void InCorrectdetails() 
	{
		username.sendKeys(Incorrct_usr);
		countinuebutton.click();
		password.sendKeys(Incorrect_pwd);
		signinsubmit.click();
	}

	// step3
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

}
