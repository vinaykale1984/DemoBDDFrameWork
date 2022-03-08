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

	@When("Click on Take the tour button")
	public void click_on_Take_the_tour_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User swipes to reach login page")
	public void user_swipes_to_reach_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
	
	@When("Enter the username")
	public void enter_the_username() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Enter the password")
	public void enter_the_password() {
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
