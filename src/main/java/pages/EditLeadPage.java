package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods {
	
	public EditLeadPage() {
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(how=How.ID,using="updateLeadForm_firstName")
	WebElement eleEditFirstName;
	
	public EditLeadPage editFirstName(String data) {
		type(eleEditFirstName,data);
		return this;
	}
	
	@FindBy(how=How.NAME,using="submitButton")
	WebElement eleUpdateButton;
	
	public ViewLeadPage clickUpdateButton() {
		click(eleUpdateButton);
		return new ViewLeadPage();
	}
	

}
