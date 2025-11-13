package com.ecommerceWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BharatgoClass {
	WebDriver driver;
		@FindBy (xpath="//input[@class='page_mobileNumber__WLowO']")
		private WebElement login;
		@FindBy (xpath="//p[contains(text(),'Get Started')]")
		private WebElement btn;
		
	
		public BharatgoClass(WebDriver driver1)
		{
			this.driver=driver1;
			PageFactory.initElements(driver, this);
		}
		public void Login() {
			login.sendKeys("9373460937");
			btn.click();
		}

}