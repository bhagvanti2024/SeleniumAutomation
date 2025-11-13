package com.seleniumCommon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementM {

    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", 
         //       "C:\\Users\\khand\\Downloads\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rediff.com/");

        // Click on 'Sign in'
        WebElement log = driver.findElement(By.xpath("//a[text()='Sign in']"));
        log.click();
        Thread.sleep(3000);

        // Send keys to username and password
        WebElement user = driver.findElement(By.xpath("//input[@id='login1']"));
        user.sendKeys("bhagu20@gmail.com");
        WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
        pass.sendKeys("P@123");

        // Click 'Proceed'
        WebElement sig = driver.findElement(By.xpath("//input[@name='proceed']"));
        sig.click();
        Thread.sleep(3000);

        // Get the text after login attempt
        WebElement text = driver.findElement(By.xpath("//div[@class='logtext']"));
        String re = text.getText();
        System.out.println("Login message: " + re);

        // Navigate back to the previous page
        driver.navigate().back();
        Thread.sleep(3000);

        // Click on 'Create Account'
        WebElement create_ac = driver.findElement(By.xpath("//u[contains(text(),'Create')]"));
        create_ac.click();
        Thread.sleep(3000);

        // Check if Male radio button is selected
        WebElement male = driver.findElement(By.xpath("//input[@value='m']"));
        boolean isSelected = male.isSelected();
        if (isSelected) {
            System.out.println("Male radio button is selected.");
        } else {
            System.out.println("Male radio button is not selected.");
        }

        // Check if the radio button is enabled
        boolean isEnabled = male.isEnabled();
        if (isEnabled) {
            System.out.println("Radio button is enabled.");
        } else {
            System.out.println("Radio button is disabled.");
        }

        // Check if the radio button is displayed
        boolean isDisplayed = male.isDisplayed();
        if (isDisplayed) {
            System.out.println("Radio button is displayed.");
        } else {
            System.out.println("Radio button is not displayed.");
        }

        // Closing the browser
        driver.quit();
    }
}