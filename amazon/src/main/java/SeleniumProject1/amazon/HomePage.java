package SeleniumProject1.amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage 
{

	WebDriver driver;
	// step1
	@FindBy(id = "nav-link-accountList")
	WebElement acoountandlist;

	@FindBy(linkText = "Start here.")
	WebElement Starthere;
	
	@FindBy(xpath="(//span[.='Sign in'])[1]")
	WebElement signinbutton;
	
	@FindBy(xpath="//a[.='Your Account']")
	WebElement Youraccount;
	
	@FindBy(xpath="(//h2[@class='a-spacing-none ya-card__heading--rich a-text-normal'])[4]")
	WebElement Youraddress;
	
	@FindBy(xpath="(//a[@class='a-link-normal'])[8]")
	WebElement Changeaddress;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchbox;
	
	//@FindBy (xpath="(//span[@class='nav-text'])[12]")
	@FindBy(xpath="//span[.='Your Orders']")
	WebElement Yourorders;

	// step2
	public void Accountandlist(WebDriver driver) 
	{
		Actions a1 = new Actions(driver);
		a1.moveToElement(acoountandlist).perform();
		Assert.assertEquals(driver.getTitle(),
				"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in",
				"Sorry test case got failed please check again");
	}

	public void registrationclick() 
	{
		Starthere.click();
	}
	
	public void signinclick()
	{
		signinbutton.click();
	}
	
	public void MangeProfile() 
	{
		Youraccount.click();
		Youraddress.click();
		Changeaddress.click();
	}
	
	public void Seraching ()
	{
		Assert.assertEquals(searchbox.isDisplayed(), true,"Sorry message");
		searchbox.sendKeys("Shoe"+Keys.ENTER);
	}
	
	public void orders()
	{
		Yourorders.click();
	}
	
	//step3
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
