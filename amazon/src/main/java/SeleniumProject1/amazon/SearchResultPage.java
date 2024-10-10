package SeleniumProject1.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage
{
	WebDriver driver;

	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[75]")
	WebElement category_Shoe;
	
	@FindBy(id="p_36/range-slider_slider-item_lower-bound-slider")
	WebElement Lslider;
	
	@FindBy(xpath="(//span/a/div[@class='a-section aok-relative s-image-tall-aspect'])[5]")
	WebElement click;
	
	@FindBy(xpath="//span[@class='a-dropdown-label']")
	WebElement SortBy;
	
	@FindBy(id="s-result-sort-select_2")
	WebElement Hightolow;
	
	
	public void Filter()
	{
		category_Shoe.click();	
	}
	
	public void price (WebDriver driver)
	{
		Actions a1 = new Actions(driver);
		
				
	}
	
	public void Clickproduct()
	{
		click.click();
	}
	
	public void Sort()
	{
		SortBy.click();
		Hightolow.click();
	}
	
	public SearchResultPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
