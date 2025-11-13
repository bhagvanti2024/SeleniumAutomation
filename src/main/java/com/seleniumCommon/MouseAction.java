package com.seleniumCommon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class MouseAction {

    public static void main(String[] args) {
        WebDriver driver = null;

        try {
            // Set the path for ChromeDriver
           // System.setProperty("webdriver.chrome.driver",
            //        "C:\\Users\\khand\\Downloads\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
            driver = new ChromeDriver();

            driver.get("https://www.flipkart.com/");

            // Wait for the page to load and the elements to be visible
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Hover over 'Home & Furniture' category
            WebElement home_Furniture = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='_1XjE3T'])[5]")));
            Actions actions = new Actions(driver);
            actions.moveToElement(home_Furniture).perform();

            // Hover over 'Furniture' category
            WebElement furniture = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_16rZTH']//a[3]")));
            actions.moveToElement(furniture).perform();

            // Hover and click on 'Sofas Sets & Sectionals'
            WebElement sofas_Sets = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Sofas Sets & Sectionals']")));
            actions.moveToElement(sofas_Sets).click().perform();

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