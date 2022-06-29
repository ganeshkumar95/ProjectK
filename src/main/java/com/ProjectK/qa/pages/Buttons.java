package com.ProjectK.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ProjectK.qa.base.TestBase;

public class Buttons extends TestBase{
	
	public Actions act = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;

	//Initializing Page Object
	@FindBy(xpath="//span[text() = 'Buttons']")
	WebElement buttonsOption;
	
	@FindBy(id="doubleClickBtn")
	WebElement doubleClickBtnoption;
	
	@FindBy(id="rightClickBtn")
	WebElement rightClickBtnOption;
	
	@FindBy(xpath = "(//button[@type='button'])[4]")
	WebElement normalClickBtnOption;
	
	public Buttons() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void validateButtonOption() throws InterruptedException {
		buttonsOption.click();
		Thread.sleep(2000);
	}
	
	public void validateDoubleClickBtnOption() throws InterruptedException {
		//Double click on element
		act.doubleClick(doubleClickBtnoption).perform();
		Thread.sleep(3000);
	}
	
	public void validateRightClickBtnOption() throws InterruptedException {
			//Right click on element
		act.contextClick(rightClickBtnOption).perform();;
		Thread.sleep(3000);
	}
	
	public void validateNormalClickBtnOption() throws InterruptedException {
		normalClickBtnOption.click();
		Thread.sleep(3000);
	}
}
