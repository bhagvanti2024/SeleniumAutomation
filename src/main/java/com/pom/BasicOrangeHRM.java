package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicOrangeHRM {
	WebDriver driver;
	String pass3;
	String uname3;
	@FindBy (xpath="//p[text()='Username : Admin']")
	private WebElement unametext;
	
	@FindBy (xpath="//div//input[@name='username']")
	private WebElement username;
	
	@FindBy (xpath="//p[text()='Password : admin123']")
	private WebElement passtext;
	
	@FindBy (xpath="//div//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement loginbtn;
	
	@FindBy (xpath="(//span[@title='Unassigned'])[2]")
	private WebElement circle;
	
	public BasicOrangeHRM(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	public void GetTextUname()
	{
		String uname1= unametext.getText();
		System.out.println(uname1);
		String[] uname2=uname1.split(" : ");
		uname3=uname2[1];
	}	
	public void GetTextPass()
	{
		String pass1= passtext.getText();
		System.out.println(pass1.split(" : "));
		String[] pass2=pass1.split(":");
		pass3=pass2[1];
	}	
	public void LoginFunctionality() throws InterruptedException
	{	
		Thread.sleep(3000);
		username.sendKeys(uname3.trim());
		password.sendKeys(pass3.trim());
		Thread.sleep(3000);
		loginbtn.click();
		Thread.sleep(5000);
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("argument[0].scrollIntoView(true);",circle);
	}
	public void ScrollVisibility() throws InterruptedException
	{
		Thread.sleep(3000);
	//	JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("argument[0].scrollIntoView(true);",circle);
		Thread.sleep(3000);
	}
	
	

}