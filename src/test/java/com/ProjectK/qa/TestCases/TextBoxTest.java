package com.ProjectK.qa.TestCases;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ProjectK.qa.base.TestBase;
import com.ProjectK.qa.pages.TextBox;
import com.ProjectK.qa.util.JiraCreateIssue;
import com.ProjectK.qa.util.TestUtil;

public class TextBoxTest extends TestBase{

	TextBox textBox;
	String sheetName = "Testdata";
	public TextBoxTest(){
		
		super();
	}
	
	@DataProvider
	public Object[][] getprojectKTestData () {
		Object data [][] =TestUtil.getTestData(sheetName);
		return data;
	}
	@BeforeMethod
	public void setUp() throws Exception{
		initialization();
		textBox = new TextBox();
	}
	
	@JiraCreateIssue(isCreateIssue = true)
	@Test(priority = 1)
	public void validateTextBoxButtonTest() throws InterruptedException {
		textBox.validateTextBoxBtn();
		textBox.validateUserNameBox();
		textBox.validateEmailBox();
		textBox.validateCurrentAddressBox();
		textBox.validatePermAddressBox();
		textBox.validatesubmitBtn();
	}
	
	@Test(priority = 2 , dataProvider = "getprojectKTestData")
	public void dataDriventextBoxButtonTest(String Uname, String email, String cadress, String padress) throws InterruptedException {
		textBox.validateMultipleTestData(Uname, email, cadress, padress);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
