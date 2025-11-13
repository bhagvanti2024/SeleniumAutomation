package com.pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NaukariAccountClass {
	WebDriver driver;
	Actions act;

	@FindBy(xpath = "//a[@id='login_Layer']")
	private WebElement login;
	@FindBy(xpath = "//input[@placeholder='Enter your active Email ID / Username']")
	private WebElement usernamename;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	@FindBy(xpath = "//button[text()='Login']")
	private WebElement loginbtn;
	@FindBy(xpath = "//div[text()='Jobs']")
	private WebElement job;
	@FindBy(xpath = "//div[text()='Recommended jobs']")
	private WebElement recjob;
	@FindBy(xpath = "//div[@class='nI-gNb-drawer__bars']")
	private WebElement profile;
	@FindBy(xpath = "//a[@title='Logout']")
	private WebElement logout;

	public NaukariAccountClass(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
	}
	public void Loginfun() {
		login.click();
		usernamename.sendKeys("bhagvantikhandate62@gmail.com");
		password.sendKeys("Bhagvanti@123");
		loginbtn.click();
	}
	public void JobReco() throws InterruptedException {
		Thread.sleep(2000);
		job.click();
		act.moveToElement(job).perform();
		Thread.sleep(2000);
		recjob.click();
	}
	public void Logout() {
		profile.click();
		logout.click();
	}
}