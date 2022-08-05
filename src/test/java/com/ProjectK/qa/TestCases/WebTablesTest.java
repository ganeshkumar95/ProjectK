package com.ProjectK.qa.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ProjectK.qa.base.TestBase;
import com.ProjectK.qa.pages.WebTables;
import com.ProjectK.qa.util.JiraCreateIssue;

public class WebTablesTest extends TestBase{

	WebTables webTables;
	public WebTablesTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		webTables = new WebTables();
	}
	
	@JiraCreateIssue(isCreateIssue = true)
	@Test
	public void validateWebTablesButtonTest() throws InterruptedException {
		webTables.validateawebTablesOption();
		webTables.validateaddNewRecordBtn();
		webTables.validateRegistrationFormFields();
		webTables.validateSubmitBtn();
		webTables.validateRecordEditBtn();
		webTables.validateUpdateForm();
		webTables.validateSearchBox();
		webTables.validateRecordDeleteBtn();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
