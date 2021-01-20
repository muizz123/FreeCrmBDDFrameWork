package com.FreeCRM.stepDefination;

import java.io.IOException;



import com.FreeCRM.pages.HomePage;
import com.FreeCRM.pages.LoginPage;
import com.qa.FreeCRM.base.TestBase;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class LoginPageSteps extends TestBase {

	LoginPage logingpage ;
	HomePage homePage;

	public LoginPageSteps() throws IOException {
		super();
		
	}

	
	@Given("User is in login Page")
	public void user_is_in_login_Page() {
		initilization();
	}

	@When("User enter user_name and password")
	public void user_enter_user_name_and_password() throws IOException {
	   logingpage = new LoginPage();
		homePage =  logingpage.login(pro.getProperty("userName"), pro.getProperty("password"));
		
	}

	@Then("User should be able to land on HomePage")
	public void user_should_be_able_to_land_on_HomePage() {
		String title = homePage.validatingHomePageTitle();
		Assert.assertEquals("CRMPRO", title);
	}

}
