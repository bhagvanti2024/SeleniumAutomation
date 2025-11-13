package com.seleniumCommon;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_DriverMethods {

	public static void main(String[] args) throws InterruptedException {
		//System.getProperty("webdriver.chorme.driver",
		//		"C:\\Users\\khand\\Downloads\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		String expected = "https://www.google.com/";
		String actual = driver.getCurrentUrl();
		System.out.println(actual);
		if (expected.equals(actual)) {
			System.out.println("Expected result match");
		} else {
			System.out.println("Does not match");
		}
		Thread.sleep(3000);
		Dimension d = new Dimension(200, 400);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		Point p = new Point(100, 500);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().toString();
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
	}
}