package amazon_Project1.Amazon1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(amazon_Project1.Amazon1.ListnerClass.class)
public class TestCase11 extends Launch_Quit {

	@Test(retryAnalyzer=amazon_Project1.Amazon1.RetryLogic.class)
	public void paymentmethod() throws EncryptedDocumentException, IOException
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
		
		payment.check_review_order_box();
		payment.addresschange();
	}
}
