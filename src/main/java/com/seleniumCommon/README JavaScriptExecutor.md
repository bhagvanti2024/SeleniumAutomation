# JavaScriptExecutor

Scroll_Up_Down
This Java class demonstrates various scrolling and window resizing actions using the Selenium WebDriver and JavaScript Executor in a web automation framework:

Description:

Web Browser: Uses ChromeDriver to interact with the Chrome browser.

Target Website: https://www.amazon.in/

Scroll Actions: Performs vertical scrolling (both up and down) and horizontal scrolling (both left and right).

Window Resize: Changes the browser window size to a specified dimension (300x500 pixels).

Waits: Incorporates sleep intervals (Thread.sleep()) to observe the actions being performed.

Browser Management: Maximizes the window at the beginning and closes the browser at the end of the execution.

Core Methods:

Scroll Down: js.executeScript("window.scrollBy(0,2000)"); - Scrolls down by 2000 pixels along the y-axis.

Scroll Up: js.executeScript("window.scrollBy(0,-2000)"); - Scrolls up by 2000 pixels along the y-axis.

Scroll Right: js.executeScript("window.scrollBy(300,0)"); - Scrolls right by 300 pixels along the x-axis.

Scroll Left: js.executeScript("window.scrollBy(-200,0)"); - Scrolls left by 200 pixels along the x-axis.

ScrollVisibility
This Java class demonstrates the ability to scroll an element into view and perform an action on it, such as clicking, as well as capturing a screenshot:

Description:

Web Browser: Uses ChromeDriver to interact with the Chrome browser.

Target Website: https://www.paytm.com/

Scroll to Element: Uses JavaScript Executor to scroll a specific element into view.

Element Interaction: Clicks on the element after scrolling it into view.

Screenshot Capture: Takes a screenshot of the current browser window and saves it as screenshot.png.

Waits: Includes sleep intervals (Thread.sleep()) to allow elements to load and user actions to complete.

Browser Management: Maximizes the window at the beginning and closes the browser after capturing the screenshot.

Core Methods:

Scroll Element into View: js.executeScript("arguments[0].scrollIntoView(false);", bookGas); - Scrolls the specified element into view, aligned to the bottom of the viewport.

Take Screenshot: takeScreenshot(driver); - Captures a screenshot of the browser window and saves it to a specified file path.
