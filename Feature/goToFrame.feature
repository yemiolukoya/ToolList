Feature: Test user can click additional exercises tab

Scenario: user should be able to click additioanl exercises

Given i am on toolslist website
When i enter valid username
And i enter valid password
And i click login
And user click additional exercises
And click go to frame
And safebear page is displayed
And safebear text is click 
Then user should be navigated to safebear Live site