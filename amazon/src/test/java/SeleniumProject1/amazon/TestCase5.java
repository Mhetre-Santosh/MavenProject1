package SeleniumProject1.amazon;

import org.testng.annotations.Test;

public class TestCase5 extends Launch_Quit
{
	@Test
	public void SearchingProduct ()
	{
		HomePage home = new HomePage(driver);
		home.Seraching();
	}
}
