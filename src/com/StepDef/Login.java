package com.StepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.testng.Assert;

import AppHook.Hook;

public class Login extends Hook {
	
private AppiumDriver driver;
	
	public Login() {
		this.driver = Hook.getDriver();
	}
	
	
	@Given("User is on the landing page of the app")
	public void user_is_on_the_landing_page_of_the_app() {
		Assert.assertTrue(driver.findElement(By.xpath("//*[@text='Accessibility']")).isDisplayed());
	}

	@When("Enter the username and password")
	public void enter_the_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Click on sign in button")
	public void click_on_sign_in_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("User should navigate to homepage")
	public void user_should_navigate_to_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


}
