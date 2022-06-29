package com.ProjectK.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ProjectK.qa.base.TestBase;
import com.ProjectK.qa.pages.HyperLinks;

public class LinksTest extends TestBase{

	HyperLinks link;
	public LinksTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
		initialization();
		link = new HyperLinks();
	}
	
	@Test
	public void validateLinksTest() throws InterruptedException {
		link.validateLinksBtn();
		link.validateSimpleLink();
		link.validateDynamicLink();
		link.validateCreatedApi();
		link.validateNoContentApi();
		link.validateMovedContentApi();
		link.validateBadRequestApi();
		link.validateUnauthorizedApi();
		link.validateForbiddenApi();
		link.validateInvalidApi();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
