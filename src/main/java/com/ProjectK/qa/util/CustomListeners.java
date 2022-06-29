package com.ProjectK.qa.util;

import java.io.IOException;

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
