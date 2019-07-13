Feature: Test user can click additional exercises tab

Scenario: user should be able to click additioanl exercises

Given i am on toolslist website
When i enter valid username
And i enter valid password
And i click login
And user click additional exercises
And click say something
And what would you like to say window is opened
And user type something
And click ok 
Then you said field is updated