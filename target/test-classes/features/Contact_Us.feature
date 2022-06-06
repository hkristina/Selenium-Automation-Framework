@contact-us @regression

Feature: WebDriver University - Contact us Page
  You can add more description if needed under the feature keyword
  #Feature is the description of functionality

  Background:
    Given I access the webdriver university contact us page

  Scenario: Validate Successful Submission - Unique Data
    When I enter a unique first name
    And I enter a unique last name
    And I enter a unique email address
    And I enter a unique comment
    And I click on the submit button
    Then I should be presented with a successful contact us submission message

  Scenario: Validate Successful Submission - Specific Data
    When I enter a specific first name Mickey
    And I enter a specific last name Mouse
    And I enter a specific email address mickey_mouse@mail.com
    And I enter a specific comment "How are you today?"
    And I click on the submit button
    Then I should be presented with a successful contact us submission message