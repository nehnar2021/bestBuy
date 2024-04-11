#Author: Neha Narang
Feature: Test to login to Best Buy site

	Scenario Outline: Test to login to best buy website using credentials
		Given User is on login Page
		When User enters username as "<username>"
		And User enters password as "<password>" 
		And User clicks submit button
		Then Username appears on the left side of the website

	Examples:
		|username|password|
		|emailidtesting321@gmail.com|emailidtesting@3|