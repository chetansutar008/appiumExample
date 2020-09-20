package com.edu.techfantasy.appiumExample.base;

import java.io.File;
import java.lang.reflect.Field;
import java.net.URL;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumService {

	private static AppiumDriverLocalService server;
	public static URL serverURL;
	static Field streamField;

	public static URL startServer() {

		AppiumServiceBuilder serviceBuilder = new AppiumServiceBuilder();
		serviceBuilder.usingAnyFreePort();
		server = AppiumDriverLocalService.buildService(serviceBuilder);
		server.start();
		serverURL = server.getUrl();
		System.out.println(serverURL);
		// Use any port, in case the default 4723 is already taken (maybe by another
		// Appium server)		
		return serverURL;

	}

}
