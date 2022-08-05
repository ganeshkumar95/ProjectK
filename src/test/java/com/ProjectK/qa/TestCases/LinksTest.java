package com.ProjectK.qa.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ProjectK.qa.base.TestBase;
import com.ProjectK.qa.pages.HyperLinks;
import com.ProjectK.qa.util.JiraCreateIssue;

public class LinksTest extends TestBase{

	HyperLinks link;
	public LinksTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		
		initialization();
		link = new HyperLinks();
	}
	
	@JiraCreateIssue(isCreateIssue = true)
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
