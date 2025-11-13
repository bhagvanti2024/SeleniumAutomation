package com.seleniumCommon;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver",
		//		"C:\\Users\\khand\\Downloads\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		String expected = "https://www.google.com/";
		String actual = driver.getCurrentUrl();
		System.out.println(actual);

		if (expected.equals(actual)) {
			System.out.println("Verify the url");
		} else {
			System.out.println("Does not match the url");
		}

		Thread.sleep(2000);
		driver.manage().window().maximize();
		Dimension d = new Dimension(300, 600);
		driver.manage().window().setSize(d);
		Point p = new Point(300, 500);
		driver.manage().window().setPosition(p);
		driver.close();
	}
}