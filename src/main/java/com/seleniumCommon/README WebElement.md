# WebElement
## SeleniumFramework

This repository contains several Java programs designed to demonstrate various capabilities of Selenium WebDriver, including interacting with web elements, performing login actions, and verifying the state of elements.

### Prerequisites
- Java Development Kit (JDK) [Download Link](https://www.oracle.com/java/technologies/javase-downloads.html)
- Selenium WebDriver [Download Link](https://www.selenium.dev/downloads/)
- ChromeDriver [Download Link](https://sites.google.com/a/chromium.org/chromedriver/downloads)
- An IDE such as IntelliJ IDEA or Eclipse

### Setting Up the Environment
1. Install the Java Development Kit (JDK).
2. Download and set up Selenium WebDriver.
3. Download the ChromeDriver executable and ensure it is accessible via your system’s PATH, or specify its location in the code.
4. Import the Selenium WebDriver libraries into your IDE.

### [WebElementNaukari.java](https://linktoyourfile.com/WebElementNaukari.java)
This program demonstrates the process of automating login to the Naukri website using Selenium WebDriver.

**Features:**
- **Setup ChromeDriver:** Specifies the path to the ChromeDriver executable.
- **Navigate to Naukri Login Page:** Opens `https://www.naukri.com/nlogin/login`.
- **Enter Credentials:** Fills in the username and password.
- **Login and Close:** Clicks the login button and closes the browser.

### [WebElementGetText.java](https://linktoyourfile.com/WebElementGetText.java)
This program shows how to extract and verify text from a web element using Selenium WebDriver.

**Features:**
- **Setup ChromeDriver:** Specifies the path to the ChromeDriver executable.
- **Navigate to Majhinaukri:** Opens `https://majhinaukri.in/`.
- **Extract Text:** Finds and extracts text from a specific element.
- **Verify Text:** Compares extracted text with the expected text.
- **Close Browser:** Closes the browser.

### [WebElementGetText2.java](https://linktoyourfile.com/WebElementGetText2.java)
This program demonstrates more advanced text extraction and input handling using the OrangeHRM login page.

**Features:**
- **Setup ChromeDriver:** Specifies the path to the ChromeDriver executable.
- **Implicit Wait:** Sets up an implicit wait for elements.
- **Navigate to OrangeHRM Login Page:** Opens `https://opensource-demo.orangehrmlive.com/web/index.php/auth/login`.
- **Extract and Input User Credentials:** Extracts username and password from text elements and inputs them into login fields.
- **Login and Close:** Clicks the login button and closes the browser.

### [WebElementIsSelected.java](https://linktoyourfile.com/WebElementIsSelected.java)
This program verifies if a radio button is selected on the Facebook signup page using Selenium WebDriver.

**Features:**
- **Setup ChromeDriver:** Specifies the path to the ChromeDriver executable.
- **Navigate to Facebook:** Opens `https://www.facebook.com/`.
- **Check Radio Button:** Verifies if the 'Male' radio button is selected.
- **Print Result:** Prints out whether the radio button is selected.

### [WebElementM.java](https://linktoyourfile.com/WebElementM.java)
This program demonstrates interactions on the Rediff website, including login and radio button checks.

**Features:**
- **Setup ChromeDriver:** Specifies the path to the ChromeDriver executable.
- **Navigate to Rediff and Attempt Login:** Opens `https://www.rediff.com/`, tries login, and prints the resulting message.
- **Navigate and Interact:** Navigates back, clicks 'Create Account', and checks the state of the 'Male' radio button.
- **Print State:** Prints whether the radio button is selected, enabled, and displayed.
- **Close Browser:** Closes the browser.
