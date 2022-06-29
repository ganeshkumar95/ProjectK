package com.ProjectK.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ProjectK.qa.base.TestBase;

public class UploadDownload extends TestBase{

	//Initialization
	@FindBy(xpath="//span[text()='Upload and Download']")
	WebElement uploadDownloadOpt;
	
	@FindBy(id = "downloadButton")
	WebElement downloadFile;
	
	@FindBy(id = "uploadFile")
	WebElement uploadFile;
		
	public UploadDownload() {
		PageFactory.initElements(driver, this);
	}
	
	public void validateUploadDownloadOption() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", uploadDownloadOpt);
		//uploadDownloadOpt.click();
		Thread.sleep(3000);
	}
	
	public void validateDownloadFile() throws InterruptedException {	
		downloadFile.click();
		Thread.sleep(3000);
	}
	
	public void validateUploadFile() throws InterruptedException {
		uploadFile.sendKeys(prop.getProperty("uploadFile"));
		Thread.sleep(3000);
	}
}
