package amazon_Project1.Amazon1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchResultPage
{
	WebDriver driver;

	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[73]")
	WebElement category_Shoe;
	

	@FindBy(linkText="adidas")
	WebElement brands;
		
	@FindBy(linkText="10% Off or more")
	WebElement discount;
	
	@FindBy (xpath="//i[@class='a-icon a-icon-checkbox']")
	WebElement Deliveryday;
	
	@FindBy(xpath="(//span/a/div[@class='a-section aok-relative s-image-tall-aspect'])[5]")
	WebElement click;
	
	@FindBy(xpath="//span[@class='a-dropdown-label']")
	//@FindBy(id="s-result-sort-select_0")
	WebElement SortBy;
	
	@FindBy(id="s-result-sort-select_1")
	WebElement LowtoHigh;
	
	@FindBy(id="s-result-sort-select_2")
	WebElement Hightolow;
	
	@FindBy(id="s-result-sort-select_3")
	WebElement CustomerReview;
	
	@FindBy(id="s-result-sort-select_4")
	WebElement NewestArrivals;
	
	@FindBy(id="s-result-sort-select_5")
	WebElement BestSeller;
	
	public void Filter()
	{
		Deliveryday.click();
		category_Shoe.click();	
		brands.click();
		discount.click();
	}
	
	public void Clickproduct()
	{
		click.click();
	}

	public void Sorting(WebDriver driver) 
	{
		SortBy.click();
		LowtoHigh.click();
		
		driver.navigate().back();
		SortBy.click();
		Hightolow.click();
		
		driver.navigate().back();
		SortBy.click();
		CustomerReview.click();
		
		driver.navigate().back();
		SortBy.click();
		NewestArrivals.click();
		
		driver.navigate().back();
		SortBy.click();
		BestSeller.click();
	}
	
	public SearchResultPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
