@AddingEntryrequirements
Feature: Adding Entry requirements for Scheduled course in Salesforce

Background: CommonStepsForEntryRequirements
Given I am in Salesforce Login page
When I select Entry requiremnts option in salesforce
And I click on New button


Scenario Outline: Adding Academic Entry requirements
And I enter deails in "<EntryRequirementName>"
And I select "<QualificationType>"  
And I enter details in "<QualificationCountry>","<Qualification>","<Requirement>","<Writing>","<Reading>", "<Speaking>","<Listening>","<Notes>"and "<Internal_code>"
And I click on Save button at the bottom row
And I clik on New Product Entry
And I select "<Scheduledcourse>" in Product text box
And I click on Save button at the bottom row
Then I take screenshot for future use
Examples:
|EntryRequirementName|QualificationType|QualificationCountry|Qualification|Requirement|Writing|Reading|Speaking|Listening|Notes|Internal_code|Scheduledcourse|
|Academic Test|Academic|UK|Academic-First Year Degree|5|4|5.5|5|5.5|information|123ABC|International Graduate Diploma in Social Sciences - January Start - 3 Terms - UEA - 2018/19|
|Academic Test|Academic|UK|Academic-First Year Degree|5|4|5.5|5|5.5|information|123ABC|International Graduate Diploma in Economics - September Start - 3 Terms - UEA - 2018/19|

Scenario Outline: Adding English Entry requirements 
And I enter deails in "<EntryRequirementName>"
And I select "<QualificationType>" 
And I enter details in englishentryrequirements "<qualification>","<requirement>","<writing>","<reading>", "<speaking>","<listening>","<notes>"and "<internal_code>"
And I click on Save button at the bottom row
And I clik on New Product Entry
And I select "<Scheduledcourse>" in Product text box
And I click on Save button at the bottom row
Then I take screenshot for future use
Examples:
|EntryRequirementName|QualificationType|qualification|requirement|writing|reading|speaking|listening|notes|internal_code|Scheduledcourse|
|English Test|English|IELTS|5|4|5.5|5|5.5|information|123ABC|International Graduate Diploma in Social Sciences - January Start - 3 Terms - UEA - 2018/19|
|English Test|English|IELTS|5|4|5.5|5|5.5|information|123ABC|International Graduate Diploma in Economics - September Start - 3 Terms - UEA - 2018/19|
