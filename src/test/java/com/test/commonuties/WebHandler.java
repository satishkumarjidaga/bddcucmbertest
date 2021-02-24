package com.test.commonuties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.test.webDriver.WebDriverManger;


public class WebHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=WebDriverManger.launchChrome();
		
		EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
		EventHandler handler = new EventHandler();
		
		eventDriver.register(handler);
		
		eventDriver.get("http://toolsqa.com/automation-practice-switch-windows/");
		WebElement element  = eventDriver.findElement(By.id("target"));
		element.click();
		;
	}

}
