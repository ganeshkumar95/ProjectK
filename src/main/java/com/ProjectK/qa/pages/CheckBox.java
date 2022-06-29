package com.ProjectK.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ProjectK.qa.base.TestBase;

public class CheckBox extends TestBase{

	//Initialising Page Objects
		@FindBy(xpath = "//span[text() = 'Check Box']")
		WebElement checkboxoption;
		
		@FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/span/button")
		WebElement expandOpenIcon;
		
		@FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/span/label/span[1]")
		WebElement homeCheckBox;
		
		@FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/button")
		WebElement expandOpenSubIcon;
		
		@FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/span/button")
		WebElement expandOpenSubIcon2;
		
		@FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/label/span[1]")
		WebElement documents;
		
		//Instantiate Page Object
		public CheckBox() {
			PageFactory.initElements(driver, this);
		}
		
		public void validateCheckBoxBtn() throws InterruptedException {
			checkboxoption.click();
			Thread.sleep(2000);
		}
		public void validateExpandOpenIcon() throws InterruptedException {
			expandOpenIcon.click();
			Thread.sleep(2000);
		}
		public void validateHomeCheckBox() throws InterruptedException {
			homeCheckBox.click();
			Thread.sleep(2000);
		}
		public void validateExpandOpenSubIcon() throws InterruptedException {
			expandOpenSubIcon.click();
			Thread.sleep(2000);
		}
		public void validateExpandOpenSubIcon2() throws InterruptedException {
			expandOpenSubIcon2.click();
			Thread.sleep(2000);
		}
		public void validateDocumentsCheckBox() throws InterruptedException {
			documents.click();
			Thread.sleep(2000);
		}
}
