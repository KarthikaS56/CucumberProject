@LoginPage
Feature: LoginPage Scenarios

Scenario: TS01_Validate_user_login_in_adactin
Given Open the browser
And Launch the Adactin URL
Then Validate URL Launched
When Enter username as "Aishu"
And Enter password as "aishu123"
And Click on Login button
Then Validate user logged in or not

Scenario Outline: TS01_Validate_user_login_in_adactin_scenario_outline
Given Open the browser
And Launch the Adactin URL
When Enter username as "<username>"
And Enter password as "<password>"
And Click on Login button
Then Validate user logged in or not

Examples:
|username|password|
|Azra		 |azra123 |
|Harish  |harish123|
|Guhan   |guhan123|

