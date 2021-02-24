package com.test.commonuties;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class CaptureScreenShot {
	
	static WebDriver driver;
	static String userDir = System.getProperty("user.dir");
	
	public CaptureScreenShot() {
		CaptureScreenShot.driver=driver;
		
	}
	public CaptureScreenShot(WebDriver driver) {
		CaptureScreenShot.driver = driver;
	}
	public static File makeDir() {
		
		File screenShortPath = new File(userDir + File.separator + "ScreenShot");
		
		if(!screenShortPath.exists()) {
			screenShortPath.mkdirs();
			
		}
		
		return screenShortPath;
		
	}
	
	public static void capture(String name) {
		try {
			
			File sourcepath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			File destinationPath = new File(makeDir() + File.separator + name + ".png");
			Files.copy(sourcepath, destinationPath);
		}
		catch (IOException e){
			
		}
	}

}
