package com.ProjectK.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ProjectK.qa.base.TestBase;

public class GetUsers extends TestBase{

	@FindBy(xpath = "//div[@data-key='endpoints']//li[1]")
	WebElement getUser;
	
	public GetUsers() {
		PageFactory.initElements(driver, this);
	}
	
	public void validateGetUsers() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getUser);
		Thread.sleep(500); 
		getUser.click();
		Thread.sleep(2000);
	}
}
