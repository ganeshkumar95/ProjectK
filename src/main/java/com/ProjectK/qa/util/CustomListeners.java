package com.ProjectK.qa.util;

import java.io.IOException;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ProjectK.qa.base.TestBase;

public class CustomListeners extends TestBase implements ITestListener{

	//	belongs to ITestContext and will execute before starting of fsp test execution
	public void onStart(ITestContext arg) {
		System.out.println("Starts ProjectK Test Cases Execution...." + arg.getName());
	}

//	belongs to ITestContext and will execute after starting of fsp test execution
	public void onFinish(ITestContext arg) {
		System.out.println("Finishes ProjectK Test Cases Execution...." + arg.getName());
	}
	
//	belongs to ITestListeners and will execute before main test starts i.e @Test
	public void onTestStart(ITestResult arg0) {
		System.out.println("Starts ProjectK Test Cases Execution...." + arg0.getName());
	}

//	belongs to ITestListeners and will execute if fsp test execution skipped
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("Skipped ProjectK Test Cases Execution...." + arg0.getName());
	}
//	belongs to ITestListeners and will execute if sucession of fsp test execution
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Succeded ProjectK Test Cases Execution...." + arg0.getName());
	}

//	belongs to ITestResults and will execute if failure of fsp test execution
	public void onTestFailure(ITestResult arg0) {
		System.out.println("failure of ProjectK Test Cases Execution...." + arg0.getName());
		boolean islogIssue = arg0.getMethod().getConstructorOrMethod().getMethod().getAnnotation(JiraCreateIssue.class).isCreateIssue();
        if (islogIssue) {

		//Provide proper Jira project URL ex: https://browsertack.atlassian.net 
		
		//Jira User name ex: browserstack@gmail.com
		
		//API token copy from Jira dashboard ex: lorelimpusm12uijk
		
		//Project key should be, Short name ex: BS	
        //In case JIRA issue creation fails check for API Token in JIRA Account Setting under Security tab.
        //If token is not visible then create a new token and update below

         JiraServiceProvider JiraServiceProvider = new JiraServiceProvider("https://testmanagement.atlassian.net/",
                    "ganesh.poojary011@gmail.com", "0b0WTZ1oZ3x3gntt2e006CA1", "TES");
         String issueDescription = "Failure Reason from Automation Testing\n\n" + arg0.getThrowable().getMessage()+ "\n";
         issueDescription.concat(ExceptionUtils.getFullStackTrace(arg0.getThrowable()));
         String issueSummary = arg0.getMethod().getConstructorOrMethod().getMethod().getName()

                    + " Failed in Automation Testing";
        JiraServiceProvider.createJiraIssue("Bug", issueSummary, issueDescription, "Automated Testing");
	}
	}
public void onTestFailedButWithinSuccesspercentage(ITestResult arg0) {
	System.out.println("failure of ProjectK Test Cases Execution...." + arg0.getName());
	WebDriver driver=null;
	String testMethodName =arg0.getMethod().getMethodName();
	try {
		driver = (WebDriver)arg0.getTestClass().getRealClass().getDeclaredField("driver").get(arg0.getInstanceName());
	} catch (Exception e) {
	}
	try {
		takeScreenshotAtEndOfTest(testMethodName,driver);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	public void onTestFailedWithTimeout(ITestResult arg0) {

	}
}
