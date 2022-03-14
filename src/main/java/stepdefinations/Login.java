package stepdefinations;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utility.Hook;
//import utility.Pages;
//import utility.Pages.Direction;


public class Login{
	
	private AppiumDriver driver;

//	public Login(AppiumDriver driver) {
//		super(driver);
//		
//	}
	
	public Login() {
		this.driver = Hook.getDriver();
	}

//	private static  Direction RIGHT, LEFT, UP, DOWN;

	
	

	//*********Page Variables*********
	
	private String LandingScreen = "//android.widget.TextView[@resource-id = 'com.mcdonalds.app.uk.dev:id/register']";
//	private String SignIn  = "//android.widget.TextView[@resource-id = 'com.mcdonalds.app.uk.dev:id/save']";
	private String SignIn  = "//android.widget.TextView[@content-desc = 'Log In button']";
	private String LoginBtn  = "//android.widget.TextView[@resource-id = 'com.mcdonalds.app.uk.dev:id/login']";
	private String UserNameBtn = "//android.widget.EditText[@resource-id = 'com.mcdonalds.app.uk.dev:id/email_phone']";
	private String PwdBtn = "//android.widget.EditText[@resource-id = 'com.mcdonalds.app.uk.dev:id/password']";
	private String UN = "philipstester2015@gmail.com";
	private String PWD = "Star@123";
	
//	Direction dir = UP,DOWN,LEFT,RIGHT;
	
	
	public void Login() {
		this.driver = Hook.getDriver();
	}
	
	
	@Given("User is on the landing page of the app")
	public void user_is_on_the_landing_page_of_the_app() {
//		driver.findElement(By.xpath(LandingScreen)).isDisplayed();
		driver.findElement(By.xpath(LoginBtn)).click();
	}

//	@When("Click on Skip button")
//	public void click_on_Skip_button() {
//		driver.findElement(By.xpath(SkipBtn)).click();
//		driver.findElement(By.xpath(SkipBtn)).click();
//		driver.findElement(By.xpath(SkipBtn)).click();
//	}

	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath(LoginBtn)).click();
	}
	
	@When("Enter the username")
	public void enter_the_username() {
		driver.findElement(By.xpath(UserNameBtn)).sendKeys(UN);
	}

	@When("Enter the password")
	public void enter_the_password() {
		driver.findElement(By.xpath(PwdBtn)).sendKeys(PWD);
	}

	@When("Click on signin button")
	public void click_on_signin_button(){
		driver.findElement(By.xpath(SignIn)).click();
	}

	@Then("User should navigate to homepage")
	public void user_should_navigate_to_homepage() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}
	
	
	
	
	
	
}


