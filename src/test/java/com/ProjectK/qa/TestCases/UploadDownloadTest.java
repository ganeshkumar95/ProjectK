package com.ProjectK.qa.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ProjectK.qa.base.TestBase;
import com.ProjectK.qa.pages.UploadDownload;
import com.ProjectK.qa.util.JiraCreateIssue;

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
	
	@JiraCreateIssue(isCreateIssue = true)
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
