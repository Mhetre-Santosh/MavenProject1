package SeleniumProject1.amazon;

import org.testng.annotations.Test;

public class TestCase6 extends Launch_Quit
{
	@Test
	public void filter() 
	{
		HomePage home = new HomePage(driver);
		home.Seraching();
		SearchResultPage searchp = new SearchResultPage(driver);
		searchp.Filter();
	}
}
