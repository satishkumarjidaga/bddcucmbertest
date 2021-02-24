package com.test.pageactions;

import java.lang.invoke.MethodHandles;

import org.apache.log4j.Logger;

import com.test.hooks.InitializeTest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class LoginPageActions extends InitializeTest {

static Logger log = Logger.getLogger(MethodHandles.lookup().lookupClass());
public void login(String UserName , String Password) {
	
	wait.waitForWebElement(login.lnkSignin);
	wait.waitForWebElement(login.email);
	wait.waitForWebElement(login.paswrod);
	login.email.sendKeys(UserName);
	login.paswrod.sendKeys(Password);
	
	
	log.info("username [" + UserName + "] and password [" + Password + ") Entered");;
	login.button.submit();


}

}
