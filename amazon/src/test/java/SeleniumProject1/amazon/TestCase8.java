package SeleniumProject1.amazon;

import org.testng.annotations.Test;

public class TestCase8 extends Launch_Quit 
{
	@Test
	public void test8()
	{
		HomePage home = new HomePage(driver);
		home.Seraching();
		SearchResultPage search = new SearchResultPage(driver);
		search.Sort();
	}
}  
