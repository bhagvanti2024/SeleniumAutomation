package com.seleniumCommon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementIsSelected {

    public static void main(String[] args) throws InterruptedException {
      //  System.setProperty("webdriver.chrome.driver","C:\\Users\\khand\\Downloads\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        // Click on the 'Create new account' button
        WebElement c = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
        c.click();
        Thread.sleep(2000);

        // Locate the 'Male' radio button input
        WebElement genderMaleRadioButton = driver.findElement(By.xpath("//input[@value='2']"));

        // Check if the radio button is selected
        boolean result = genderMaleRadioButton.isSelected();

        // Print the result
        if (result) {
            System.out.println("Male radio button is selected.");
        } else {
            System.out.println("Male radio button is not selected.");
        }

        // Optionally, close the browser at the end
      //  driver.quit();
    }
}