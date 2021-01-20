package com.FreeCRM.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.FreeCRM.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath="//input[@name='username']")
	WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginButton;
	
	@FindBy(xpath="//a[@class='navbar-brand']")
	WebElement logo;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement signBtn;

	public LoginPage() throws IOException {
		
		PageFactory.initElements(driver, this);
		
	}
	//Actions
	public String validatingLogingPage() {
		return driver.getTitle();
	}
	
	public boolean validatingLogoImage() {
		return logo.isDisplayed();
	}
	
	public HomePage login(String un,String ps) throws IOException {
		userName.sendKeys(un);
		password.sendKeys(ps);
		signBtn.click();
		
		return new HomePage();
		
	}
}
