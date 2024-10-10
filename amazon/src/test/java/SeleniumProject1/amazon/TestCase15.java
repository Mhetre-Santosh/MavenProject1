package SeleniumProject1.amazon;

import org.testng.annotations.Test;

public class TestCase15 extends Launch_Quit
{
	@Test
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
