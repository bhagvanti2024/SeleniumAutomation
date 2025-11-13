# HandleDivisionPop-Up
HiddenDivision_Popup
Description:

Web Browser: Utilizes ChromeDriver to automate interactions with the Chrome browser.

Target Website: https://demoqa.com/alerts

Hidden Division Pop-up Handling: Interacts with a timer-based JavaScript alert on the webpage.

JavaScript Execution: Uses JavaScript Executor to ensure elements are in view before interacting with them.

Waits and Delays: Incorporates sleep intervals (Thread.sleep()) to wait for certain actions like scrolling and alert appearance.

Core Methods:

Scroll Into View: js.executeScript("arguments[0].scrollIntoView(true);", click2); - Ensures the target element is scrolled into the visible area of the browser window.

Click Action: Clicks on the Timer Alert button to trigger the alert.

Wait for Alert: Thread.sleep(6000); - Waits for a specified duration until the alert appears.

Handle Alert:

Alert alert = driver.switchTo().alert(); - Switches to the alert window.

alert.getText(); - Retrieves and optionally prints the alert text.

alert.accept(); - Accepts the alert by clicking "OK".

Additional Interactions: You can add further interactions as needed after handling the alert.
