# OrangeHRM
Web Automation: Orange HRM Live Script

In this post, we break down how to automate the login process for the Orange HRM Live script step by step using Selenium.

From navigating the homepage to logging in and validating results, everything is automated!

Want to learn how to:

1.Open the browser.
2. Get the username and password.
3. Use the username and password to log in.

This is a web application. Using Selenium WebDriver with Java, we automate the test script. We also use the TestNG framework for execution.

I used a MAVEN Project, which provides a structure following user standards, such as:

src/main/java
src/main/resources
src/test/java
src/test/resources
src folder
target folder
The pom.xml file manages Maven dependencies, which are automatically downloaded. In src/main/java, I store my POM classes, and under src/test/java, I store my test classes.

We also use TestNG for script execution with the help of its annotations and Selenium as the automation tool. Additionally, I maintain utility classes and a base class.
