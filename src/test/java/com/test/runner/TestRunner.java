package com.test.runner;


import com.test.hooks.ServiceHook;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "resource/features"
 ,glue={"com.test.stepdefinitions", "com.test.hooks.ServiceHook"}
 )
 
public class TestRunner {
 
}