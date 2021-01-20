package com.FreeCRM.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.FreeCRM.base.TestBase;

public class HomePage extends TestBase {
	ContactPage ContactPage;
	DealsPage  DealsPage ;
	
	@FindBy(xpath="//td[contains(text(),'User: Demo User')]")
	WebElement pageName;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contact;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement deals;

	
	public HomePage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}
	public String validatingHomePageTitle() {
		String homePageTitle = driver.getTitle();
		return homePageTitle;
		
	}
	public boolean pageNameVerification() {
		return pageName.isDisplayed();
	}
	
	public ContactPage clickOnContactLink() throws IOException {
		driver.switchTo().frame(1);
		contact.click();
		return new ContactPage();
	}
	
	public DealsPage clickOnDealsLink() throws IOException {
		deals.click();
		return new DealsPage();
	}

}
