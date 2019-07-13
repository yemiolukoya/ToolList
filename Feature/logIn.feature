Feature: Test to login to tool list

Scenario: Test to login to tool list with valid credentials

Given i am on toolslist website
When i enter valid username
And i enter valid password
And i click login
Then login successful message should be displayed





