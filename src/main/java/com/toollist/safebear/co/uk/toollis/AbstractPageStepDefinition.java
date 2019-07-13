package com.toollist.safebear.co.uk.toollis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class AbstractPageStepDefinition {
	
	protected static WebDriver driver;
	 protected WebDriver getDriver() {
		if(driver == null) {
			driver = new ChromeDriver();
			//driver = new FirefoxDriver();
			//driver = new OperaDriver();

		
			
		}
		return driver;
	}

}