package SeleniumProject1.amazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductPage 
{
	@FindBy(id="add-to-cart-button")
	WebElement Addcart;
	
	@FindBy(id="detailBullets_feature_div")
	WebElement productdescription;
	
	@FindBy(xpath="(//div[@class='a-section'])[6]")
	WebElement price;
	
	@FindBy(xpath="//div[@class='a-section a-spacing-none a-text-left aok-nowrap']")
	WebElement Reviews;
	
	public void childcontrol(WebDriver driver)
	{
		Set<String> s1  = driver.getWindowHandles();
		Iterator<String> i1= s1.iterator();
		String parentid = i1.next();
		String childid = i1.next();
		driver.switchTo().window(childid);
	}
	
	public void addtocartbutton()
	{
		Addcart.click();
	}
	
	public void checking()
	{
		Assert.assertEquals(productdescription.isDisplayed(), true,"Test case 1 is Fail");
		Assert.assertEquals(price.isDisplayed(), true,"Test case 2 is Fail");
		Assert.assertEquals(Reviews.isDisplayed(), true,"Test case 3 is Fail");
	}
	
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
