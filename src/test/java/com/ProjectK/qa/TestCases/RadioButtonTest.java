package com.ProjectK.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ProjectK.qa.base.TestBase;
import com.ProjectK.qa.pages.RadioButton;

public class RadioButtonTest extends TestBase{
	
	RadioButton radioButton;
	public RadioButtonTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		radioButton = new RadioButton();
	}
	
	@Test(priority = 1)
	public void validateRadioButtonTest() throws InterruptedException {
		radioButton.validateRadioButtonOption();
		radioButton.validateYesRadioBtn();
		radioButton.validateImpressiveRadioBtn();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
