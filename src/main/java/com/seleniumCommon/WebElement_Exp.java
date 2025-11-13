package com.seleniumCommon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Exp {

	public static void main(String[] args) throws InterruptedException {
		//System.getProperty("webdriver.chrom.driver",
			//	"C:\\Users\\khand\\Downloads\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

		driver.manage().window().maximize();

		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox.click();
		Thread.sleep(2000);


		WebElement question = driver.findElement(By.xpath("//select[contains(@name,'hintqfb')]"));
		question.click();
		boolean r = question.isDisplayed();
		System.out.println(r);
		if (r) {
			System.out.println("This is display");
		} else {
			System.out.println("are not display");
		}

	}

}