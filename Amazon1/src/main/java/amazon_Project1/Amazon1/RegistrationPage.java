package amazon_Project1.Amazon1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage 
{
	//step1
		@FindBy(id="ap_customer_name")
		WebElement Username;
		
		@FindBy(id="ap_phone_number")
		WebElement MobNumber;
		
		@FindBy (id="ap_password")
		WebElement password;
		
		@FindBy (id="continue")
		WebElement verifynumber;
		
		//step2
		public void Registration(WebDriver driver)
		{
			Username.sendKeys("Santosh Mhetre");
			MobNumber.sendKeys("8793925915");
			password.sendKeys("defalut123");
			verifynumber.click();
		}
		
		//step3
		public RegistrationPage (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
}
