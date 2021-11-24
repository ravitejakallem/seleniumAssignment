Feature: Validating orange application
Background: Initilze the Browser
Given the user opens the browser
Then the user runs the URL

@SmokeTest @RegressionTest
Scenario: Validating orange application to click on admin
Given When I am in OrangeHRP Application
Then Login to Application
When Dashboard page is available
Then click on Admin module
Then Close the Browser

@RegressionTest
Scenario: Clicking on the Job title Page
Given When I am in OrangeHRP Application
Then Login to Application
Then click on Admin module
Then click on Job title
Then Verify the job title page
Then Close the Browser