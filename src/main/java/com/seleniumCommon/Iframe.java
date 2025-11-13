package com.seleniumCommon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class Iframe {

    public static void main(String[] args) {
      //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\khand\\Downloads\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");

        // Create WebDriverWait to ensure elements are ready before interacting
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Switch to the iframe using its ID
        driver.switchTo().frame("frame1");

        // Wait until the h1 element is visible in the iframe
        WebElement f = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@id='sampleHeading']")));
        
        // Extract and print the text from the h1 element
        String s = f.getText();
        System.out.println(s);

        // Switch back to the main page (parent frame)
        driver.switchTo().defaultContent();

        driver.quit();  // Close the browser
    }
}