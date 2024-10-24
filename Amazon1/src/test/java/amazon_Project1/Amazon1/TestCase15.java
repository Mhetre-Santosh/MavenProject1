package amazon_Project1.Amazon1;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners (amazon_Project1.Amazon1.ListnerClass.class)
public class TestCase15 extends Launch_Quit
{
	@Test(retryAnalyzer=amazon_Project1.Amazon1.RetryLogic.class)
	public void addcartwithoutlogin()
	{
		HomePage home = new HomePage(driver);
		home.Seraching();
		SearchResultPage searchp = new SearchResultPage(driver);
		searchp.Clickproduct();
		ProductPage page = new ProductPage(driver);
		page.childcontrol(driver);
		page.addtocartbutton();
	}
}
