package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Fire {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Thiva\\eclipse-workspace\\Selenium\\driver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.facebook.com");
	}

}
