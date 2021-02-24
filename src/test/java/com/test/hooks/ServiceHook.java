package com.test.hooks;

import java.lang.invoke.MethodHandles;

import io.cucumber.java.Scenario;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.test.commonuties.CaptureScreenShot;
import com.test.commonuties.DeleteOldFile;
import com.test.webDriver.WebDriverManger;

import io.cucumber.java.After;
import io.cucumber.java.Before;




public class ServiceHook {
	
	WebDriver driver;
	CaptureScreenShot screenshot;
	DeleteOldFile delete;
	static Logger log = Logger.getLogger(MethodHandles.lookup().lookupClass());
	
	@Before
	
	public void initializeTest(Scenario scenario) {
		
		log.info("****************************************************************************");
		log.info("********************************BEGIN***************************************");
		log.info("****************************************************************************");
		log.info(scenario.getName().toString());
		driver = WebDriverManger.launchChrome();
		
	}
	
	@After
	
	public void endTest(Scenario scenario) throws Throwable {
		
		driver = WebDriverManger.getDriver();
		String screenShortName = scenario.getName().toString();
			
		if (scenario.isFailed()) {
			log.error("Scenario failed");
			screenshot = new CaptureScreenShot(driver);
			
			try {
				screenshot.capture(screenShortName);
			}catch (Exception e) {
				
				log.error("Error while capturing the screenshot");
			}
		}
		
		if (driver != null)
		{
			driver.quit();
		}
		
		log.info("****************************************************************************");
		log.info("********************************After***************************************");
		log.info("****************************************************************************");
	}
	
}
