package amazon_Project1.Amazon1;
//verifying amazon login is successful with correct email and password 
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners (amazon_Project1.Amazon1.ListnerClass.class)
public class TestCase2 extends Launch_Quit
{
	@Test(retryAnalyzer=amazon_Project1.Amazon1.RetryLogic.class)
	public void LoginCorrect() throws EncryptedDocumentException, IOException
	{
		HomePage home = new HomePage(driver);
		home.Accountandlist(driver);
		home.signinclick();
		
		LoginPage login = new LoginPage(driver);
		login.Correctdetails();

	}
}
