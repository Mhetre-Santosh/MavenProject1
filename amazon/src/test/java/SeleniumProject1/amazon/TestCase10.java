package SeleniumProject1.amazon;

import org.testng.annotations.Test;

public class TestCase10 extends Launch_Quit
{
	@Test
	public void quanityaddandremovefromcart() throws InterruptedException
	{
		HomePage home = new HomePage(driver);
		home.Seraching();
		SearchResultPage searchp = new SearchResultPage(driver);
		searchp.Clickproduct();
		ProductPage page = new ProductPage(driver);
		page.childcontrol(driver);
		page.addtocartbutton();
		CartPage cart = new CartPage(driver);
		cart.quanitity();
		Thread.sleep(10000);
		cart.Removefromcart();
	}
}
