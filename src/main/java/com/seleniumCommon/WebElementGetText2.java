package com.seleniumCommon;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementGetText2 {

    public static void main(String[] args) {

       // System.setProperty("webdriver.chrome.driver","C:\\Users\\khand\\Downloads\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Get and process username
        WebElement uname = driver.findElement(By.xpath("//p[text()='Username : Admin']"));
        String username = uname.getText();
        System.out.println(username);
        String[] uname2 = username.split(":");
        String uname3 = uname2[0]; // "Username"
        String uname4 = uname2[1]; // " Admin"
        
        // Find and enter the username
        WebElement uname1 = driver.findElement(By.xpath("//div//input[@name='username']"));
        uname1.sendKeys(uname4.trim());
        System.out.println(uname3 + "" + uname4);

        // Get and process password
        WebElement pass = driver.findElement(By.xpath("//p[text()='Password : admin123']"));
        String password = pass.getText();
        System.out.println(password);
        String[] pass2 = password.split(":");
        String pass3 = pass2[0]; // "Password"
        String pass4 = pass2[1]; // " admin123"

        // Find and enter the password
        WebElement pass1 = driver.findElement(By.xpath("//input[@name='password']"));
        pass1.sendKeys(pass4.trim());
        
        // Click the login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        // Optionally, close the browser at the end
        driver.quit();
    }
}