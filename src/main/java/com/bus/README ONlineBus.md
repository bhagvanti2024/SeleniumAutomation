# Online Bus Booking
Here's a detailed description of your Selenium WebDriver program for automating online bus booking. The program is structured using the Page Object Model (POM) and TestNG framework, ensuring a modular and maintainable codebase.

Description:
OnlineBusBooking (Page Object Model Class):

This class represents the elements and actions required for booking a bus ticket.

Attributes:

WebDriver driver: The WebDriver instance for browser interactions.

WebElement selectSource: Locator for the source input field.

WebElement selectSourceName: Locator for selecting the source name.

WebElement selectDestiName: Locator for selecting the destination name.

WebElement selectDateBox: Locator for the date input field.

WebElement selectDate: Locator for selecting the date.

WebElement searchBus: Locator for the search bus button.

WebElement selectBus: Locator for selecting the bus.

WebElement proceed: Locator for the proceed button.

WebElement name: Locator for entering the name.

WebElement mobNo: Locator for entering the mobile number.

WebElement email: Locator for entering the email.

WebElement next: Locator for the next button.

WebElement paymentbtn: Locator for the proceed payment button.

Methods:

public OnlineBusBooking(WebDriver driver1): Constructor to initialize WebDriver and PageFactory elements.

public void SourceDest() throws InterruptedException: Method to select the source, destination, and date, and search for buses.

public void SelectSeat() throws InterruptedException: Method to select seats and proceed.

public void PersonalDetails() throws InterruptedException: Method to enter personal details and proceed.

public void Payment() throws InterruptedException: Method to proceed to payment.

OnlineBusBookingTest (TestNG Test Class):

This class contains the test setup and test methods using the TestNG framework.

Attributes:

WebDriver driver: The WebDriver instance for browser interactions.

OnlineBusBooking home: Instance of the POM class.

Methods:

@BeforeClass public void BeforeClass(): Method to set up the WebDriver and initialize the POM class.

@BeforeMethod public void BeforeMethod() throws InterruptedException: Method to navigate to the bus booking URL and search for buses.

@Test public void Test() throws InterruptedException: Test method to select seats for the bus.

@AfterMethod public void AfterMethod() throws InterruptedException: Method to enter personal details.

@AfterClass public void AfterClass() throws InterruptedException: Method to proceed to payment and close the WebDriver instance.
