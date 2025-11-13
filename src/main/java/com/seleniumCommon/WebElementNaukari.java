package com.seleniumCommon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementNaukari {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver","C:\\Users\\khand\\Downloads\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/nlogin/login");

		WebElement login = driver.findElement(By.xpath("//a[@id='login_Layer']"));
		login.click();
		Thread.sleep(4000);
		WebElement username = driver.findElement(By.xpath("//input[@id='usernameField']"));
		username.sendKeys("bhagvantikhandate62@gmail.com");
		Thread.sleep(4000);
		WebElement password = driver.findElement(By.xpath("//input[@id='passwordField']"));
		password.sendKeys("Bhagvanti@123");
		Thread.sleep(4000);
		WebElement loginBtn = driver.findElement(By.xpath("//button[text()='Login']"));
		loginBtn.click();
		driver.quit();

	}

}