package SeleniumProject1.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrdersPage 
{
	WebDriver driver;
	@FindBy(xpath="//span[@role='button']")
	WebElement year;
	
	@FindBy (id="time-filter_3")
	WebElement choose2023;
	
	@FindBy(id="Write-a-product-review_6")
	WebElement reviewbutton;
	
	@FindBy (xpath="(//div/button/img[@alt='select to rate item five star.'])[2]")
	WebElement Fivestar;
	
	public void chooseyear()
	{
		year.click();
		choose2023.click();
		reviewbutton.click();
		Fivestar.click();
	}
	
	public OrdersPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
