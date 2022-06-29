package com.ProjectK.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ProjectK.qa.base.TestBase;
import com.ProjectK.qa.pages.UploadDownload;

public class UploadDownloadTest extends TestBase{

	UploadDownload uploadDownload;
	
	public UploadDownloadTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		uploadDownload = new UploadDownload();
	}
	
	@Test
	public void validateUploadDownloadTest() throws InterruptedException {
		uploadDownload.validateUploadDownloadOption();
		uploadDownload.validateDownloadFile();
		uploadDownload.validateUploadFile();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
