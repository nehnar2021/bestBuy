#Date : 3/15/2024
#Author : Neha Narang
Feature: Feature to test the main menu functionality of Best Buy website

@TestHomeLink    
   Scenario: Check PQRS Brand Option displays valid result 
    Given User launch the homepage
    And User clicks Shop menu button
    And User sees Brands option on left navigation
    And User sees PQRS Brands option
    When User clicks PQRS Brands option
    And User clicks Sony Brand
    Then User a new page launches with Sony products