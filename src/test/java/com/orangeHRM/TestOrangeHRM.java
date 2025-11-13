package com.orangeHRM;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestOrangeHRM {
WebDriver driver;
BasicOrangeHRM loginpage;
		@BeforeClass
		public void BeforeClass(){
			System.out.println("Open Browser....");
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\khand\\Downloads\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.manage().window().maximize();
			loginpage = new BasicOrangeHRM(driver);
		}
		@BeforeMethod
		public void BeforeMethod() {
			System.out.println("Open Url & GetText");
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			BasicOrangeHRM loginpage=new BasicOrangeHRM(driver);	
		}
		@Test
		public void GetTextFunctionality() {
		System.out.println("Perform the Gettext ");
		loginpage.GetTextUname();
		loginpage.GetTextPass();
		}
			@Test
			public void LogInFunctionality1() throws InterruptedException {
				System.out.println("Perform the login functionality");
				loginpage.LoginFunctionality();
			}	
		
		@AfterMethod
		public void AfterMethod() throws InterruptedException {
		System.out.println("Scroll functionality");	
		loginpage.ScrollVisibility();
		}
		@AfterClass
		public void AfterClass(){
			System.out.println("close the url...");
		 driver.close();
		}

	}
