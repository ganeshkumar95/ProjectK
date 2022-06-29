package com.ProjectK.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ProjectK.qa.base.TestBase;

public class BrokenLinkImages extends TestBase{

	//Initialization
	@FindBy(xpath="//span[text()='Broken Links - Images']")
	WebElement brokenLinkOption;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/a[1]")
	WebElement workingLink;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/a[2]")
	WebElement brokenLink;
	
	public BrokenLinkImages() {
		PageFactory.initElements(driver, this);
	}
	
	public void validateBrokenLinkOption() throws InterruptedException {
		brokenLinkOption.click();
		Thread.sleep(2000);
	}
	
	public void validateWorkingLink() throws InterruptedException {
		workingLink.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(5000);
		
	}
	
	public void validateBrokenLink() throws InterruptedException , IllegalStateException{
		brokenLink.click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
	}
}
