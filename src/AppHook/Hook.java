package AppHook;

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
	
	static String appPackage;
	
	protected static AppiumDriver driver;
	WebDriverWait wait;
	String q = System.getProperty("user.dir");
//	public static ID ids = new ID();
//	public static Utils utils;
	

	@SuppressWarnings("rawtypes")
	@Parameters({ "deviceName_","UDID_","platformVersion_", "URL_" })
//	@BeforeMethod
	@BeforeClass
	public void beforemethod(String deviceName_,String UDID_,String platformVersion_, String URL_) throws MalformedURLException, InterruptedException{
		File f = new File("Testdata");
		File fs = new File(f, "mywork_native_2.15.4_ANDROID_INT_UODPROD.apk");
		
//		startAppiumService(portNumber);
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		 capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
//		 capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
//		 capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName_);
		 capabilities.setCapability(MobileCapabilityType.UDID, UDID_);
		 capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		 capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion_);
		 capabilities.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());

//		 capabilities.setCapability(AndroidMobileCapabilityType.SYSTEM_PORT, systemPort_);
		 capabilities.setCapability("appPackage", "com.mcdonalds.superapp");
		 capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.mcdonalds.mcdcoreapp.common.activity.SplashActivity");
//		 setDriver(new AndroidDriver(new URL("http://127.0.0.1:"+portNumber+"/wd/hub"), capabilities));
		 
//		 new RemoteWebDriver(new URL("http://192.168.29.108:4444/wd/hub"), capabilities);
    

//		 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		 driver = new AndroidDriver<MobileElement>(new URL("http://"+URL_), capabilities);
		
//		 utils = new Utils();
//	     utils.delay(5000);
	     driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	     Thread.sleep(10000);
	}
	
	 @AfterClass
	    public void endReport(){
	    	
//	    			extent.endTest(logger);
//	                   extent.flush();
//	                   extent.close();
	                   driver.quit();
	 }
	 
	 public static AppiumDriver getDriver()
		{
			return driver;
		}
}
