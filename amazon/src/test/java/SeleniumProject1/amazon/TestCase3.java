package SeleniumProject1.amazon;

import org.testng.annotations.Test;

public class TestCase3 extends Launch_Quit
{
	@Test
	public void LoginCorrect()
	{
		HomePage home = new HomePage(driver);
		home.Accountandlist(driver);
		home.signinclick();
		
		LoginPage login = new LoginPage(driver);
		login.InCorrectdetails();

	}
}
