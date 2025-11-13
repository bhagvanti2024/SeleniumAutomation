package com.bus;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RedBusSearch {
	@Test

	public void RedBusMethod() throws InterruptedException {
		// Initialize webDriver
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Navigate to redBus website
		driver.get("https://www.redbus.in");

		// Enter source city
		WebElement source= driver.findElement(By.xpath("//div[@class='srcDestWrapper___e67e69']"));
		//source.click();
		source.sendKeys("Nagpur");
		driver.findElement(By.xpath("//div[@class='srcDest___aa6db3']")).click();

		// Enter destination city
		driver.findElement(By.id("dest")).sendKeys("Pune");
		driver.findElement(By.xpath("//div[@class='sc-gZMcBi hviMLb']")).click();

		// open the date picker and select a date
		driver.findElement(By.xpath("(//span[contains(text(),'Date')])[2]")).click();
		driver.findElement(By.id("Layer_1")).click();

		driver.findElement(By.xpath("//span[contains(@class,'DayTiles__CalendarDaysSpan-sc-1xu')]")).click();

		// Click the search buses button
		driver.findElement(By.id("search_button")).click();

		// wait for the bus list to load and validate
		Thread.sleep(3000);// Add a wait to allow the result to load

		boolean isResultDisplayed = driver.findElement(By.className("bus-items")).isDisplayed();

		if (isResultDisplayed) {
			System.out.println("Buses found for the selected route!");
		} else {
			System.out.println("No buses found for the selected route.");
		}
		driver.quit();
	}
}