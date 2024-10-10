package SeleniumProject1.amazon;

import org.testng.annotations.Test;

public class TestCase4 extends Launch_Quit
{
	@Test
	public void edit ()
	{
		HomePage home = new HomePage(driver);
		home.Accountandlist(driver);
		home.signinclick();
		
		LoginPage login = new LoginPage(driver);
		login.Correctdetails();	
		
		home.Accountandlist(driver);
		home.MangeProfile();
		
	}
}
