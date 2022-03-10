package stepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.testng.Assert;

import utility.Hook;
import utility.Pages;
import utility.Pages.Direction;


public class Login extends Pages{
	
	public Login(AppiumDriver driver) {
		super(driver);
		
	}

	private static  Direction RIGHT, LEFT, UP, DOWN;

	
	

	//*********Page Variables*********
	
	private String LandingScreen = "//android.view.ViewGroup[@resource-id = 'com.mcdonalds.superapp:id/tutorialLayout']";
	private String TakeTourBtn  = "//android.widget.TextView[@resource-id = 'com.mcdonalds.superapp:id/loyalty_tutorial_welcome_tour']";
	private String LoginBtn  = "//android.widget.TextView[@text = 'Login']";
	private String UserNameBtn = "//android.widget.EditText[@resource-id = 'com.mcdonalds.superapp:id/email_phone']";
	private String PwdBtn = "//android.widget.EditText[@resource-id = 'com.mcdonalds.superapp:id/password']";
	private String UN = "Vinay";
	private String PWD = "Vinay";
	
//	Direction dir = UP,DOWN,LEFT,RIGHT;
	
	
	public void Login() {
		this.driver = Hook.getDriver();
	}
	
	
	@Given("User is on the landing page of the app")
	public String user_is_on_the_landing_page_of_the_app() {
		return driver.getTitle();
	}

	@When("Click on Take the tour button")
	public void click_on_Take_the_tour_button() {
		clickByXpath(TakeTourBtn);
		
	}

	@When("User swipes to reach login page")
	public void user_swipes_to_reach_login_page() {
		swipeScreen(RIGHT);
	}
	
	@When("Enter the username")
	public void enter_the_username() {
		writeText(UserNameBtn, UN);
	}

	@When("Enter the password")
	public void enter_the_password() {
		writeText(PwdBtn, PWD);
	}

	@When("Click on sign in button")
	public void click_on_sign_in_button() {
		clickByXpath(LoginBtn);
	}

//	@Then("User should navigate to homepage")
//	public void user_should_navigate_to_homepage() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	}
	
}


