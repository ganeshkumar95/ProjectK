package com.ProjectK.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ProjectK.qa.base.TestBase;
import com.ProjectK.qa.pages.DynamicProperties;

public class DynamicPropertiesTest extends TestBase {

DynamicProperties dynamicProperties;
	
	public DynamicPropertiesTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		dynamicProperties = new DynamicProperties();
	}
	
	@Test
	public void validateUploadDownloadTest() throws InterruptedException {
		dynamicProperties.validateDynamicPropertiesOption();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
