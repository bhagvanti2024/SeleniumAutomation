package com.seleniumCommon;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;

import java.io.File;

public class ScrollVisibility {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\khand\\Downloads\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.paytm.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);  // Wait for the page to load

        WebElement bookGas = driver.findElement(By.xpath("//a[contains(@class,'w4Whb')]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll the element into view (aligned to the bottom of the viewport)
        js.executeScript("arguments[0].scrollIntoView(false);", bookGas);

        Thread.sleep(2000);  // Wait for the scroll to complete

        // Click on the element after scroll
        bookGas.click();

        // Capture the screenshot
        takeScreenshot(driver);

        // Close the browser after the test
        driver.quit();
    }

    // Method to take a screenshot and save it to a file
    public static void takeScreenshot(WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File("screenshot.png");
        FileUtils.copyFile(source, destination);
        System.out.println("Screenshot taken and saved to screenshot.png");
    }
}