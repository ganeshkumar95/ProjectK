package com.ProjectK.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ProjectK.qa.base.TestBase;
import com.ProjectK.qa.pages.BrokenLinkImages;

public class BrokenLinkImagesTest extends TestBase{

	BrokenLinkImages brokenLinks;
	
	public BrokenLinkImagesTest() {
		
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		brokenLinks = new BrokenLinkImages();
	}
	
	@Test
	public void validateBrokenLinksImg() throws InterruptedException {
		brokenLinks.validateBrokenLinkOption();
		brokenLinks.validateWorkingLink();
		brokenLinks.validateBrokenLink();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
}