package com.test.webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.commonuties.ConfigFileReader;

public class Actions {
	
	WebDriver driver;
	WebDriverWait wait;
	ConfigFileReader conf = new ConfigFileReader();
	
	Long waitTime = Long.parseLong(conf.getConfigvalue("explicitWait"));
	
	public Actions(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, waitTime);
		
	}

	public void switchToFrame(WebElement element) {
		
		driver.switchTo().frame(element);
		
	}
	
public void switchToDefault() {
		
		driver.switchTo().defaultContent();
		
	}
	
	
}
