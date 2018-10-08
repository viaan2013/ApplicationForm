package com.StepDefination;
import java.io.IOException;
import com.Utilities.PageObjectRepo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewOutcomeCreationStepDef extends PageObjectRepo{

	

	@Given("^I am in sales force homepage$")
	public void i_am_in_sales_force_homepage() throws Throwable {
		
	     globalHooks.salesforceHomepage();
	}

	@When("^I should see salesforce homepage$")
	public void i_should_see_salesforce_homepage() throws Throwable {

		newOutcomeCreationPage.assertionForsalesforceHomepage();

	}

	@When("^I select outcomes field from the tabs$")
	public void i_select_outcomes_field_from_the_tabs() throws Throwable {

		newOutcomeCreationPage.selectionOfOutcomeField();

	}

	@When("^I click on new button$")
	public void i_click_on_new_button() throws Throwable {

		newOutcomeCreationPage.clickOnNewButton();
	}

	@When("^I select \"([^\"]*)\" in the information$")
	public void i_select_in_the_information(String centre) throws Throwable {

		newOutcomeCreationPage.selectionOfCentre(centre);
	}

	@When("^I enter \"([^\"]*)\"$")
	public String i_enter(String Outcome) throws Throwable {
		
		newOutcomeCreationPage.enterOutcome(Outcome);
		return Outcome;

	}

	@When("^I click on Save button$")
	public void i_click_on_Save_button() throws Throwable {

		newOutcomeCreationPage.clickSaveButton();
		

	}
	@When("^I click on Add button in master courses$")
	public void i_click_on_Add_button_in_master_courses() throws Throwable {

		newOutcomeCreationPage.clickOnAddButton();
	}

	@When("^I enter the \"([^\"]*)\" name$")
	public void i_enter_the_name(String subject) throws Throwable {

		newOutcomeCreationPage.enterName(subject);

	}

	@When("^I click on Find button in master course$")
	public void i_click_on_Find_button_in_master_course() throws Throwable {

		newOutcomeCreationPage.clickOnFindButtonInMasterCourse();
	}

	@When("^I select course of that particular university$")
	public void i_select_course_of_that_particular_university() throws Throwable {

		newOutcomeCreationPage.selectCourseOfParticularUniversity();

	}

	@When("^I click on add selected button$")
	public void i_click_on_add_selected_button() throws Throwable {

		newOutcomeCreationPage.clickOnAddselectedButton();

	}

	@When("^I click on New Brand Outcome button$")
	public void i_click_on_New_Brand_Outcome_button() throws Throwable {

		newOutcomeCreationPage.clickOnNewBrandOutcomeButton();
	}

	@When("^I select \"([^\"]*)\" from parent record$")
	public void i_select_from_parent_record(String Brand) throws Throwable {

		newOutcomeCreationPage.selectFromParentRecord(Brand);

	}

	@When("^I click on Save brand outcome button$")
	public void i_click_on_Save_brand_outcome_button() throws Throwable {

		newOutcomeCreationPage.clickOnSaveBrandOutcomeButton();
		
	}

	@Then("^I should take a screenshot of Newoutcome$")
	public void i_should_take_a_screenshot_of_newoutcome() throws IOException, InterruptedException {

		newOutcomeCreationPage.takeAScreenShot();
		
	}

	@Given("^I am in Contentful homepage$")
	public void i_am_in_Contentful_homepage() throws Throwable {
		
	      globalHooks.contentfulHomepage();
	}

	@When("^I have selected Outcome option in dropdown$")
	public void i_have_selected_Outcome_option_in_dropdown() throws Throwable {

		newOutcomeCreationPage.selectOutcomeOption();
	}

	@When("^I enter \"([^\"]*)\" in search field in contentful$")
	public void i_enter_in_search_field_in_contentful(String outcome) throws Throwable {

		newOutcomeCreationPage.enterOutcomeInSearchField(outcome);
	}

	@Then("^I should see related outcome search results$")
	public void i_should_see_related_outcome_search_results() throws Throwable {

		newOutcomeCreationPage.assertionForRelatedOutcomeSearchResults();

	}
	@Then("^I should see right information$")
	public void i_should_see_right_information()throws Throwable {
		newOutcomeCreationPage.assertion();
		
	}

}

	
