package testcases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.PayPalHomePage;
import wdMethods.ProjectMethods;

public class TC007_PayPal extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC007_PayPal";
		testDescription="SignUp to PayPal page";
		testNodes="L";
		category="Smoke";
		authors="Gopi";
		browserName="chrome";
		dataSheetName="TC001_PP";

}
	@Test(dataProvider="fetchData")
	public void SignUp(String cntrypp,String emailpp,String pwdpp,String cnfrmpwdpp) {
		new PayPalHomePage()
		.clickonSignUp()
		.clickonbtnNext()
		.enterCountrypp(cntrypp)
		.enterEmail(emailpp)
		.enterPaypalPassword(pwdpp)
		.enterPaypalConfirmPassword(cnfrmpwdpp);
	}
}
		
		
