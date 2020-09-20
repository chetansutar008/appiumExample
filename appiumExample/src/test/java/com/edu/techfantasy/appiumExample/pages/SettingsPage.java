package com.edu.techfantasy.appiumExample.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SettingsPage {

	public SettingsPage(AppiumDriver<WebElement> driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	AppiumDriver<WebElement> driver;

	@FindBy(xpath = "//android.widget.TextView[@text='More']")
	WebElement more;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Mobile networks']")
	WebElement mobileNetwork;

	@FindBy(xpath = "//android.widget.TextView[@text='Storage']")
	WebElement storage;

	public void tapMore() {
		more.click();
		System.out.println("Tapped on more");

	}

	public void tapMobileNetwork() {
		mobileNetwork.click();
		System.out.println("Tapped on mobile network");

	}
}
