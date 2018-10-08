@Entryrequirementsadding
Feature: Entry requirements adding for scheduled course in Salesforce

Scenario Outline: Adding Entry requirements 
Given I am in Salesforce Login page
When I enter "<username>" and "<password>" in login page
And I click on login button in salesforce login page
When I select Entry requiremnts option in salesforce
And I click on New button
And I enter deails in "<EntryRequirementName>"
And I select "<QualificationType>" 
And I enter details in "<QualificationCountry>","<Qualification>","<Requirement>","<Writing>","<Reading>", "<Speaking>","<Listening>","<Notes>"and "<Internal_code>"
And I click on Save button at the bottom row
And I clik on New Product Entry
And I select "<Scheduledcourse>" in Product text box
And I click on Save button at the bottom row
Then I take screenshot for future use
Examples:
|username|password|EntryRequirementName|QualificationType|QualificationCountry|Qualification|Requirement|Writing|Reading|Speaking|Listening|Notes|Internal_code|Scheduledcourse|
|sruthi.kundoor@intoglobal.com.iupsfuat|Into1234|English Test|English|China|IELTS|5|4|5.5|5|5.5|information|123ABC|International Foundation in Accounting and Finance - September Start - 3 Terms - MER - 2018/19|
|sruthi.kundoor@intoglobal.com.iupsfuat|Into1234|Academic Test|Academic|UK|Academic-First Year Degree|5|4|5.5|5|5.5|information|123ABC|International Year One in Business - January Start - 3 Terms - NCL - 2018/19|
|sruthi.kundoor@intoglobal.com.iupsfuat|Into1234|English Test|English|USA|IELTS|5|4|5.5|5|5.5|information|123ABC|International Foundation in Accounting and Finance - September Start - 3 Terms - MER - 2018/19|
