# mauseAction
SeleniumFramework
This repository contains Java programs designed to demonstrate various mouse actions using Selenium WebDriver, such as drag-and-drop, double-click, hover, and right-click.

Prerequisites
Java Development Kit (JDK) Download Link

Selenium WebDriver Download Link

ChromeDriver Download Link

An IDE such as IntelliJ IDEA or Eclipse

Setting Up the Environment
Install the Java Development Kit (JDK).

Download and set up Selenium WebDriver.

Download the ChromeDriver executable and ensure it is accessible via your system’s PATH, or specify its location in the code.

Import the Selenium WebDriver libraries into your IDE.

MauseActionDragAndDrop.java
This Java program demonstrates how to perform drag-and-drop actions using Selenium WebDriver on a demo site.

Features:

Setup ChromeDriver: Specifies the path to the ChromeDriver executable.

Navigate to Demo Site: Opens https://demo.guru99.com/test/drag_drop.html.

Set Window Size: Adjusts the browser window size.

Drag and Drop: Performs multiple drag-and-drop actions by dragging elements from source to target locations.

Wait for Element Visibility: Uses WebDriverWait to ensure elements are visible before performing actions.

Close Browser: Closes the browser after performing actions.

MouseActionDoubleClick.java
This Java program demonstrates how to perform a double-click action using Selenium WebDriver on a demo site.

Features:

Setup ChromeDriver: Specifies the path to the ChromeDriver executable.

Navigate to Demo Site: Opens https://demo.guru99.com/test/simple_context_menu.html.

Wait for Element Visibility: Uses WebDriverWait to ensure the button element is visible before performing the action.

Double-Click Action: Uses an Actions object to perform a double-click on the target element.

Close Browser: Closes the browser after performing the action.

MouseAction.java
This Java program demonstrates how to perform hover actions using Selenium WebDriver on Flipkart's homepage.

Features:

Setup ChromeDriver: Specifies the path to the ChromeDriver executable.

Navigate to Flipkart: Opens https://www.flipkart.com/.

Wait for Element Visibility: Uses WebDriverWait to ensure elements are visible before performing actions.

Hover and Click: Uses an Actions object to hover over specified categories and clicks on 'Sofas Sets & Sectionals'.

Close Browser: Closes the browser after performing actions.

MouseActionRightclick.java
This Java program demonstrates how to perform a right-click (context click) action using Selenium WebDriver on a demo site.

Features:

Setup ChromeDriver: Specifies the path to the ChromeDriver executable.

Navigate to Demo Site: Opens https://demo.guru99.com/test/simple_context_menu.html.

Wait for Element Visibility: Uses WebDriverWait to ensure the target element is visible before performing the action.

Right-Click Action: Uses an Actions object to perform a right-click on the target element.

Close Browser: Closes the browser after performing the action.
