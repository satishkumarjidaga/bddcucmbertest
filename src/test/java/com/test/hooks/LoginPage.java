package com.test.hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class LoginPage{
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(how = How.LINK_TEXT, using = "//a[contains(text(),'Sign in')]")
	
	public WebElement lnkSignin;
		
	
	
	@FindBy(how = How.ID, using = "email")
	
	public WebElement email;
		
@FindBy(how = How.ID, using = "pasword")
	
	public WebElement paswrod;

@FindBy(how = How.ID, using = "SubmitLogin")

public WebElement button;
}
