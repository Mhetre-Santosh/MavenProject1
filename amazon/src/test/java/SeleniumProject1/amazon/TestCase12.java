package SeleniumProject1.amazon;

import org.testng.annotations.Test;

public class TestCase12 extends Launch_Quit
{
	@Test
	public void paymentmethod()
	{
		HomePage home = new HomePage(driver);
		home.Seraching();
		
		SearchResultPage searchp = new SearchResultPage(driver);
		searchp.Clickproduct();
		
		ProductPage page = new ProductPage(driver);
		page.childcontrol(driver);
		page.addtocartbutton();
		
		CartPage cart = new CartPage(driver);
		cart.proccedtobuy();
		
		LoginPage login = new LoginPage(driver);
		login.Correctdetails();
		
		CheckoutPage payment= new CheckoutPage(driver);
		payment.changebutton();
		payment.selecltall_methods(driver);

	}
}
