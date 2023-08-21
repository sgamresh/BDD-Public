#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Onboarding
Feature: Testing Onboarding Functionality
  I want to test launch and login of my website

  @launching
  Scenario: User should be able to launch the application
    Given User is able to launch the application
    And User lands on the home page
    When I click on "sports" tab 
    And refrsh the page
    Then I validate title of the "sports" tab
    And quit the browser
 
      
      
      
    