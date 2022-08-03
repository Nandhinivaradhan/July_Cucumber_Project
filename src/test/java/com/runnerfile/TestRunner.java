package com.runnerfile;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass_methods.BaseClass_July;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\Adactin_Feature\\Login.feature",
				 glue = "com.stepdefinition",
				 monochrome = true,
				 strict = true,
				 //publish = true,
				 tags = {"@regression_run"},
				 plugin = {"html:Reports/Adactin",
						   //"pretty",
						   "json:Reports/Cucumber.json",
						   "com.cucumber.listener.ExtentCucumberFormatter:Reports/Final.html"
						 
						 
				 }
		
		)

public class TestRunner {
	
	public static WebDriver driver;
	
	//browser launch
	@BeforeClass
	public static void setUp() {
		driver=BaseClass_July.getBrowser("chrome");

	}
		
	//close
	@AfterClass
	public static void tearDown() {
		driver.close();

	}
	

}
