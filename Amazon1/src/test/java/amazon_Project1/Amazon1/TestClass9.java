package amazon_Project1.Amazon1;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners (amazon_Project1.Amazon1.ListnerClass.class)
public class TestClass9 extends Launch_Quit
{
	@Test(retryAnalyzer=amazon_Project1.Amazon1.RetryLogic.class)
	public void addtocart()
	{
		HomePage home = new HomePage(driver);
		home.Seraching();
		SearchResultPage search = new SearchResultPage(driver);
		search.Clickproduct();
		ProductPage product = new ProductPage(driver);
		product.childcontrol(driver);
		product.addtocartbutton();
		product.verifyaddtocart();
				
	}
}
