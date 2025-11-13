package com.seleniumCommon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class WebElemnetDropDown {
    // Handle Dropdown / listbox

    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver",      "C:\\Users\\khand\\Downloads\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        // Navigate to the Create Account page
        WebElement create_ac = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
        create_ac.click();

        // Wait for the dropdown to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement month = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='month']")));

        // Create Select object to interact with the dropdown
        Select s = new Select(month);

        // Get the options and print them
        List<WebElement> option = s.getOptions();
        System.out.println("Total months: " + option.size()); // 12

        // Print each option in the dropdown
        for (WebElement monthOption : option) {
            System.out.println(monthOption.getText());
        }

        // Optionally, select a month
        s.selectByVisibleText("Dec"); // Example of selecting December

        // Close the browser
        driver.quit();
    }
}