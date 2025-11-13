package com.seleniumCommon;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Up_Down {

    public static void main(String[] args) throws InterruptedException {

       // System.setProperty("webdriver.chrome.driver",
             //   "C:\\Users\\khand\\Downloads\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down (positive y-axis)
        js.executeScript("window.scrollBy(0,2000)"); 
        Thread.sleep(3000);

        // Scroll up (negative y-axis)
        js.executeScript("window.scrollBy(0,-2000)"); 
        Thread.sleep(3000);

        // Resize the browser window
        Dimension d = new Dimension(300, 500); 
        driver.manage().window().setSize(d);
        Thread.sleep(3000);

        // Scroll right (positive x-axis)
        js.executeScript("window.scrollBy(300,0)"); 
        Thread.sleep(3000);

        // Scroll left (negative x-axis)
        js.executeScript("window.scrollBy(-200,0)"); 
        Thread.sleep(3000);

        // Optionally, close the browser after a short delay
        driver.quit();
    }
}