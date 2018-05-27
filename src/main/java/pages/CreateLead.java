package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods {
	
	public CreateLead() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	public WebElement eleCmpName;
	
	
	
	public CreateLead enterCompanyName(String data) {
		type(eleCmpName,data);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	public WebElement eleFirstName;
	
	
	
	public CreateLead enterFirstName(String data) {
		type(eleFirstName,data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	public WebElement eleLastName;
	
	
	
	public CreateLead enterLastName(String data) {
		type(eleLastName,data);
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	public WebElement elecreate;
	
	
	
	public ViewLeadPage createSubmit() {
		click(elecreate);
		return new ViewLeadPage();		
	}
	
}
