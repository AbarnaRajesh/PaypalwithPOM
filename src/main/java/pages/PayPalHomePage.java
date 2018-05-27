package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.SeMethods;

public class PayPalHomePage extends SeMethods{
	
	public PayPalHomePage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="signup-button")
	public WebElement eleSignUp;
	
	public PayPalAccount clickonSignUp() {
		click(eleSignUp);
		return new PayPalAccount();
	}
	

}
