package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.baseclass_methods.BaseClass_July;
import com.helpherfile.FileReadManager;
import com.pojo_pom.PageObjectManager;
import com.runnerfile.TestRunner;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Adactin_StepDefinition extends BaseClass_July {
	 public static  WebDriver driver= TestRunner.driver;
	 public static PageObjectManager pom=new PageObjectManager(driver);
	 
	 @Before
	 public void beforeHooks(Scenario s) {
		String name = s.getName();
		System.out.println("Scenario Name: " +name);
	}
	 
	 @After
	 public void afterHooks(Scenario s) {
		String status = s.getStatus();
		System.out.println("Scenario Status: " +status);
	
	}
	 
	 
	@Given("^User is launch the application$")
	public void user_is_launch_the_application() throws Throwable {
		
		
		getUrl("https://adactinhotelapp.com/");
	}
	

	@When("^User is enter the \"([^\"]*)\" in username field$")
	public void user_is_enter_the_in_username_field(String arg1) throws Throwable {
	    inputText(pom.getInstanceLp().getUsername(), arg1);
	}

	@And("^User is enter the \"([^\"]*)\" in password field$")
	public void user_is_enter_the_in_password_field(String arg1) throws Throwable {
	    inputText(pom.getInstanceLp().getPass(), arg1);
	}

	
	/*
	 * @When("^User is enter the \"([^\"]*)\" in username field$") public void
	 * user_is_enter_the_in_username_field(String uname) throws Throwable {
	 * inputText(pom.getInstanceLp().getUsername(), uname); }
	 * 
	 * @And("^User is enter the \"([^\"]*)\" in password field$") public void
	 * user_is_enter_the_in_password_field(String pass) throws Throwable {
	 * inputText(pom.getInstanceLp().getPass(), pass); }
	 * 
	 * 
	 * @And("^User is enter the Password in password field$") public void
	 * user_is_enter_the_Password_in_password_field() throws Throwable {
	 * 
	 * inputText(pom.getInstanceLp().getPass(), "12345678"); }
	 */
	
	@Then("^User is click on submit button$")
	public void user_is_click_on_submit_button() throws Throwable {
		clickButton(pom.getInstanceLp().getSubmit());
	}
	
	
	

	@When("^User is enter the location$")
	public void user_is_enter_the_location() throws Throwable {
	   dropDown(pom.getInstanceSearch().getLoc(), "index", "2");
	  Thread.sleep(2000);
	}

	@When("^User is click on the Password hyperlink$")
	public void user_is_click_on_the_Password_hyperlink() throws Throwable {
	    driver.findElement(By.xpath("//a[text()='Change Password']")).click();
	}
	
	
	
}
