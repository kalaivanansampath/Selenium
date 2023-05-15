@login
Feature: EXA Worklist account no export

#Background:
#Given Open the Chrome browser
#And Load the application url 'http://leaftaps.com/opentaps'

@functional @smoke @regression
Scenario: Login with positive credential
Given Enter the username as 'kalaivanan'
And Enter the password as '1Q2w3e4r5t6Y'
And Click Hippa Privacy
When Click on login button
Then Homepage should be displayed
Then Worklist Accountno Exported