Feature: Test that when user click submit the correct answer is displayed

Scenario: test correct answer is displayed after adding the number on the dropdown

Given i am on toolslist website
When i enter valid username
And i enter valid password
And i click login
And user click additional exercises
And user select two numbers from the dropdowns
And click submit
Then total is displayed