Feature: sales force app created
Scenario Outline: sales force app create functionalities
Given I am in salesforce Landing page
When  I hover on login menu
Then  I click on salesforce
Then  Enter User Id as "<username>"          
And   I Enter Password as "<password>"
Then  I click on login button
Then  I click on Apps
And   I click on AppManager
Then  I click on New Lightening App
Then  I enter AppName "<AppName>"
And   I enter DevoloperName "<DevoloperName>"
And   I enter Description "<Description>"
And   I upload image
Then  I click next 
Then  I click next 
Then  I click next 
Then  I click next 
Then  I click on save&finish
Then  I click on AppName nursery world dropdown
And   I click on edit
And   I updated description "<Updated>"
And   I click on save button
Then  I click to go back
Then  I click on Apps
And   I click on AppManager
Then  I click on AppName nursery world dropdown
And   I click on delete button
Then  I click on view profile
And   I click on log out button
Examples:
| username          | password    |  AppName  | DevoloperName |Description          | Updated                |
|go2belal@gmail.com | Dhaka@1215  |  mobileApp| TestPilot     |Mobile App Create    |A Mobile App application|

