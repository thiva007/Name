package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gecko {
	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Thiva\\eclipse-workspace\\Selenium\\driver\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();

	}

}
