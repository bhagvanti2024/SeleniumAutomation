# IFrameHandle
SeleniumFramework
This repository contains a Selenium-based automation framework for running browser-based tests. It showcases the handling of iframes, explicit waits, and element interactions in a web automation context.

IframeExample.java
A sample test script that:

Initializes the Chrome WebDriver.

Navigates to a W3Schools test page.

Switches control to an iframe using its ID.

Uses explicit waits to ensure elements are ready before interacting.

Clicks a button inside the iframe and retrieves text from a 'Run' button outside the iframe.

Demonstrates handling iframes effectively and switching between different frames.

Closes the browser after interactions.

Iframe.java
Another example script that:

Initializes the Chrome WebDriver.

Navigates to a demo page containing an iframe.

Switches control to the iframe using its ID.

Uses explicit waits to ensure elements are ready before interacting.

Extracts and prints the text from an h1 element inside the iframe.

Switches back to the parent frame and then closes the browser.

Key Features:
Explicit Waits: Utilizing WebDriverWait to wait for elements to be ready before interacting to ensure reliable execution.

Iframe Handling: Demonstrating switching control to and from iframes to interact with embedded elements.

Text Extraction and Interaction: Interacting with buttons and extracting text from various elements inside iframes.

Requirements
Java

Selenium WebDriver

ChromeDriver
