# WebDriverMethods
### WebDriverMethod.java

This Java program demonstrates various Selenium WebDriver methods to interact with a web browser.

**Features:**
1. **Setup ChromeDriver:** Specifies the path to the ChromeDriver executable.
2. **Open Google:** Navigates to `https://www.google.com/` and verifies the current URL.
3. **Maximize Window:** Maximizes the browser window.
4. **Resize Window:** Changes the window size to 300x600 pixels.
5. **Reposition Window:** Sets window position to coordinates (300, 500).
6. **Close Browser:** Closes the browser window.

**Usage Steps:**
1. Set the ChromeDriver system property with the path to your local ChromeDriver executable.
2. Initialize a new instance of `ChromeDriver`.
3. Use `driver.get` to navigate to Google.
4. Compare the actual URL with the expected URL and print results.
5. Maximize, resize, and reposition the window using `driver.manage().window()`.
6. Use `driver.close` to close the browser.

### Web_DriverMethods.java

This Java program extends Selenium WebDriver's functionalities by including navigation and additional window management capabilities.

**Features:**
1. **Setup ChromeDriver:** Specifies the path to the ChromeDriver executable.
2. **Open Google and Facebook:** Navigates to `https://www.google.com/` and then `https://www.facebook.com/`.
3. **Print Title:** Prints the title of the current page.
4. **Navigation:** Uses `driver.navigate().to`, `back`, and `refresh`.
5. **Maximize Window:** Maximizes the browser window.
6. **Change Window Size & Position:** Adjusts window size to 200x400 pixels and sets position to (100, 500).
7. **Verify URL:** Ensures the current URL matches the expected URL.
8. **Close Browser:** Closes the browser window.

**Usage Steps:**
1. Set the ChromeDriver system property.
2. Initialize the `ChromeDriver`.
3. Navigate to Google.
4. Maximize the window.
5. Print the webpage title.
6. Navigate to Facebook, wait, and navigate back.
7. Verify if the URL matches the expected URL (`https://www.google.com/`).
8. Resize, reposition, and then maximize the window again.
9. Refresh the browser.
10. Close the browser.

### Notes:

- Ensure the version of ChromeDriver matches your version of Chrome browser.
- Update the path to `chromedriver.exe` as per your local file system.
- Modify `Thread.sleep` values as needed for different waiting times.
- Please ensure proper exception handling in production code; the provided examples use `throws InterruptedException` for simplicity.
