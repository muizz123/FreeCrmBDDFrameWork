package com.FreeCRM.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.FreeCRM.base.TestBase;

public class ContactPage extends TestBase {

	@FindBy(xpath="//td[contains(text(),'You can use ')]")
	WebElement tableName;
	
	public ContactPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickCheckBox() {
		driver.findElement(By.xpath("//a[contains(text(),'amit')]//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@type='checkbox']")).click();
	}
	public boolean findTableName() {
		return tableName.isDisplayed();
	}
}
