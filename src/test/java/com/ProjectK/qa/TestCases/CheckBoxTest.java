package com.ProjectK.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ProjectK.qa.base.TestBase;
import com.ProjectK.qa.pages.CheckBox;
import com.ProjectK.qa.util.JiraCreateIssue;

public class CheckBoxTest extends TestBase{

	CheckBox checkBox;
	public CheckBoxTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		checkBox = new CheckBox();
	}
	
	@JiraCreateIssue(isCreateIssue = true)
	@Test(priority = 1)
	public void validateCheckBoxButtonTest() throws InterruptedException {
		checkBox.validateCheckBoxBtn();
		checkBox.validateExpandOpenIcon();
		checkBox.validateHomeCheckBox();
		checkBox.validateExpandOpenSubIcon();
		checkBox.validateExpandOpenSubIcon2();
		checkBox.validateDocumentsCheckBox();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
