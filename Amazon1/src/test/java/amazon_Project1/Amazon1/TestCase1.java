package amazon_Project1.Amazon1;
//Testing an amazon, a new user can successfully register or not
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners (amazon_Project1.Amazon1.ListnerClass.class) 
public class TestCase1 extends Launch_Quit 
{
	@Test(retryAnalyzer=amazon_Project1.Amazon1.RetryLogic.class)
	public void Register()
	{
		HomePage home = new HomePage(driver);
		home.Accountandlist(driver);
		home.registrationclick();
		
		RegistrationPage user = new RegistrationPage(driver);
		user.Registration(driver);
		
	}
}
