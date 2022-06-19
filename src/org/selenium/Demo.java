package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.execution.instrumentation.tracing.TracingInstrumentation.Options;

public class Demo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thiva\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	WebElement select = driver.findElement(By.id("Skills"));
	select.click();
	Select s = new Select(select);
	List<WebElement> list = s.getOptions();
	

	for (int i = 73; i < 78; i++) {
		WebElement l = list.get(i);
		String text = l.getText();
		System.out.println(text);
		
	}
	
	driver.quit();
	
}
}
