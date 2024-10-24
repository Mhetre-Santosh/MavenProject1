package amazon_Project1.Amazon1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
@Listeners (amazon_Project1.Amazon1.ListnerClass.class) 
public class Launch_Quit 
{
	static WebDriver driver;
	@BeforeMethod
	public void launchBrowser_AMZHome()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		//driver.quit();
	}
}
