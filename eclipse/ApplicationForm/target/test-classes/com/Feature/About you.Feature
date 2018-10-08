Feature: AboutYou
@aboutyou
Scenario Outline:
Given I am in AboutYou session of UK_applicationform
When I enter "<email>","<firstname>","<lastname>","<phoneNumber>"
And I select "<Date>","<month>","<year>"
And I select "<gender>"gender
And I select"<countryofnationality>"
And I select "<Line1>","<Line2>","<Line3>","<Town>","<City>","<State>","<Zipcode>"
And I select "<Country>" from dropdown
And I click on next button
Then I should see additional information session of application form

Examples:
|email|firstname|lastname|phoneNumber|date|month|year|gender|countryofnationality|Line1|Line2|Line3|Town|City|State|Zipcode|Country|
|sru@j.l|sru|@submit|645263426|21|September|1904|gender_f|Pakistan|brighton|surrey|college|brighton|UK|UK|5643564536|Germany|
|sru@c.o|sruthi|@sf|6452634264324|9|October|2000|gender_m|Egypt|sussex|surrey|threebridges|brighton|UK|USA|rh1 1hh|Russia|