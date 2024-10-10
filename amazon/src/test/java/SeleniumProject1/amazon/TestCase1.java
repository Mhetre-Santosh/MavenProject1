package SeleniumProject1.amazon;

import org.testng.annotations.Test;

public class TestCase1 extends Launch_Quit 
{
	@Test
	public void Register()
	{
		HomePage home = new HomePage(driver);
		home.Accountandlist(driver);
		home.registrationclick();
		
		RegistrationPage user = new RegistrationPage(driver);
		user.Registration(driver);
		
	}
}
