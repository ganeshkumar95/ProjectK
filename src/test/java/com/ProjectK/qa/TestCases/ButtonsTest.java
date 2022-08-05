package com.ProjectK.qa.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ProjectK.qa.base.TestBase;
import com.ProjectK.qa.pages.Buttons;
import com.ProjectK.qa.util.JiraCreateIssue;

public class ButtonsTest extends TestBase{

	Buttons btn;
	public ButtonsTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		btn = new Buttons();
	}
	
	@JiraCreateIssue(isCreateIssue = true)
	@Test
	public void validateButtonsTest() throws InterruptedException {
		btn.validateButtonOption();
		btn.validateDoubleClickBtnOption();
		btn.validateRightClickBtnOption();
		btn.validateNormalClickBtnOption();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
