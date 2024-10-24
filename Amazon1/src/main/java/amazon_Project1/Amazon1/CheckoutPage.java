package amazon_Project1.Amazon1;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckoutPage 
{
	@FindBy (id="addressChangeLinkId")
	WebElement AddressChange;
	
	@FindBy (xpath="(//input[@name='submissionURL'])[3]")
	WebElement Thired_addressSelect;
	
	@FindBy (id="payChangeButtonId")
	WebElement change;
	
	@FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[1]")
	WebElement debitcard;
	
	@FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[2]")
	WebElement creditcard;
	
	@FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[3]")
	WebElement Netbanking;
	
	@FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[4]")
	WebElement UPI;
	
	@FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[5]")
	WebElement EMI;
	
	@FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[6]")
	WebElement COD;
	
	@FindBy(name = "claimCode")
	WebElement Coupencode;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	WebElement apply;
	
	@FindBy(id = "revieworder")
	WebElement review_order_box;
	
	public void addresschange ()
	{
		AddressChange.click();
		Thired_addressSelect.click();
	}
	
	public void changebutton()
	{
		change.click();
	}
	
	public void selecltall_methods(WebDriver driver) 
	{
		try 
		{
		    if(debitcard.isEnabled() && debitcard.isDisplayed()) 
		    {
		    	debitcard.click();
				Assert.assertTrue(debitcard.isSelected(), "Debitcard option not selected");
		    }
		}
		catch (NoSuchElementException e) 
		{
		    System.out.println("Debitcard radio button is not present.");
		}
		
		try 
		{
		    if(creditcard.isEnabled() && creditcard.isDisplayed()) 
		    {
		    	creditcard.click();
				Assert.assertTrue(creditcard.isSelected(), "Creditcard option not selected");
		    }
		} 
		catch (NoSuchElementException e) 
		{
		    System.out.println("Creditcard radio button is not present.");
		}
		
		try 
		{
		    if(Netbanking.isEnabled() && Netbanking.isDisplayed()) 
		    {
		    	Netbanking.click();
				Assert.assertTrue(Netbanking.isSelected(), "Netbanking option not selected");
		    }
		} catch (NoSuchElementException e) 
		{
		    System.out.println("Netbanking radio button is not present.");
		}
		
		try 
		{
		    if(UPI.isEnabled() && UPI.isDisplayed()) 
		    {
		    	UPI.click();
				Assert.assertTrue(UPI.isSelected(), "UPI option not selected");
		    }
		} catch (NoSuchElementException e) {
		    System.out.println("UPI radio button is not present.");
		}
		
		try 
		{
		    if(EMI.isEnabled() && EMI.isDisplayed())
		    {
		    	EMI.click();
				Assert.assertTrue(EMI.isSelected(), "EMI option not selected");
		    }
		} catch (NoSuchElementException e)
		{
		    System.out.println("EMI radio button is not present.");
		}	
		try 
		{
		    if(COD.isEnabled() && COD.isDisplayed())
		    {
		    	COD.click();
				Assert.assertTrue(COD.isSelected(), "COD option not selected");
		    }
		} 
		catch (NoSuchElementException e)
		{
		    System.out.println("COD radio button is not present.");
		}	
	}
	
	public void applycoupencode()
	{
		Coupencode.sendKeys("AAAA-SSSS-BBBB-HHHH");
		apply.click();
	}
	
	public void check_review_order_box() {
		Assert.assertFalse(review_order_box.getText().isEmpty());
	}
	
	public CheckoutPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
}
