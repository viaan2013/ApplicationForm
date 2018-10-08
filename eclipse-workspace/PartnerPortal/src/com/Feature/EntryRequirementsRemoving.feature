@Entryrequirementsremoving
Feature: Entry Requirements Removing in salesforce

Scenario Outline:  Entry requirements Removing
Given I am in test-course-content homepage in contentful 
And I enter "<email>" and "<password>" in contentful login page
And I click and select outcome option in dropdown
And I click on search text box
And I select scheduled course option in outcome
When I enter "<coursetitle>" in searchbox
And I select "<course>" from search results and click on it
And I select one of the "<scheduledcourses>" from the list and click 
And I select one of the "<EntryRequirements>"from the selected scheduled course
And I  do the page scroll for salesforce ID of that course
And I navigate to salesforce url
And I enter "<Username>" and "<Password>" in salesforce login page and click on login button
And I search for scheduledcourse in salesforce with "<URLWithsalesforceID>"
And I take a screenshot for of that for future use
And I click on delete button
Then I should see alert box with message
And I select ok in the alert box
Examples:
|email|password|coursetitle|course|scheduledcourses|EntryRequirements|Username|Password|URLWithsalesforceID|
|charles.parvez@intoglobal.com|Into3683|International Year One in Business|aCI3A000000Caf5WAC|//div[@class='ReferenceCard__title'][text()='International Year One in Business - January Start - 3 Terms - NCL - 2018/19']|//div[@class='ReferenceCard__title'][text()='Untitled']|sruthi.kundoor@intoglobal.com.iupsfuat|Into1234|https://intoglobal--iupsfuat.cs109.my.salesforce.com/aCJ3A000000Gmc4WAC|








