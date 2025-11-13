package com.bus;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineBusBooking<selectSeat> {
	WebDriver driver;
	List list;
	// Select source as Cameron Highlands and destination as Kaula Lumpur
	@FindBy(xpath = "//input[@type='text']")
	private WebElement selectSource;

	@FindBy(xpath = "(//div[@class='select2-result-label'])[2]")
	private WebElement selectSourceName;

	@FindBy(xpath = "(//div[@class='select2-result-label'])[2]")
	private WebElement selectDestiName;
	// date
	@FindBy(xpath = "//input[@id='txtDepartDateBooking']")
	private WebElement selectDateBox;

	@FindBy(xpath = "(//a[@class='ui-state-default'])[5]")
	private WebElement selectDate;
	// search bus
	@FindBy(xpath = "//input[@value='Search Bus']")
	private WebElement searchBus;
	// Select the seats for the bus
	@FindBy(xpath = "//b[contains(text(),'SELECT')]")
	private WebElement selectBus;

	// @FindBy(xpath="//table//td//div[@class='seat']")
	// private WebElement selectSeat;
	// Click on Proceed
	@FindBy(xpath = "(//span[contains(text(),'Proceed')])[2]")
	private WebElement proceed;
	// Enter Personal Details
	@FindBy(xpath = "(//input[@type='text'])[10]")
	private WebElement name;
	@FindBy(xpath = "(//input[@type='tel'])[7]")
	private WebElement mobNo;
	@FindBy(xpath = "(//input[@type='text'])[11]")
	private WebElement email;

	@FindBy(xpath = "//a[@id='btnNext']")
	private WebElement next;
	@FindBy(xpath = "//input[@id='payment_btnProceedPayment']")
	private WebElement paymentbtn;

	public OnlineBusBooking(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public void SourceDest() throws InterruptedException {
		selectSource.click();
		selectSourceName.click();
		selectDestiName.click();
		selectDateBox.click();
		selectDate.click();
		Thread.sleep(3000);
		searchBus.click();
		Thread.sleep(5000);
	}

	public void SelectSeat() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", selectBus);
		selectBus.click();
		Thread.sleep(5000);
		List<WebElement> list = driver.findElements(By.xpath("//table//td//div[@class='seat']"));// *[@class=\"seat\"]
		int seatsToSelect = Math.min(list.size(), 6);
		for (int i = 0; i < seatsToSelect; i++) {
			list.get(i).click();
		}
		// list.size();
		// System.out.println(list.size());
		// for (int i = 0; i <= 5; i++) {
		// list.get(i).click();
		Thread.sleep(5000);
		proceed.click();
		Thread.sleep(5000);
	}
	// }

	public void PersonalDetails() throws InterruptedException {
		Thread.sleep(3000);
		name.sendKeys("rani k");
		mobNo.sendKeys("12838483456");
		email.sendKeys("k@gmail.com");
		Thread.sleep(5000);
		next.click();
	}

	public void Payment() throws InterruptedException {
		Thread.sleep(3000);
		paymentbtn.click();
		
	}
}