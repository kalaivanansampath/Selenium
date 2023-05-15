@login
Feature: EXA login functionality

#Background:
#Given Open the Chrome browser
#And Load the application url 'http://leaftaps.com/opentaps'

@functional @smoke @regression
Scenario Outline: Login with positive credential
Given Enter the username as <username>
And Enter the password as <password>
And Click Hippa Privacy
When Click on login button
Then Homepage should be displayed

Examples:
|username|password|
|'radmin'|'EMD1q2w3e4r5t'|
|'viztek'|'1Q2w3e4r5t6Y'|

@functional
Scenario: Login with negative credential
Given Enter the username as 'DemoCSR'
And Enter the password as 'crmsfa123'
And Click Hippa Privacy
When Click on login button
But Error message should be displayed



#And Enter username as 'Demosalesmanager' and password as 'crmsfa'