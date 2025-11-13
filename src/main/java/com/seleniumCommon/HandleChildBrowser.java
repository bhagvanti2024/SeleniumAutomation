package com.seleniumCommon;

import java.util.ArrayList;
import java.util.Set;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleChildBrowser {

    public static void main(String[] args) throws InterruptedException {
       // System.setProperty("webdriver.chrome.driver", "C:\\Users\\khand\\Downloads\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.irctc.co.in/nget/train-search");

        // Create a WebDriverWait instance
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for and click the BUSES link
        WebElement buses = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),' BUSES ')]")));
        buses.click();

        // Wait for and click the FLIGHT link
        WebElement flight = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'FLIGHT')]")));
        flight.click();

        // Wait for and click the HOTELS link
        WebElement hotels = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'HOTELS')]")));
        hotels.click();

        // Get all window handles
        Set<String> windowHandles = driver.getWindowHandles();
        ArrayList<String> windowList = new ArrayList<>(windowHandles);

        // Iterate through all window handles
        for (int i = 0; i < windowList.size(); i++) {
            String windowHandle = windowList.get(i);
            driver.switchTo().window(windowHandle);
            String title = driver.getTitle();
            String currentUrl = driver.getCurrentUrl();
            System.out.println("Window " + i + ":");
            System.out.println("Title: " + title);
            System.out.println("URL: " + currentUrl);
            System.out.println("Window Handle: " + windowHandle);
            System.out.println(".........................................");
        }

        // Switch back to the main window if needed
        driver.switchTo().window(windowList.get(0));
        Thread.sleep(2000);
        System.out.println("Main window title: " + driver.getTitle());
        
        driver.quit();
    }
}