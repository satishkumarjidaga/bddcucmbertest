package com.test.webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiter {
	WebDriver driver;
	static WebDriverWait wait;
	public Waiter(WebDriver driver) {
	
		this.driver = driver;
		wait = new WebDriverWait(driver,45);
	}

	public void waitForWebElement(WebElement element) {
		wait.until(ExpectedConditions.visibilityOfAllElements((element)));
	}

	
	public void waitForWebElement(By element) {
		wait.until(ExpectedConditions.visibilityOfElementLocated((element)));
	}

	

}
