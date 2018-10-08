package com.StepDefination;


import com.Utilities.PageObjectRepo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductProgressionStepDef extends PageObjectRepo{

	@Given("^I am in contentful home page$")
	public void i_am_in_contentful_home_page() throws Throwable {
		
	   globalHooks.contentfulHomepage();
      
	}

	@When("^I select Outcome option in the dropdown$")
	public void i_select_Outcome_option_in_the_dropdown() throws Throwable {

		productProgressionPage.selectOutcomeOption();

	}

	@When("^I select scheduledcourse in the outcome option$")
	public void i_select_scheduledcourse_in_the_outcome_option() throws Throwable {

		productProgressionPage.selectScheduledCourseInOutcome();

	}

	@When("^I enter \"([^\"]*)\" in outcome search area$")
	public void i_enter_in_outcome_search_area(String courseTitle) throws Throwable {

		productProgressionPage.searchCourseTitle(courseTitle);
	}

	@When("^I select \"([^\"]*)\" from search results$")
	public void i_select_from_search_results(String Course) throws Throwable {

		productProgressionPage.selectCourseFromSearchresults(Course);

	}

	@When("^I select \"([^\"]*)\" from list$")
	public void i_select_from_list(String scheduledCourse) throws Throwable {

		productProgressionPage.selectScheduledCourse(scheduledCourse);
	}

	@When("^I print URL with outcomeID and salesforceID$")
	public void i_print_URL_with_outcomeID_and_salesforceID() throws Throwable {

		productProgressionPage.printURLWithOutcomeID();

	}

	@When("^I click on \"([^\"]*)\" related to that scheduledcourse$")
	public void i_click_on_related_to_that_scheduledcourse(String productProgression) throws Throwable {

		productProgressionPage.clickOnProductProgressionCourse(productProgression);
	}

	@When("^I print the URL$")
	public void i_print_the_URL() throws Throwable {

		productProgressionPage.printProductProgressionURL();

	}

	@Then("^I navigate to salesforce$")
	public void i_navigate_to_salesforce() throws Throwable {
		
		globalHooks.salesforceHomepage();

	}

     @Then("^I search for \"([^\"]*)\" in the salesforce url$")
	public void i_search_for_in_the_salesforce_url(String scheduledcourse) throws Throwable {

    	 productProgressionPage.searchForScheduledCourseInSalesforce(scheduledcourse);

	}

	@Then("^I click on productprogression inactive option$")
	public void i_click_on_productprogression_inactive_option() throws Throwable {

		productProgressionPage.clickOnProductProgressionInactiveOption();
	}

	@Then("^I click on Save button in salesforce$")
	public void i_click_on_Save_button_in_salesforce() throws Throwable {

		productProgressionPage.clickOnSaveButton();

	}

	@Given("^I navigate to salesforce homepage$")
	public void i_navigate_to_salesforce_homepage() throws Throwable {
		
		globalHooks.salesforceHomepage();
	}

	@When("^I am searching for \"([^\"]*)\" which are having unticked Productprogression inactive option$")
	public void i_am_searching_for_which_are_having_unticked_Productprogression_inactive_option(
			String progressiondegree) throws Throwable {

		productProgressionPage.searchingForProgressionDegreeWithuntickedProductprogressioninactiveOption(progressiondegree);
	}
	
  @Then("^I should see product progression inactive option ticked$")
	public void i_should_see_product_progression_inactive_option_ticked() throws Throwable {

	  productProgressionPage.assertionForTickedProductProgression();

	}
  @Then("^I should see product progression option is unticked$")
	public void i_should_see_product_progression_option_is_unticked() throws Throwable {
		
     productProgressionPage.assertionForUntickedProductProgression();

   }

   }
	


