package com.seleniumCommon;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class MauseActionDragAndDrop {

    public static void main(String[] args) {
        WebDriver driver = null;

        try {
            // Set the path of the ChromeDriver
             driver = new ChromeDriver();

            driver.get("https://demo.guru99.com/test/drag_drop.html");

            // Set window size
            Dimension di = new Dimension(300, 700);
            driver.manage().window().setSize(di);

            // Wait until elements are visible before performing actions
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Create a single Actions object
            Actions actions = new Actions(driver);

            // Perform the drag-and-drop actions
            WebElement dd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='button button-orange'])[2]")));
            WebElement dd1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//ol[@align=\"center\"])[2]")));
            actions.dragAndDrop(dd, dd1).perform();

            WebElement d = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='button button-orange'])[5]")));
            WebElement d1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//ol[@align='center'])[1]")));
            actions.dragAndDrop(d, d1).perform();

            WebElement source = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='button button-orange'])[6]")));
            WebElement target = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//ol[@align='center'])[3]")));
            actions.dragAndDrop(source, target).perform();

            WebElement source1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='button button-orange'])[2]")));
            WebElement target1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//ol[@align='center'])[4]")));
            actions.dragAndDrop(source1, target1).perform();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser after the test
            if (driver != null) {
                driver.quit();
            }
        }
    }
}