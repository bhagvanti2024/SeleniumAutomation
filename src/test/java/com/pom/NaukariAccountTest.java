package com.pom;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;

public class NaukariAccountTest {

	WebDriver driver;
	NaukariAccountClass home;

	@BeforeClass
	public void BeforeClass() {
		System.out.println("Open Browser");
		//System.setProperty("webdriver.chrome.driver",
		//		"C:\\Users\\khand\\Downloads\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		home = new NaukariAccountClass(driver);
	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Url Enter");
		driver.get("https://www.naukri.com/");
		NaukariAccountClass loginb = new NaukariAccountClass(driver);
		loginb.Loginfun();
		String s = driver.getCurrentUrl();
		System.out.println(s);
	}

	@Test
	public void Jobrecommendation() throws InterruptedException {
		System.out.println("Verify recommendation Job");
		home.JobReco();
		String t = driver.getTitle();
		System.out.println(t);
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("Logout");
		home.Logout();
	}

	@AfterClass
	public void AfterClass() {
		driver.close();
	}
}