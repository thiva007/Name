package org.selenium;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thiva\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.facebook.com");
		TakesScreenshot ts =(TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\Thiva\\eclipse-workspace\\Selenium\\ss//fb.jpeg");
		FileUtils.copyFile(screenshotAs, f);
		
	}

}
