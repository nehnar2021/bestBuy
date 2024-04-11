#Author: Neha Narang
#Date: 3/18/2024
Feature: Feature to test elements such as navigating to images, toggle-bars, dropdown, checkbox and a product link  on Sony Product page 

  @TestSonyLink 
  Scenario: Test to Navigate through Images on Dot Navigation
    Given Current page is Sony product page
    When User clicks on dots
    Then Corresponding images are displayed
    
	 Scenario: Test In Stock and best Buy Toggle buttons on Sony Product page 
	  Given Current page is Sony product page
    When User clicks on InStock Toggle Bar
    And User clicks on BestBuy Toggle Bar
    Then InStock Toggle Bar toggles
    And BestBuy Toggle Bar toggles
    

	 Scenario: Test Sort Dropdown on Sony Product page 
	  Given Current page is Sony product page
    When User selects priceLowToHigh
    And User checks Online Only checkbox 
    And User clicks on Playstation Image Box
  	Then User is directed towards Playstation page
    
  