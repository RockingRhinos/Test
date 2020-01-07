Feature: TC002 DeleteLead for LeafTaps

Scenario Outline: TC002 DeletedLead Positive Flow

Given Enter the username as <username>
And Enter the password as <password>
And Click login
And Verify login success
And Click on CRMSFA
And Click on Leads
And Click on Find Leads
#And Enter first name in find leads as <firstName>
And Click on Find Leads Submit button
When Click on the first resulting lead
Then Click on the Delete button

Examples:
|username|password|
|demosalesmanager|crmsfa|