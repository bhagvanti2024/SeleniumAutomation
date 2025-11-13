package com.seleniumCommon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IframeExample {

    public static void main(String[] args) throws InterruptedException {
     //   System.setProperty("webdriver.chrome.driver", "C:\\Users\\khand\\Downloads\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

        // Create an explicit wait instance to use for waiting for elements
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Switch to iframe by ID
        driver.switchTo().frame("iframeResult");

        // Wait for the button inside the iframe to be clickable and then click it
        WebElement date = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='button']")));
        date.click();

        // Switch back to the parent frame
        driver.switchTo().parentFrame();
        // You can also use driver.switchTo().defaultContent(); to switch back to the main content.

        // Wait for the 'Run' button to be visible and get its text
        WebElement run = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='w3-button w3-bar-item w3-hover-white w3-hover-text-green ga-tryit']")));
        String text = run.getText();
        System.out.println(text);  // This should print "Run".

        // Close the browser
        Thread.sleep(2000);
        driver.close();
    }
}