package SeleniumProject1.amazon;

import org.testng.annotations.Test;

public class TestCase14 extends Launch_Quit
{
	@Test
	public void GiveFivestartrating()
	{
		HomePage home = new HomePage(driver);
		home.Accountandlist(driver);
		home.signinclick();
		
		LoginPage login = new LoginPage(driver);
		login.Correctdetails();
		
		home.Accountandlist(driver);
		home.orders();
		OrdersPage order = new OrdersPage(driver);
		order.chooseyear();
		
	}
}
