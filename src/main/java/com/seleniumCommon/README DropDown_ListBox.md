# DropDown_ListBox

## SeleniumFramework

This repository contains Java programs designed to demonstrate various capabilities of Selenium WebDriver, including handling dropdown lists on web pages.

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

### [WebElementDropDown1.java](https://linktoyourfile.com/WebElementDropDown1.java)

This Java program demonstrates how to interact with dropdown lists on the Facebook signup page.

**Features:**
- **Setup ChromeDriver**: Specifies the path to the ChromeDriver executable.
- **Navigate to Facebook**: Opens `https://www.facebook.com/`.
- **Open Create Account Form**: Clicks on the 'Create new account' button to open the signup form.
- **Wait for Dropdown Visibility**: Uses `WebDriverWait` to wait until the "month," "day," and "year" dropdowns are visible.
- **Select Dropdown Options**: Selects "August" from the month dropdown, "15" from the day dropdown, and "1947" from the year dropdown.
- **Close Browser**: Closes the browser after interacting with the dropdowns.

**Usage Steps:**
1. **Set ChromeDriver Property**: Ensure the path to your local ChromeDriver executable is set correctly.
2. **Start ChromeDriver**: Initialize the `ChromeDriver`.
3. **Open Facebook**: Navigate to Facebook’s homepage.
4. **Open Signup Form**: Click the button to open the signup form, wait for dropdowns to be visible, and select options.
5. **Close Browser**: Close the browser when done.

### [WebElemnetDropDown.java](https://linktoyourfile.com/WebElemnetDropDown.java)

This Java program shows an example of handling and printing options from a dropdown list on the Facebook signup page.

**Features:**
- **Setup ChromeDriver**: Specifies the path to the ChromeDriver executable.
- **Navigate to Facebook**: Opens `https://www.facebook.com/`.
- **Open Create Account Form**: Clicks on the 'Create new account' button to open the signup form.
- **Wait for Dropdown Visibility**: Uses `WebDriverWait` to wait until the "month" dropdown is visible.
- **Print Dropdown Options**: Retrieves and prints all options from the "month" dropdown.
- **Select an Option**: Optionally selects "December" from the dropdown.
- **Close Browser**: Closes the browser after printing and selecting options.

**Usage Steps:**
1. **Set ChromeDriver Property**: Ensure the path to your local ChromeDriver executable is set correctly.
2. **Start ChromeDriver**: Initialize the `ChromeDriver`.
3. **Open Facebook**: Navigate to Facebook’s homepage.
4. **Open Signup Form**: Click the button to open the signup form and wait for the "month" dropdown to be visible.
5. **Print Options & Select Month**: Print all available options from the "month" dropdown and optionally select "December".
6. **Close Browser**: Close the browser when done.
