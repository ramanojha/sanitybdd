Feature: As a user do a google search for keywords

  Scenario Outline: Launch site and do keyword search
  	When site is launched "https://www.google.com/"
  	Then verify title "Google"
    When enter "<keyword>" and hit search
    Then verify "<keyword>" is searched
    
    Examples:
	 | keyword  |
	 | laptops  |
	 | pendrive |
	 | led tv   |
  