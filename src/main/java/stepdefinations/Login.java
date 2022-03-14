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
	
	private String LandingScreen = "//android.view.ViewGroup[@resource-id = 'com.mcdonalds.superapp:id/tutorialLayout']";
	private String SkipBtn  = "//android.widget.TextView[@resource-id = 'com.mcdonalds.superapp:id/toolbar_skip']";
	private String LoginBtn  = "//android.widget.TextView[@resource-id = 'com.mcdonalds.superapp:id/tv_more_title']";
	private String UserNameBtn = "//android.widget.EditText[@resource-id = 'com.mcdonalds.superapp:id/email_phone']";
	private String PwdBtn = "//android.widget.EditText[@resource-id = 'com.mcdonalds.superapp:id/password']";
	private String UN = "Vinay";
	private String PWD = "Vinay";
	
//	Direction dir = UP,DOWN,LEFT,RIGHT;
	
	
	public void Login() {
		this.driver = Hook.getDriver();
	}
	
	
	@Given("User is on the landing page of the app")
	public void user_is_on_the_landing_page_of_the_app() {
		driver.findElement(By.xpath(LandingScreen)).isDisplayed();
	}

	@When("Click on Skip button")
	public void click_on_Skip_button() {
		driver.findElement(By.xpath(SkipBtn)).click();
		driver.findElement(By.xpath(SkipBtn)).click();
		driver.findElement(By.xpath(SkipBtn)).click();
	}

	@When("User swipes to reach login page")
	public void user_swipes_to_reach_login_page() {
	List <WebElement> myList = driver.findElements(By.className("android.widget.TextView"));
	System.out.println(myList);
	myList.get(0).click();
	
	myList.get(1).click();
	}
	
	@When("Enter the username")
	public void enter_the_username() {
		driver.findElement(By.xpath(UserNameBtn)).sendKeys(UN);
	}

	@When("Enter the password")
	public void enter_the_password() {
		driver.findElement(By.xpath(PwdBtn)).sendKeys(PWD);
	}

	@When("Click on sign in button")
	public void click_on_sign_in_button() {
		driver.findElement(By.xpath(LoginBtn)).click();
	}

	@Then("User should navigate to homepage")
	public void user_should_navigate_to_homepage() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}
	
	
	
	//Swipe functionality
	
//	public void swipeScreen(Direction dir) {
//	    System.out.println("swipeScreen(): dir: '" + dir + "'"); // always log your actions
//
//	    // Animation default time:
//	    //  - Android: 300 ms
//	    //  - iOS: 200 ms
//	    // final value depends on your app and could be greater
//	    final int ANIMATION_TIME = 200; // ms
//
//	    final int PRESS_TIME = 200; // ms
//
//	    int edgeBorder = 10; // better avoid edges
//	    PointOption pointOptionStart, pointOptionEnd;
//
//	    // init screen variables
//	    Dimension dims = driver.manage().window().getSize();
//
//	    // init start point = center of screen
//	    pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);
//
//	    switch (dir) {
//	        case DOWN: // center of footer
//	            pointOptionEnd = PointOption.point(dims.width / 2, dims.height - edgeBorder);
//	            break;
//	        case UP: // center of header
//	            pointOptionEnd = PointOption.point(dims.width / 2, edgeBorder);
//	            break;
//	        case LEFT: // center of left side
//	            pointOptionEnd = PointOption.point(edgeBorder, dims.height / 2);
//	            break;
//	        case RIGHT: // center of right side
//	            pointOptionEnd = PointOption.point(dims.width - edgeBorder, dims.height / 2);
//	            break;
//	        default:
//	            throw new IllegalArgumentException("swipeScreen(): dir: '" + dir + "' NOT supported");
//	    }
//
//	    // execute swipe using TouchAction
//	    try {
//	        new TouchAction(driver)
//	                .press(pointOptionStart)
//	                // a bit more reliable when we add small wait
//	                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
//	                .moveTo(pointOptionEnd)
//	                .release().perform();
//	    } catch (Exception e) {
//	        System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
//	        return;
//	    }
//
//	    // always allow swipe action to complete
//	    try {
//	        Thread.sleep(ANIMATION_TIME);
//	    } catch (InterruptedException e) {
//	        // ignore
//	    }
//	}
//
//	public enum Direction {
//	    UP,
//	    DOWN,
//	    LEFT,
//	    RIGHT;
//	}
	
	
}


