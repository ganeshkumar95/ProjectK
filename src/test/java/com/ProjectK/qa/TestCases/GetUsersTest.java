package com.ProjectK.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ProjectK.qa.base.TestBase;
import com.ProjectK.qa.pages.GetUsers;
import com.ProjectK.qa.util.JiraCreateIssue;

public class GetUsersTest extends TestBase{

	GetUsers getuser;
	
	public GetUsersTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws Exception{
		initialization();
		getuser = new GetUsers();
	}
	
	@JiraCreateIssue(isCreateIssue = true)
	@Test(priority = 1)
	public void validateUsers() throws InterruptedException {
		getuser.validateGetUsers();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
