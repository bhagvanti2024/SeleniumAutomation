package com.ecommercefile;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class amazonScript {
	@Test
	public void AmazoneScripMathod() throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// We initialize the webdriver and navigate to amazon mobile page
		driver.get("https://www.amazon.in/mobile-phones/");
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();

		// Search for a specific product(e.g. Laptop)

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Laptop Hp i5");
		driver.findElement(By.id("nav-search-submit-button")).click();

		// Wait for the result to load and validate the search result visible.
		Thread.sleep(3000);
		boolean ProductDisplayed = driver.findElement(By.id("a-page")).isDisplayed();
		System.out.println("Product is Displayed:---" + ProductDisplayed);
		
		//Click on the 1st product from the result.
		driver.findElement(By.xpath("//div[contains(@class,'a-section aok')]")).click();
		
		//Handle the new window or Tab
		Thread.sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			driver.switchTo().window(handle);
		}
		
		//Add the product to the cart
		driver.findElement(By.xpath("(//input[contains(@id,'add-to-cart-button')])[2]")).click();
		
		//Validated the cart count
		WebElement count = driver.findElement(By.id("nav-cart-count-container"));
		System.out.println("Cart count is:---" + count.getText());
		driver.quit();
	}
}