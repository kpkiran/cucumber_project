package com.ravikiran.cucumber.Cucumber_Project;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Base {

	public static RemoteWebDriver driver;
	public static Properties properties;

	public static RemoteWebDriver initializeDriver() throws IOException {
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		URL url = new URL("http://localhost:4444/wd/hub");
		driver = new RemoteWebDriver(url, cap);
		System.setProperty("webdriver.chrome.driver", "/Users/ravikiranpadki/Downloads/chromedriver");
		properties = new Properties();
		FileInputStream fis = new FileInputStream(
				"/Users/ravikiranpadki/eclipse-workspace/Cucumber-Project/src/test/java/com/ravikiran/cucumber/Cucumber_Project/global.properties");
		properties.load(fis);
		// driver = new ChromeDriver();
		driver.get(properties.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}
}
