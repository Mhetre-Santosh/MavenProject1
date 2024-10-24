package amazon_Project1.Amazon1;
import org.testng.annotations.Listeners;
//Ensure product detail page displayed Price,Review,Description
import org.testng.annotations.Test;
@Listeners (amazon_Project1.Amazon1.ListnerClass.class)
public class TestCase7 extends Launch_Quit
{
	@Test(retryAnalyzer=amazon_Project1.Amazon1.RetryLogic.class)
	public void test7()
	{
		HomePage home = new HomePage(driver);
		home.Seraching();
		SearchResultPage search = new SearchResultPage(driver);
		search.Clickproduct();
		ProductPage product = new ProductPage(driver);
		product.childcontrol(driver);
		product.checking();
		
	}
}
