package SeleniumProject1.amazon;

import org.testng.annotations.Test;

public class TestCase7 extends Launch_Quit
{
	@Test
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
