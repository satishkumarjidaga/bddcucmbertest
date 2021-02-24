package com.test.stepdefinations;

import java.lang.invoke.MethodHandles;

import org.apache.log4j.Logger;

import com.test.hooks.InitializeTest;
import com.test.pageactions.LoginPageActions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;


/**
 * Unit test for simple App.
 */
public class StepDef extends InitializeTest {
	static Logger log = Logger.getLogger(MethodHandles.lookup().lookupClass());
	LoginPageActions login = new LoginPageActions();
	
@Given("I want to login to gmail application")
public void i_want_to_login_to_gmail_application() {

   String url = conf.getConfigvalue("url");
	System.out.println("ssssssssssssssssssss"+url);
   driver.get(url);
   
   String userName = testData.getTestData("username");
   String password = testData.getTestData("password");
   login.login(userName,password);
   
}



}
