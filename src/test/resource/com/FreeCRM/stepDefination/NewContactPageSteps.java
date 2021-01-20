package com.FreeCRM.stepDefination;

import java.io.IOException;

import com.FreeCRM.pages.ContactPage;
import com.FreeCRM.pages.HomePage;
import com.FreeCRM.pages.LoginPage;
import com.qa.FreeCRM.base.TestBase;

import io.cucumber.java.en.*;

public class NewContactPageSteps extends TestBase {

	LoginPage logingpage;
	HomePage homePage;
	ContactPage contactPage;

	public NewContactPageSteps() throws IOException {
		super();

	}

	@Given("User is in Home page")
	public void user_is_in_Home_page() throws IOException {
		initilization();
		logingpage = new LoginPage();
		homePage =  logingpage.login(pro.getProperty("userName"), pro.getProperty("password"));
	}

	@When("User Click The Contact link")
	public void user_Click_The_Contact_link() throws IOException {
		homePage.clickOnContactLink();
	}

	@Then("User should be able to Land On Contact Page")
	public void user_should_be_able_to_Land_On_Contact_Page() {
	    System.out.println("user in contact page");
	}


}
