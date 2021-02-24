package com.test.webDriver;

import java.io.File;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.test.commonuties.ConfigFileReader;

import edu.emory.mathcs.backport.java.util.concurrent.TimeUnit;

public class WebDriverManger {
	
	static WebDriver driver;
	static String rootDirectory = System.getProperty("user.dir");
	static ConfigFileReader conf = new ConfigFileReader();
	static Logger log = Logger.getLogger(MethodHandles.lookup().lookupClass());
	
	
	public WebDriverManger() {
		
		String browser = conf.getConfigvalue("browser");
		if(browser.contains("chrome"))
			launchChrome();
		else if (browser.contains("FireFox"))
			
			lauchFirefox();
		
		else 
			log.info( "Please enter the browser  name in config file");
	}


	

	public  static WebDriver launchChrome() {
		System.setProperty("webdriver.chrome.driver", rootDirectory + conf.getConfigvalue("chromedriverpath"));
		
		String downloadFilepath = rootDirectory + File.separator + "Downloadds";
		
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		
		chromePrefs.put("profile.default_directory", 0);
		chromePrefs.put("download.default_directory",  downloadFilepath);
		
		ChromeOptions options = new ChromeOptions();
		
		options.setExperimentalOption("prefs", chromePrefs);
		
		driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		setDriver(driver);
		
		return driver;
		// TODO Auto-generated method stub
		
	}
	
	public  static WebDriver lauchFirefox() { 
		
		System.setProperty("webdriver.getko.driver", rootDirectory + conf.getConfigvalue("firefoxdriverpath"));

				driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		setDriver(driver);
		return driver;
		// TODO Auto-generated method stub
		
	}

	public static void setDriver(WebDriver driver2) {
		// TODO Auto-generated method stub
		WebDriverManger.driver = driver;
	}


	public  static WebDriver getDriver() { 
		return driver;
		// TODO Auto-generated method stub
		
	}

	
}
