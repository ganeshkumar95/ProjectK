package com.ProjectK.qa.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ProjectK.qa.base.TestBase;

public class HyperLinks extends TestBase{
	
	String oldTab = driver.getWindowHandle();

	//Initialization
	@FindBy(xpath = "//span[text() = 'Links']")
	WebElement linkBtn;
	
	@FindBy(id= "simpleLink")
	WebElement simpleLink;
	
	@FindBy(id="dynamicLink")
	WebElement dynamicLink;
	
	@FindBy(id="created")
	WebElement created;
	
	@FindBy(id="no-content")
	WebElement noContent;
	
	@FindBy(id="moved")
	WebElement moved;
	
	@FindBy(id="bad-request")
	WebElement badRequest;
	
	@FindBy(id="unauthorized")
	WebElement unauthorized;
	
	@FindBy(id="forbidden")
	WebElement forbidden;
	
	@FindBy(id="invalid-url")
	WebElement invalidUrl;
	
	public HyperLinks() {
		PageFactory.initElements(driver, this);
	}
	
	public void validateLinksBtn() throws InterruptedException {
		
		linkBtn.click();
		Thread.sleep(2000);
	}
	
	public void validateSimpleLink() throws InterruptedException {
		simpleLink.click();
		Thread.sleep(8000);
	    ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
	    newTab.remove(oldTab);
	    // change focus to new tab
	    driver.switchTo().window(newTab.get(0));

	    driver.close();
	    // change focus back to old tab
	    driver.switchTo().window(oldTab);
	    Thread.sleep(8000);
	}
	
	public void validateDynamicLink() throws InterruptedException {
		dynamicLink.click();
		Thread.sleep(8000);
	    ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
	    newTab.remove(oldTab);
	    // change focus to new tab
	    driver.switchTo().window(newTab.get(0));

	    driver.close();
	    // change focus back to old tab
	    driver.switchTo().window(oldTab);
	    Thread.sleep(8000);
	}
	
	public void validateCreatedApi() throws InterruptedException {
		
		created.click();
		Thread.sleep(3000);
	}
	
	public void validateNoContentApi() throws InterruptedException {
		
		noContent.click();
		Thread.sleep(3000);
	}
	
	public void validateMovedContentApi() throws InterruptedException {
		moved.click();
		Thread.sleep(3000);
	}
	
	public void validateBadRequestApi() throws InterruptedException {
		badRequest.click();
		Thread.sleep(3000);
	}
	
	public void validateUnauthorizedApi() throws InterruptedException {
		unauthorized.click();
		Thread.sleep(3000);
	}
	
	public void validateForbiddenApi() throws InterruptedException {
		forbidden.click();
		Thread.sleep(3000);
	}
	
	public void validateInvalidApi() throws InterruptedException {
		invalidUrl.click();
		Thread.sleep(3000);

	}
}
