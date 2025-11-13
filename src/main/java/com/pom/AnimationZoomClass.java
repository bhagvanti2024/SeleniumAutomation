package com.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AnimationZoomClass {
	WebDriver driver;
	Actions act;
	@FindBy (xpath ="//span[text()='GET A QUOTE']")
	private WebElement quote;
	
	@FindBy (xpath ="//span[@role='presentation']")
	private WebElement animation ;
	//@FindBy (xpath =)
	//private WebElement ;
	
	@FindBy (xpath = "//input[@id='forminator-field-name-1_6774dea5b66fc']") 
	private WebElement name ;
	@FindBy (xpath = "//input[@id='forminator-field-email-1_6774dea5b66fc']")
	private WebElement emailId;
	@FindBy (xpath ="//input[@id='forminator-field-phone-1_6774dea5b66fc']")
	private WebElement phoneNo;
	@FindBy (xpath ="//input[@id='forminator-field-text-1_6774dea5b66fc']")
	private WebElement website;
	@FindBy (xpath ="//textarea[@placeholder='Comment']")
	private WebElement comment;
	@FindBy (xpath ="//span[@id='recaptcha-anchor']")
	private WebElement captcha;
	@FindBy (xpath ="//button[text()='Submit']")
	private WebElement subbtn ;
	
	
	
	
	public AnimationZoomClass(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
		this.act=new Actions(driver1);
	}
	public void GetQuote() throws InterruptedException {
	quote.click();
	animation.click();
	/*
	 * name.sendKeys("rani"); emailId.sendKeys("rani@gmail.com");
	 * phoneNo.sendKeys("9373460939"); website.sendKeys("www.google.com");
	 * comment.sendKeys("This is a google web site....."); captcha.click();
	 * subbtn.click(); Thread.sleep(5000);
	 */
		
	}
}