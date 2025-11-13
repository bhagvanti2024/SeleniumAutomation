/* 
 * Production-ready login test script for Guru99 Bank.
 * Uses WebDriver best practices with modular structure.
 */

package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class loginUrl {
public static WebDriver driver;
	public void login() {

		// Initialize test data and config
		String geckoDriverPath = "C:\\Users\\shree\\Downloads\\geckodriver-v0.36.0-win64\\geckodriver.exe";
		String baseURL = "https://www.demo.guru99.com/V4/";
		String userID = "mngr646094";
		String Password = "YsEqysu";

		// Set system property for GeckoDriver
		System.setProperty("webdriver.gecko.driver", geckoDriverPath);

		// Set Firefox options (e.g., headless, profile, etc. if needed)
		FirefoxOptions options = new FirefoxOptions();
		driver = new FirefoxDriver(options);

		// Launch browser and open URL

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(baseURL);

		// Enter credentials and login
		driver.findElement(By.name("uid")).sendKeys(userID);
		driver.findElement(By.name("password")).sendKeys(Password);
		WebElement getText= driver.findElement(By.name("btnLogin"));
		getText.click();

	}
}