package com.ecommerceWebsite;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BhartGoTest {
	WebDriver driver;
	BharatgoClass home;

	@BeforeClass
	public void BeforeClass() {
		System.out.println("Open Browser");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\khand\\Downloads\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		home = new BharatgoClass(driver);
	
}
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Url Enter");
		driver.get("https://seller.bharatgo.com/login");
		
}
	@Test
	public void lohinfun() {
		BharatgoClass login = new BharatgoClass(driver);
		login.Login();
		String s = driver.getCurrentUrl();
		System.out.println(s);
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("Logout");
		
	}
	@AfterClass
	public void AfterClass() {
		driver.close();
	}
}

