package com.busBooking;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bus.OnlineBusBooking;

public class TestOnlineBusBooking {
	OnlineBusBooking home;
	WebDriver driver;

	@BeforeClass
	public void BeforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\khand\\Downloads\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Browser is Open...!");
	}

	@BeforeMethod
	public void BeforeMethod() throws InterruptedException {

		driver.get("https://www.busonlineticket.com/booking/bus-tickets.aspx");
		driver.manage().window().maximize();
		System.out.println("Webpage is open....!");
		OnlineBusBooking home1= new OnlineBusBooking(driver);
		home1.SourceDest();
		System.out.println("Search the bus....!");
	}

	@Test
	public void Test() throws InterruptedException {
	
		OnlineBusBooking home2= new OnlineBusBooking(driver);
		home2.SelectSeat();
		System.out.println("Seat is Select.......!");
	}

	@AfterMethod
	public void AfterMethod() throws InterruptedException {
		OnlineBusBooking home3= new OnlineBusBooking(driver);
		home3.PersonalDetails();
		System.out.println("....Entered Personal Details....................");
	}

	@AfterClass
	public void AfterClass() throws InterruptedException {
	OnlineBusBooking home4= new OnlineBusBooking(driver);
		home4.Payment();
		driver.quit();
	}

}