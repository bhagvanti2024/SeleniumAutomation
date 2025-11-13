# AnimationZoom
# AnimationZoom Selenium Automation

## Description
The **AnimationZoom Selenium Automation** project is an automation script written in Java using Selenium WebDriver. It is designed to interact with the **AnimationZoom** website, automate the process of filling out a quote request form, and submit it. The program navigates through various form fields, selects options, and clicks buttons, mimicking the actions of a user.

This script is written using the **Page Object Model (POM)** design pattern and **TestNG** for testing automation. It uses **explicit waits** to ensure elements are loaded and interactable before performing actions on them, improving reliability and stability in different network conditions.

The program:
1. Opens the AnimationZoom website.
2. Clicks on the **"GET A QUOTE"** button.
3. Selects a service from the dropdown menu.
4. Fills out the contact form.
5. Clicks the captcha checkbox using JavaScript.
6. Submits the form.

This project demonstrates automating a basic form submission and interacting with dynamic elements on a webpage.

## Technologies Used
- **Java**: The programming language used for the test automation.
- **Selenium WebDriver**: A powerful tool for web browser automation.
- **TestNG**: A testing framework for managing and executing test cases.
- **ChromeDriver**: A WebDriver implementation for Google Chrome.
- **Page Object Model (POM)**: A design pattern used to separate the test logic from the web elements.
- **WebDriverWait**: A Selenium feature for waiting until certain conditions are met.

## Features
- Automates the entire form submission process on AnimationZoom.com.
- Uses explicit waits to ensure elements are interactable before performing actions.
- Utilizes JavaScript to interact with dynamic web elements like checkboxes (captcha).
- Implements the **Page Object Model (POM)** for better code organization and maintainability.


