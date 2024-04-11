#Date : 3/15/2024
#Author : Neha Narang
Feature: Feature to test iFrame functionality on Sony Play Station product page of Best Buy website

@TestiFrame    
   Scenario: Check Advertisement  
    Given User is on a selected Play Station Page
    When User clicks on a game from sponsorsed shop related product
    Then A different website launches with the game details