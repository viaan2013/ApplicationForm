Feature: Course available online
@Courseonline
Scenario Outline: True To False
Given I am in Contentful home page
And I select Outcome in the dropdown
And I select scheduledcourse in the outcome
And I enter "<Coursetitle>" in search area
And I click on search button
And I select "<scheduledCourse>"in search results
And I click on that selected "<course>"from search results
When I am navigating to salesforce
And I am searching for scheduled course with "<salesforceID>"
And I scroll the page to see Available online option
And I am double click on Available online option
And I click on save button
Then I should see available online option unticked
Examples:
|Coursetitle|scheduledCourse|course|salesforceID|
|International Year One in Business|aCI3A000000Caf5WAC|//div[@class='ReferenceCard__title'][text()='International Year One in Business - January Start - 3 Terms - NCL - 2018/19']|01t3A000007GaTpQAK|
|International Year One in Business|aCI3A000000CafBWAS|//div[@class='ReferenceCard__title'][text()='International Year One in Business - September Start - 3 Terms - NUL - 2018/19']|01t3A000007GaxsQAC|

@Courseonline
Scenario Outline:: False To True
Given I am navigating to salesforce homepage
And I am searching for scheduled course with "<salesforceID>" which are having unticked available online option
And I scroll the page to see Available online option
And I am double click on Available online option
And I click on save button
Then I should see Available online option ticked
Examples:
|salesforceID|
|01t3A000007TDKWQA4|                              

#Scenario Outline: True To False After API Update
#Given I am in Contentful home page
#When I select Outcome in the dropdown
#And I select scheduledcourse in the outcome
#And I enter "<Coursetitle>" in search area
#And I click on search button
#And I select "<scheduledCourse>" from search results
#Then I should see no results for that particular course
#Examples:
#|Coursetitle|scheduledCourse|
#|International Year One in Business|
