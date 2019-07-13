Feature: Test user can click additional exercises tab

Scenario: user should be able to click additioanl exercises

Given i am on toolslist website
When i enter valid username
And i enter valid password
And i click login
And user click additional exercises
Then Welcome to the Additional Exercises should be displayed 