package amazon_Project1.Amazon1;
import org.testng.annotations.Listeners;
//checking if products can be sorted by relevance, price, rating, newest arrivals 
import org.testng.annotations.Test;
@Listeners (amazon_Project1.Amazon1.ListnerClass.class)
public class TestCase8 extends Launch_Quit 
{
	@Test(retryAnalyzer=amazon_Project1.Amazon1.RetryLogic.class)
	public void test8() throws InterruptedException 
	{
		HomePage home = new HomePage(driver);
		home.Seraching();
		SearchResultPage sort = new SearchResultPage(driver);
		sort.Sorting(driver);
	}
}  
