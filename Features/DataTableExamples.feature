Feature: As a user do a google search for keywords using data table examples
@Smoke
Scenario Outline: Launch site and do keyword search 
	When user launches site "https://www.google.com/" 
	Then user verify title using list 
		| Google |
	When user launches site and verify title using list of list 
		|https://www.google.com/| Google |
		|https://abc.com/       | Abc    |
	When user launches site again and verify title using map 
		|https://www.google.com/| Google |
		|https://abc.com/       | Abc |
	When user launches site again and verify title using dataTable 
		|https://www.google.com/| Google |
		|https://abc.com/       | Abc    |
	When user launches site again and verify title using List of Maps 
		| url					 | title  | 
		| https://www.google.com/| Google |
		| https://abc.com/       | Abc    |
		| https://www.google2.com/| Google |
		| https://abc2.com/       | Abc    |
	When enter "<keyword>" and hit search 
	Then verify "<keyword>" is searched 
	
	Examples: 
		| keyword  |
		| laptops  |
		| pendrive |
		| led tv   |
  