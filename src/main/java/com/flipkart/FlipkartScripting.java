// Automating complex scenarios on Flipkart using selenium WebDriver

package com.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipkartScripting {
	@Test
	public void FlipkartScriptingMethod() throws InterruptedException {
		// Initialize selenium WebDriver
		WebDriver driver = new ChromeDriver();

		// Navigate to flipkart homepage
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		/*
		 * // Closing the login popup try {
		 * driver.findElement(By.xpath("//div//a[contains(text(),'Login')]")).click();
		 * }catch (Exception e) { // TODO: handle exception
		 * System.out.println("Login popup not display"); }
		 */

		// Searching for the product
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"))
				.sendKeys("mobile 5g");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// select the Desire product (click on the first product)
		driver.findElement(By.xpath("//div[contains(@class,'_4WELSP')]")).click();

		// Switch to new window
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		// Add the product to the cart
		driver.findElement(By.xpath("//button[contains(text(), ' to cart')]")).click();

		Thread.sleep(3000);
		// Validating the cart and total price
		boolean selectproduct = driver.findElement(By.xpath("//img[contains(@loading,'lazy')]")).isDisplayed();
		System.out.println("Select Product is Displayed:--" + selectproduct);

		String TotalPrice = driver.findElement(By.xpath("//div[contains(@class,'_1Y9Lgu')]")).getText();
		System.out.println("Total price is :--" + TotalPrice);
		Thread.sleep(3000);

		// Removing the product from the cart
		driver.findElement(By.xpath("//div[contains(text(), 'Remove')]")).click();
		driver.findElement(By.xpath("(//div[contains(text(), 'Remove')])[2]")).click();
		
		Thread.sleep(3000);
		// Validating the cart is empty
		boolean emptyCart = driver.findElement(By.xpath("//div[contains(text(), 'Missing Cart items?')]")).isDisplayed();
		if (emptyCart) {
			System.out.println("Cart is empty");
		} else {
			System.out.println("Is not empty");
		}
		driver.quit();
	}
}