package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class PayPalSignupPage extends ProjectMethods{
	
	public PayPalSignupPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(how=How.ID,using="country")
	private WebElement countrypp;
	
	public PayPalSignupPage enterCountrypp(String data) {
		selectDropDownUsingText(countrypp, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="email")
	private WebElement email;
	
	public PayPalSignupPage enterEmail(String data) {
		type(email,data);
		return this;
	}
	
	@FindBy(how=How.ID,using="password")
	private WebElement passwordPP;
	public  PayPalSignupPage enterPaypalPassword(String data) {
		type(passwordPP,data);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="confirmPassword")
	private WebElement confirmPasswordPP;
	public  PayPalSignupPage enterPaypalConfirmPassword(String data) {
		type(confirmPasswordPP,data);
		return this;
		
	}
	

}
