package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.SeMethods;

public class PayPalAccount extends SeMethods{
	
		
		public PayPalAccount() {
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(how=How.LINK_TEXT,using="Next")
		public WebElement elebtnNext;
		
		public PayPalSignupPage clickonbtnNext() {
			click(elebtnNext);
			return new PayPalSignupPage();
		}
		
		
		

}
