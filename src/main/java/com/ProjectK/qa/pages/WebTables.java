package com.ProjectK.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ProjectK.qa.base.TestBase;

public class WebTables extends TestBase {

	//Initializing Page Object
		@FindBy(xpath="//span[text() = 'Web Tables']")
		WebElement webTablesOption;
		
		@FindBy(id = "addNewRecordButton")
		WebElement addRecord;
		
		//Registration Form Fields
		@FindBy(id = "firstName")
		WebElement firstName;
		
		@FindBy(id = "lastName")
		WebElement lastName;
		
		@FindBy(id = "userEmail")
		WebElement userEmail;
		
		@FindBy(id = "age")
		WebElement age;
		
		@FindBy(id = "salary")
		WebElement salary;
		
		@FindBy(id = "department")
		WebElement department;
		
		@FindBy(id = "submit")
		WebElement submitBtn;
		
		//Search Box
		@FindBy(id = "searchBox")
		WebElement searchBox;
		
		//Edit Record
		@FindBy(id = "edit-record-4")
		WebElement editRecordBtn;
		
		//Delete Record
		@FindBy(id = "delete-record-4")
		WebElement deleteRecordBtn;
		
		public WebTables() {
			PageFactory.initElements(driver, this);
		}
		
		public void validateawebTablesOption() throws InterruptedException {
			webTablesOption.click();
			Thread.sleep(2000);
		}
		
		public void validateaddNewRecordBtn() throws InterruptedException {
			addRecord.click();
			Thread.sleep(2000);
		}
		
		public void validateRegistrationFormFields() {
			firstName.sendKeys(prop.getProperty("firstname"));
			lastName.sendKeys(prop.getProperty("lastname"));
			userEmail.sendKeys(prop.getProperty("useremail"));
			age.sendKeys(prop.getProperty("age"));
			salary.sendKeys(prop.getProperty("salary"));
			department.sendKeys(prop.getProperty("department"));
		}
		
		public void validateSubmitBtn() throws InterruptedException {
			submitBtn.click();
			Thread.sleep(2000);
		}
		
		public void validateSearchBox() throws InterruptedException{
			searchBox.sendKeys(prop.getProperty("firstname"));
			Thread.sleep(2000);
		}
		
		public void validateRecordEditBtn() throws InterruptedException {
			editRecordBtn.click();
			Thread.sleep(2000);
		}
		
		public void validateUpdateForm() throws InterruptedException {
			lastName.clear();
			lastName.sendKeys(prop.getProperty("updateLastname"));
			validateSubmitBtn();
		}
		
		public void validateRecordDeleteBtn() throws InterruptedException {
			searchBox.clear();
			Thread.sleep(5000);
			deleteRecordBtn.click();
		}
		
}
