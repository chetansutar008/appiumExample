package com.edu.techfantasy.appiumExample.base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseScript {
	public static AppiumDriver<WebElement> driver;

	@BeforeSuite
	public void init() throws MalformedURLException {

		URL ServerURL=AppiumService.startServer();
		System.out.println("Appium Server started");
		try {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
			capabilities.setCapability(MobileCapabilityType.UDID,"YT911CALR3");

			capabilities.setCapability("appPackage", "com.android.settings");
			capabilities.setCapability("appActivity", "com.android.settings.Settings");
			
			driver = new AndroidDriver<WebElement>(ServerURL, capabilities);
			
			System.out.println("Android driver created!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@BeforeClass
	public void launchApplication() {
		driver.launchApp();
		System.out.println("App Launched");
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
		System.out.println("Driver quited");
	}

}
