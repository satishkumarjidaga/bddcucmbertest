package com.test.commonuties;



import java.lang.invoke.MethodHandles;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.test.hooks.InitializeTest;
 
public class EventHandler extends InitializeTest implements WebDriverEventListener {
 
	static Logger log = Logger.getLogger(MethodHandles.lookup().lookupClass());
    @Override
    public void afterAlertAccept(WebDriver arg0) {
        // TODO Auto-generated method stub
        System.out.println("After Alert Accept "+arg0.toString() );
    }
 
    @Override
    public void afterAlertDismiss(WebDriver arg0) {
        // TODO Auto-generated method stub
        System.out.println("After Alert Dismiss "+ arg0);
         
    }
 
    @Override
    public void afterChangeValueOf(WebElement arg0, WebDriver arg1,
            CharSequence[] arg2) {
        // TODO Auto-generated method stub
        System.out.println("After value change of" +arg0);
         
    }
 
    @Override
    public void afterClickOn(WebElement arg0, WebDriver arg1) {
        // TODO Auto-generated method stub
        System.out.println("After clicked"+arg0);
    }
 
    @Override
    public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
        // TODO Auto-generated method stub
        System.out.println("After Find By"+arg1);
         
    }
 
    @Override
    public void afterNavigateBack(WebDriver arg0) {
        // TODO Auto-generated method stub
        System.out.println("After Navigate Back");
    }
 
    @Override
    public void afterNavigateForward(WebDriver arg0) {
        // TODO Auto-generated method stub
        System.out.println("After Navigate Forward");
    }
 
    @Override
    public void afterNavigateRefresh(WebDriver arg0) {
        // TODO Auto-generated method stub
        System.out.println("On Navigating Refresh");
    }
 
    @Override
    public void afterNavigateTo(String url, WebDriver driver) {
        // TODO Auto-generated method stub
        log.info("Successfully Navigates to "+url);
         
    }
 
    @Override
    public void afterScript(String arg0, WebDriver arg1) {
        // TODO Auto-generated method stub
        System.out.println("After Script");
    }
 
    @Override
    public void beforeAlertAccept(WebDriver arg0) {
        // TODO Auto-generated method stub
        System.out.println("Before Alert Accept");
    }
 
    @Override
    public void beforeAlertDismiss(WebDriver arg0) {
        // TODO Auto-generated method stub
        System.out.println("Before Alert Dismiss");
    }
 
    @Override
    public void beforeChangeValueOf(WebElement arg0, WebDriver arg1,
            CharSequence[] arg2) {
        // TODO Auto-generated method stub
        System.out.println("Before Change Value of"+arg0);
    }
 
    @Override
    public void beforeClickOn(WebElement arg0, WebDriver arg1) {
        // TODO Auto-generated method stub
        System.out.println("Before Click on"+arg0);
    }
 
    @Override
    public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
        // TODO Auto-generated method stub
        System.out.println("Before Find By"+arg0);
    }
 
    @Override
    public void beforeNavigateBack(WebDriver arg0) {
        // TODO Auto-generated method stub
        System.out.println("Before Navigate Back");
    }
 
    @Override
    public void beforeNavigateForward(WebDriver arg0) {
        // TODO Auto-generated method stub
        System.out.println("Before Navigate Forward");
    }
 
    @Override
    public void beforeNavigateRefresh(WebDriver arg0) {
        // TODO Auto-generated method stub
        System.out.println("Before Navigate Refresh");
    }
 
    @Override
    public void beforeNavigateTo(String url, WebDriver driver) {
        // TODO Auto-generated method stub
        log.info("Trying to login"+url);
    }
 
    @Override
    public void beforeScript(String arg0, WebDriver arg1) {
        // TODO Auto-generated method stub
        System.out.println("Before Script");
    }
 
    @Override
    public void onException(Throwable arg0, WebDriver arg1) {
        // TODO Auto-generated method stub
        System.out.println("On Exception"+arg0);
    }

	@Override
	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeGetText(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterGetText(WebElement element, WebDriver driver, String text) {
		// TODO Auto-generated method stub
		
	}
 
}
