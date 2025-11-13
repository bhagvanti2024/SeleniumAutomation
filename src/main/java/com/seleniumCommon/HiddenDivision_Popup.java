package com.seleniumCommon;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision_Popup {

    public static void main(String[] args) throws InterruptedException {
       // System.setProperty("webdriver.chrome.driver", "C:\\Users\\khand\\Downloads\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");

        // Scroll to and click the Timer Alert button
        WebElement click2 = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", click2); // Ensure the element is in view
        Thread.sleep(2000); // Wait for the scroll effect to complete
        click2.click();

        // Wait for the alert to appear
        Thread.sleep(6000); // Adjust the time based on the alert's timer duration

        // Handle the alert
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert text: " + alert.getText()); // Get alert text (optional)
        alert.accept(); // Accept the alert (click "OK")

        // You can now continue with any other interactions if needed

        // Close the browser
        driver.quit();
    }
}