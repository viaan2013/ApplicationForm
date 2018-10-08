@RemovingEntryrequirements
Feature: Entry Requirements Removing in salesforce

Scenario Outline:  Entry requirements Removing
Given I am in test-course-content homepage in contentful 
And I click and select outcome option in dropdown
And I click on search text box
And I select scheduled course option in outcome
When I enter "<coursetitle>" in searchbox
And I select "<course>" from search results and click on it
And I select one of the "<scheduledcourses>" from the list and click 
And I select one of the "<EntryRequirements>"from the selected scheduled course
And I  do the page scroll for salesforce ID of that course
And I navigate to salesforce url
And I search for scheduledcourse in salesforce with "<URLWithsalesforceID>"
And I take a screenshot for of that for future use
And I click on delete button
Then I should see alert box with message
And I select ok in the alert box
And I should see record deleted message for that particular"<Course>"
Examples:
|coursetitle|course|scheduledcourses|EntryRequirements|URLWithsalesforceID|Course|
|Maths|aCI3A000000CahHWAS|//div[@class='ReferenceCard__title'][text()='A-level Engineering and Mathematics - September Start - 6 Terms - UEA - 2018/19']|//div[@class='ReferenceCard__title'][text()='Untitled']|https://intoglobal--iupsfuat.cs109.my.salesforce.com/aCJ3A000000GmekWAC|aCJ3A000000GmekWAC|
|Science|aCI3A000000CaexWAC|//div[@class='ReferenceCard__title'][text()='International Graduate Diploma in Business and Humanities with Pre-sessional English - September Start - 4 Terms - NCL - 2018/19']|//div[@class='ReferenceCard__title'][text()='China : Academic : 3 Year Diploma']|https://intoglobal--iupsfuat.cs109.my.salesforce.com/aCJ3A000000GmbgWAC|aCJ3A000000GmbgWAC|









