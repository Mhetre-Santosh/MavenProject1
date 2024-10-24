package amazon_Project1.Amazon1;
import org.testng.annotations.Listeners;
//verifying that searching with filters yields accurate results
import org.testng.annotations.Test;
@Listeners (amazon_Project1.Amazon1.ListnerClass.class)
public class TestCase6 extends Launch_Quit
{
	@Test(retryAnalyzer=amazon_Project1.Amazon1.RetryLogic.class)
	public void filter() 
	{
		HomePage home = new HomePage(driver);
		home.Seraching();
		SearchResultPage searchp = new SearchResultPage(driver);
		searchp.Filter();
	}
}
