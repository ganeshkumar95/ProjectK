package com.ProjectK.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ProjectK.qa.base.TestBase;
import com.ProjectK.qa.pages.Buttons;

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
