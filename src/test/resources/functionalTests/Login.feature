#@Authour: Ganesh Kumar

Feature: Login Functionality

Scenario: User should be able to login with valid account
Given I visit the website
When I enter valid account detaits
Then I should be able to login

Scenario: User should not be able to login with account
Given I visit the website
When I enter invalid account detaits
Then I should not be able to login