Feature: Login for LeafTaps Positive Flow

Scenario Outline: LeafTaps login

Given Enter the username as <username>
And Enter the password as <password>
When Click login
And Verify login success
Then Click logout

Examples: 
|username|password|
|demosalesmanager|crmsfa|
|democsr|crmsfa|