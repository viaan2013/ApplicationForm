Feature: UK-English course
@English
Scenario Outline: Course selector-English

Given I am in course selector page
And I select "<Country>"
And I click on English language course link
And I select English "<type>"
And I select university option
When I click on show courses button
Then I should see searchresults page

Examples:
|Country|type|searchresults|
|gb|span.radiobtn|//div[@id='course-selector-container']/div/div[2]/app-search/div/app-search-results/div/div/div[2]/div/div[2]/h4|
|us|span.radiobtn|//div[@id='course-selector-container']/div/div[2]/app-search/div/app-search-results/div/div/div[2]/div/div[2]/h4|


