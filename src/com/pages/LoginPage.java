package com.pages;

import AppHook.Hook;
import io.appium.java_client.AppiumDriver;

public class LoginPage extends Pages{
	
	private static  Direction RIGHT;

	public LoginPage(AppiumDriver driver) {
        super(driver);
	}

	//*********Page Variables*********
	
	private String LandingScreen = "//android.view.ViewGroup[@resource-id = 'com.mcdonalds.superapp:id/tutorialLayout']";
	private String TakeTourBtn  = "//android.widget.TextView[@resource-id = 'com.mcdonalds.superapp:id/loyalty_tutorial_welcome_tour']";
	private String LoginBtn  = "//android.widget.TextView[@text = 'Login']";
	
	
//	Direction dir = UP,DOWN,LEFT,RIGHT;
	
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public void clickTourBtn(String btn) {
//		driver.findElementByXPath(TakeTourBtn).click();
		clickByXpath(TakeTourBtn);
	}
	
	public void swipe(Direction dir) {
		swipeScreen(RIGHT);
//		isLoginBtnExist(LoginBtn);
		
	}
}
