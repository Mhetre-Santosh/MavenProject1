package SeleniumProject1.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage 
{
	@FindBy(xpath="//span[@data-action='a-dropdown-button']")
	WebElement quantity;
	
	@FindBy(xpath="(//input[@value='2'])[2]")
	WebElement SelectQuantity;
	
	@FindBy (xpath="//button[@type='button']")
	WebElement Removingfromcart;
	
	@FindBy(name="proceedToRetailCheckout")
	WebElement checkout;
	
	public void quanitity()
	{
		quantity.click();
		SelectQuantity.click();
	}
	
	public void Removefromcart()
	{
		Removingfromcart.click();
	}
	
	public void proccedtobuy()
	{
		checkout.click();
	}
	
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
