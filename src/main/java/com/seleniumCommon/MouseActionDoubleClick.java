package com.seleniumCommon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class MouseActionDoubleClick {

    public static void main(String[] args) {
        WebDriver driver = null;

        try {
           // System.setProperty("webdriver.chrome.driver", 
                   // "C:\\Users\\khand\\Downloads\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://demo.guru99.com/test/simple_context_menu.html");

            // Set up WebDriverWait for waiting until element is clickable
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Locate the button element and wait for it to be visible
            WebElement dc = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@ondblclick='myFunction()']")));

            // Create Actions object and perform double-click action
            Actions ac = new Actions(driver);
            ac.doubleClick(dc).perform();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Clean up and close the browser
            if (driver != null) {
                driver.quit();
            }
        }
    }
}