package com.StepDefination;

import com.Utilities.PageObjectRepo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EntryRequirementsRemovingStepDef extends PageObjectRepo{
	

	@Given("^I am in test-course-content homepage in contentful$")
	public void i_am_in_test_course_content_homepage_in_contentful() throws Throwable {
		
	
		globalHooks.contentfulHomepage();
	}

	@Given("^I click and select outcome option in dropdown$")
	public void i_click_and_select_outcome_option_in_dropdown() throws Throwable {

		entryRequirementsRemoving.selectOutcomeFromDropdown();
	}

	@Given("^I click on search text box$")
	public void i_click_on_search_text_box() throws Throwable {

		entryRequirementsRemoving.clickOnSearchText();

	}

	@Given("^I select scheduled course option in outcome$")
	public void i_select_scheduled_course_option_in_outcome() throws Throwable {

		entryRequirementsRemoving.scheduledCourseOptionInOutcome();
	}

	@When("^I enter \"([^\"]*)\" in searchbox$")
	public void i_enter_in_searchbox(String coursetitle) throws Throwable {

		entryRequirementsRemoving.enterCourseTitle(coursetitle);

	}

	@When("^I select \"([^\"]*)\" from search results and click on it$")
	public void i_select_from_search_results_and_click_on_it(String course) throws Throwable {

		entryRequirementsRemoving.selectCourseFromSearchResults(course);

	}

	@When("^I select one of the \"([^\"]*)\" from the list and click$")
	public void i_select_one_of_the_from_the_list_and_click(String scheduledcourses) throws Throwable {

		entryRequirementsRemoving.selectScheduledCourseFromList(scheduledcourses);

	}

	@When("^I select one of the \"([^\"]*)\"from the selected scheduled course$")
	public void i_select_one_of_the_from_the_selected_scheduled_course(String EntryRequirements) throws Throwable {

		entryRequirementsRemoving.selectEntryRequirementsFromScheduledCourse(EntryRequirements);
	}

	@When("^I  do the page scroll for salesforce ID of that course$")
	public void i_do_the_page_scroll_for_salesforce_ID_of_that_course() throws Throwable {

		entryRequirementsRemoving.pageScrollForSalesforceID();

	}

	@When("^I navigate to salesforce url$")
	public void i_navigate_to_salesforce_url() throws Throwable {
		
	 globalHooks.salesforceHomepage();

	}

	@When("^I search for scheduledcourse in salesforce with \"([^\"]*)\"$")
	public void i_search_for_scheduledcourse_in_salesforce_with(String URLWithsalesforceID) throws Throwable {

		entryRequirementsRemoving.searchForScheduledCourseInSalesforce(URLWithsalesforceID);

	}

	@When("^I take a screenshot for of that for future use$")
	public void i_take_a_screenshot_for_of_that_for_future_use() throws Throwable {

		entryRequirementsRemoving.takeScreenShot();
	}

	@When("^I click on delete button$")
	public void i_click_on_delete_button() throws Throwable {

		entryRequirementsRemoving.clickOnDeleteButton();

	}

	@Then("^I should see alert box with message$")
	public void i_should_see_alert_box_with_message() throws Throwable {

		entryRequirementsRemoving.assertionForAlertBoxWithMessage();
		
	}

	@Then("^I select ok in the alert box$")
	public void i_select_ok_in_the_alert_box() throws Throwable {

		entryRequirementsRemoving.selectOkInAlertBox();
		

	}
	@Then("^I should see record deleted message for that particular\"([^\"]*)\"$")
	public void i_should_see_record_deleted_message_for_that_particular(String Course) throws Throwable {
		
		entryRequirementsRemoving.AssertionForErrorMessage(Course);
	}



	

}
