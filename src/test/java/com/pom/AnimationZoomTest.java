package com.pom;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AnimationZoomTest {
	public static void main(String[] args) throws InterruptedException {

	//	System.setProperty("webdriver.chrome.driver",
		//		"C:\\Users\\khand\\Downloads\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
		driver.get("https://animationzoom.com/");
		driver.manage().window().maximize();
		System.out.println("Browser is Open...!");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Add an explicit wait for the element to be clickable
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement getQuoteButton = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='GET A QUOTE']")));
		getQuoteButton.click();
		System.out.println("Clicked on 'GET A QUOTE' button!");
		WebElement dropdownPresentation = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@role='presentation']")));
		dropdownPresentation.click();
		WebElement animationServiceOption = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='2d Animation Services']")));
		animationServiceOption.click();
		System.out.println("Selected '2d Animation Services' from the dropdown!");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rani");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rani@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9373460938");
		driver.findElement(By.xpath("//textarea[@placeholder='Comment']")).sendKeys("Welcome rani........");
		System.out.println("Filled out the form!");
		Thread.sleep(2000); // Wait before clicking the checkbox
		// Try a different locator for the checkbox
		WebElement checkbox = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='recaptcha-checkbox-border']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkbox);
		System.out.println("Checked the checkbox!");
		WebElement submitButton = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']")));
		submitButton.click();
		System.out.println("Clicked on the 'Submit' button!");
	}
}