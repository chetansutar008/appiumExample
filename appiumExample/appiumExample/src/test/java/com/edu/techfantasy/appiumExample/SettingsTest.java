package com.edu.techfantasy.appiumExample;

import org.testng.annotations.Test;

import com.edu.techfantasy.appiumExample.pages.SettingsPage;

public class SettingsTest extends com.edu.techfantasy.appiumExample.base.BaseScript {

	@Test
	public void settingTestOnData() {
		try {
			System.out.println("Running Setting test");
			driver.context("NATIVE_APP");
			Thread.sleep(500);
			SettingsPage settingsPage = new SettingsPage(driver);
			Thread.sleep(500);
			settingsPage.tapMore();
			Thread.sleep(500);
			settingsPage.tapMobileNetwork();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
