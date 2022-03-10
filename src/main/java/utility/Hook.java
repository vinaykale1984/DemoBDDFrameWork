package utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.testng.ITestResult;
//import reports.captureScreenshot;



public class Hook {

@SuppressWarnings("rawtypes")
	

	
	protected static AppiumDriver driver;
	WebDriverWait wait;
	String q = System.getProperty("user.dir");

	@Before("@web")

	public void setUpAppium() throws MalformedURLException, InterruptedException{
		File f = new File("Testdata");
		File fs = new File(f, "app-prodCA-release.apk");
		

		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		 capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
		 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus 6");
		 capabilities.setCapability(MobileCapabilityType.UDID, "fdd1f933");
		 capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		 capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, 11);
		 capabilities.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		 capabilities.setCapability("appPackage", "com.mcdonalds.superapp");
		 capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.mcdonalds.mcdcoreapp.common.activity.SplashActivity");    

		 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	     driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	     Thread.sleep(10000);
	}
	
	 @After()
	    public void endReport(){
	    	

	                   driver.quit();
	 }
	 
	 public static AppiumDriver getDriver()
		{
			return driver;
		}
}
