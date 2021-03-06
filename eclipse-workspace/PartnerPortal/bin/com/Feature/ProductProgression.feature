@ProductProgression
Feature: Product Progression

Scenario Outline:Product progression option true to false
Given I am in contentful home page
When I enter Email as "charles.parvez@intoglobal.com" and Password as "Into3683" in the home page
And I click on login to contentful test site
And I select Outcome option in the dropdown
And I select scheduledcourse in the outcome option
When I enter "<courseTitle>" in outcome search area
And I select "<Course>" from search results
And I select "<scheduledCourse>" from list
And I print URL with outcomeID and salesforceID
And I click on "<productProgression>" related to that scheduledcourse
And I print the URL
Then I navigate to salesforce
And I enter userName as "sruthi.kundoor@intoglobal.com.iupsfuat" and passWord as "Into1234"
And I click on Login button in salesforce home page
And I search for "<scheduledcourse>" in the salesforce url
And I click on productprogression inactive option 
And I click on Save button in salesforce
Then I should see product progression option is unticked
Examples:
|courseTitle|Course|scheduledCourse|productProgression|scheduledcourse|
|Jamie|aCI8E0000008Ph4WAE|//div[@class='ReferenceCard__title'][text()='International Foundation in Accounting and Finance - September Start - 3 Terms - MER - 2018/19']|//cf-entity-field[12]/div/div/div[2]/cf-widget-renderer/cf-reference-editor/div[2]/ol/li/cf-entity-link/div/div/article/a/div/div/div|aCD3A0000009J8xWAE|


Scenario Outline:Product progression option False to true
Given I navigate to salesforce homepage
And I am searching for "<progressiondegree>" which are having unticked Productprogression inactive option
And I click on productprogression inactive option
And I click on Save button in salesforce
Then I should see product progression inactive option ticked
Examples:
|progressiondegree|
|aCD3A0000009J9A|
|aCD3A0000009J91|
|aCD3A0000009J9F|

