package com.seleniumCommon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class MauseActionRightclick {

    public static void main(String[] args) {

        WebDriver driver = null;

        try {
            //System.setProperty("webdriver.chrome.driver",
            //        "C:\\Users\\khand\\Downloads\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
            driver = new ChromeDriver();

            // Open the URL
            driver.get("https://demo.guru99.com/test/simple_context_menu.html");

            // Wait for the element to be visible
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement rc = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='right click me']")));

            // Perform the right-click (context click) action
            Actions act = new Actions(driver);
            act.contextClick(rc).perform();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            if (driver != null) {
                driver.quit();
            }
        }
    }
}