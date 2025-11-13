package com.seleniumCommon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class WebElementDropDown1 {

    public static void main(String[] args) {
      //  System.setProperty("webdriver.chrome.driver",              "C:\\Users\\khand\\Downloads\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        // Initialize WebDriverWait to wait for elements to be interactable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Click on 'Create New Account' button
        WebElement create_ac = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@role='button'])[2]")));
        create_ac.click();

        // Wait for the month dropdown to be visible
        WebElement month = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='month']")));
        Select s1 = new Select(month);
        s1.selectByIndex(7);  // Select August
       
        // Wait for the date dropdown to be visible
        WebElement date = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='day']")));
        Select s = new Select(date);
        s.selectByValue("15");  // Select 15th day

        // Wait for the year dropdown to be visible
        WebElement year = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='year']")));
        Select s2 = new Select(year);
        s2.selectByVisibleText("1947");  // Select year 1947

        // Close the browser
        driver.quit();
    }
}