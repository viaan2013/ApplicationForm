Feature: New Outcome Creation In Sales force
@Newoutcome
Scenario Outline:
Given I am in sales force homepage
When I should see salesforce homepage
And I select outcomes field from the tabs
And I click on new button
And I select "<centre>" in the information
And I enter "<Outcome>"
And I click on Save button
And I click on Add button in master courses
And I enter the "<subject>" name 
And I click on Find button in master course
And I select course of that particular university
And I click on add selected button
And I click on New Brand Outcome button
And I select "<Brand>" from parent record
And I click on Save brand outcome button
Then I should take a screenshot of Newoutcome
And I should see right information
Examples:
|username|password|centre|Outcome|subject|Brand|
|sruthi.kundoor@intoglobal.com.iupsfuat|Into1234|INTO City, University of London|outcome1-Sruthitest|Academic English|INTO City University, London (Parent)|
|sruthi.kundoor@intoglobal.com.iupsfuat|Into1234|INTO Manchester|outcome2-Sruthitest|Business|INTO Manchester (Parent)|
|sruthi.kundoor@intoglobal.com.iupsfuat|Into1234|INTO University of Stirling|outcome3-Sruthitest|social|INTO University of Stirling (Parent)|

@afterAPIupdate
Scenario Outline: Verifying newoutcome in Contentful
Given I am in Contentful homepage
When I have selected Outcome option in dropdown
And I enter "<outcome>" in search field in contentful
Then I should see related outcome search results

Examples:
|email|password|outcome|
|charles.parvez@intoglobal.com|Into3683|outcome1-Sruthitest|
|charles.parvez@intoglobal.com|Into3683|outcome2-Sruthitest|
|charles.parvez@intoglobal.com|Into3683|outcome3-Sruthitest|