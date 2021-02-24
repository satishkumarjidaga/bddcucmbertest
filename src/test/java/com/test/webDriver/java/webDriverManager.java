package com.test.webDriver.java;

import java.io.File;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.test.commonuties.ConfigFileReader;

public class webDriverManager {

	static WebDriver driver;
	static String rootDirectory = System.getProperty("user.dir");
	static ConfigFileReader conf = new ConfigFileReader();
	static Logger log = Logger.getLogger(MethodHandles.lookup().lookupClass());
	public webDriverManager() {
		
		String browser = conf.getConfigvalue("browser");
		
		if(browser.contains("chrome"))
		launchChrome();
		
		else if(browser.contains("firefox"))
		launchFireFox();
		
		else 
			log.info("Please enter the browser");
		}

	

	public static WebDriver launchChrome() {
		
System.setProperty("webdriver.chrome.driver",rootDirectory + conf.getConfigvalue("chromedriverpath"));

String downloadFilepath = rootDirectory + File.separator + "Downloads";
HashMap<String, Object> chromePerfs = new HashMap<String, Object>();


chromePerfs.put("profile.default_content_setting.popups", 0);
chromePerfs.put("download.default_directors", downloadFilepath);
ChromeOptions options = new ChromeOptions();
options.setExperimentalOption("perfs", chromePerfs);
driver = new ChromeDriver(options);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
setDriver(driver);
		return driver;
	}

	public static WebDriver launchFireFox() {
		System.setProperty("webdriver.getcodriver.driver",rootDirectory + conf.getConfigvalue("iedriverpath"));	
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		setDriver(driver);
		
		return driver;
	}
	
	public static WebDriver getDriver() {
		return driver;
		
	}
	public static void setDriver(WebDriver driver) {
		webDriverManager.driver = driver;
	}
}
