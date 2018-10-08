@ProductProgression
Feature: Product Progression

Scenario Outline:Product progression option true to false
Given I am in contentful home page
And I select Outcome option in the dropdown
And I select scheduledcourse in the outcome option
When I enter "<courseTitle>" in outcome search area
And I select "<Course>" from search results
And I select "<scheduledCourse>" from list
And I print URL with outcomeID and salesforceID
And I click on "<productProgression>" related to that scheduledcourse
And I print the URL
Then I navigate to salesforce
And I search for "<scheduledcourse>" in the salesforce url
And I click on productprogression inactive option 
And I click on Save button in salesforce
Then I should see product progression option is unticked
Examples:
|courseTitle|Course|scheduledCourse|productProgression|scheduledcourse|
|science|aCI3A000000Caf0WAC|//div[@class='ReferenceCard__title'][text()='International Foundation in Biological and Biomedical Sciences - September Start - 3 Terms - NCL - 2018/19']|//div[@class='ReferenceCard__title'][text()='BSc (Hons) Psychology and Biology']|aCD3A0000008lnbWAA|


Scenario Outline:Product progression option False to true
Given I navigate to salesforce homepage
When I am searching for "<progressiondegree>" which are having unticked Productprogression inactive option
And I click on productprogression inactive option
And I click on Save button in salesforce
Then I should see product progression inactive option ticked
Examples:
|progressiondegree|
|aCD3A00000090WQ|
|aCD3A00000090WP|


