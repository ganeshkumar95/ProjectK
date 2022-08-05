package com.ProjectK.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Optional;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.devtools.v94.network.Network;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.OutputType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	static JavascriptExecutor js;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream input = new FileInputStream(
					"/home/ganesh/eclipse-workspace/ProjectK/src/main/java/com/ProjectK/qa/config/config.properties");
			prop.load(input);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	//browser initialization
	public static void initialization() {
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(prop.getProperty("url"));
		
		//using driver instance we are getting dev tools and then we are creating session.
		DevTools devTool = ((HasDevTools) driver).getDevTools();
		devTool.createSession();
		
		//Capturing Network Request and Response
		//we invoke the send() method to enable the Network
		devTool.send(Network.enable(Optional.empty(), Optional.empty(),Optional.empty()));
		
		//A listener is added to listen to all the requests made by the application. 
    	//For each request captured by the application we then extract the URL,HTTP Method and headers.
		devTool.addListener(Network.requestWillBeSent(), requestSent -> {

			System.out.println("Request URL => " + requestSent.getRequest().getUrl());
	
			System.out.println("Request Method => " + requestSent.getRequest().getMethod());
	
			System.out.println("Request Headers => " + requestSent.getRequest().getHeaders().toString());
	
			System.out.println("-------------------------------------------------");

		});
		//A listener is added to listen to all the response made by the application. 
    	//For each response captured by the application we then extract the Response Body, Status, and Headers.
		devTool.addListener(Network.responseReceived(), responseReceieved -> {

             System.out.println("Response Body => " + devTool.send(Network.getResponseBody(responseReceieved.getRequestId())).getBody());

             System.out.println("Response Status => " + responseReceieved.getResponse().getStatus());

             System.out.println("Response Headers => " + responseReceieved.getResponse().getHeaders().toString());

             System.out.println("Response MIME Type => " + responseReceieved.getResponse().getMimeType().toString());

             System.out.println("------------------------------------------------------");

       });

	}
	
	public static void takeScreenshotAtEndOfTest(String testCaseName,WebDriver driver) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir")+"\\screenshots\\"+testCaseName+".png";
		FileUtils.copyFile(scrFile, new File(currentDir));

	}
	
	
}
