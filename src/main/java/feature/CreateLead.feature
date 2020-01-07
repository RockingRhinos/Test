Feature: TC001 Create Lead for LeafTaps

Scenario Outline: TC001 Create Lead Positive Flow

Given Enter the username as <username>
And Enter the password as <password>
And Click login
And Verify login success
And Click on CRMSFA
And Click on Leads
And Click on CreateLead
And Enter company name as <cname>
And Enter first name as <fname>
And Enter last name as <lname>
When Clicking on Submit button
Then Verify First Name as <fname>

Examples:
|username|password|cname|fname|lname|
|demosalesmanager|crmsfa|TestLeaf|Sam|Lazarus|
|democsr|crmsfa|TestLeaf|Koushik|Chatterjee|