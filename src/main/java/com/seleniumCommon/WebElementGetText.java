package com.seleniumCommon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementGetText {

    public static void main(String[] args) {
      //  System.setProperty("webdriver.chrome.driver","C:\\Users\\khand\\Downloads\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://majhinaukri.in/");

        // Find the element
        WebElement path = driver.findElement(By.xpath("//span[contains(@style,'color: #3d8')]"));

        // Get the text of the element
        String result = path.getText();
        System.out.println(result);

        // Define the expected text (for example, "Expected Text")
        String expectedText = result;  // Replace with actual expected text

        // Compare the result with the expected text
        if (result.equals(expectedText)) {
            System.out.println("Successfully got the correct text.");
        } else {
            System.out.println("Text did not match. Expected: " + expectedText + " but got: " + result);
        }

        driver.quit();  // Don't forget to close the browser after the test
    }
}