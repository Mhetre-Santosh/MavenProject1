package amazon_Project1.Amazon1;
import org.testng.annotations.Listeners;
//testing, searching for products using its name like Shoe 
import org.testng.annotations.Test;
@Listeners (amazon_Project1.Amazon1.ListnerClass.class)
public class TestCase5 extends Launch_Quit
{
	@Test(retryAnalyzer=amazon_Project1.Amazon1.RetryLogic.class)
	public void SearchingProduct ()
	{
		HomePage home = new HomePage(driver);
		home.Seraching();
	}
}
