package com.ProjectK.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ProjectK.qa.base.TestBase;

public class RadioButton extends TestBase{
	
	//Initializing Page Object
	@FindBy(xpath="//span[text() = 'Radio Button']")
	WebElement radioButtonoption;
	
	@FindBy(xpath = "//*[@id=\"yesRadio\"]")
	WebElement yesRadioBtn;
	
	@FindBy(xpath = "//*[@id='impressiveRadio']")
	WebElement impressiveRadioBtn;

	public RadioButton() {
		PageFactory.initElements(driver, this);
	}
	
	public void validateRadioButtonOption() throws InterruptedException {
		radioButtonoption.click();
		Thread.sleep(2000);
	}
	
	public void validateYesRadioBtn() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", yesRadioBtn);
		Thread.sleep(2000);

	}
	
	public void validateImpressiveRadioBtn() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", impressiveRadioBtn);
		Thread.sleep(2000);

	}
}
