package com.test.hooks;

import org.openqa.selenium.WebDriver;

import com.test.commonuties.ConfigFileReader;
import com.test.commonuties.TestDataReader;
import com.test.webDriver.Waiter;
import com.test.webDriver.WebDriverManger;

public class InitializeTest {
	
	static String rootDirctory = System.getProperty("user.dir");
	public ConfigFileReader conf;
	public WebDriver  driver;
	public TestDataReader testData;
	public Waiter wait;
	public LoginPage login;
	
	public InitializeTest() {
		
		conf = new ConfigFileReader();
		driver = WebDriverManger.getDriver();
		testData = new TestDataReader();
		wait = new Waiter(driver);
		login = new LoginPage(driver);
	}
}
