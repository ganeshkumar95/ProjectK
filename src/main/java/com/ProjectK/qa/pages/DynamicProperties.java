package com.ProjectK.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ProjectK.qa.base.TestBase;

public class DynamicProperties extends TestBase{

	//Initialization
	@FindBy(xpath="//span[text()='Dynamic Properties']")
	WebElement dynamicProperties;
	
	public DynamicProperties() {
		PageFactory.initElements(driver, this);
	}
	
	public void validateDynamicPropertiesOption() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click()", dynamicProperties);
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(3000);
		dynamicProperties.click();
		Thread.sleep(8000);
	}
	
}
