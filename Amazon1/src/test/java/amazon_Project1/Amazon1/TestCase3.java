package amazon_Project1.Amazon1;
import org.testng.annotations.Listeners;
//verifying amazon login is failing with incorrect email id or wrong password 
import org.testng.annotations.Test;
@Listeners (amazon_Project1.Amazon1.ListnerClass.class)
public class TestCase3 extends Launch_Quit
{
	@Test(retryAnalyzer=amazon_Project1.Amazon1.RetryLogic.class)
	public void LoginCorrect()
	{
		HomePage home = new HomePage(driver);
		home.Accountandlist(driver);
		home.signinclick();
		
		LoginPage login = new LoginPage(driver);
		login.InCorrectdetails();

	}
}
