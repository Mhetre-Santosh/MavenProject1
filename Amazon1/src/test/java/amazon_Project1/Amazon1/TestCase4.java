package amazon_Project1.Amazon1;
//checking if a user can successfully edit their profile informations on amazon
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners (amazon_Project1.Amazon1.ListnerClass.class)
public class TestCase4 extends Launch_Quit
{
	@Test(retryAnalyzer=amazon_Project1.Amazon1.RetryLogic.class)
	public void edit () throws EncryptedDocumentException, IOException
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
