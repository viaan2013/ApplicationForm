package com.StepDefination;

import com.Utilities.PageObjectRepo;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CourseAvalableOnlineStepDef extends PageObjectRepo {
	
    @Before 
    public void driverIntialisation() {
    	
    	System.out.println("Inside driver Intialisation Method");
    	globalHooks.startUp();
    	
    }
    
	@Given("^I am in Contentful home page$")
	public void i_am_in_Contentful_home_page() throws Throwable {
		
	  globalHooks.contentfulHomepage();
		
   }

	@When("^I select Outcome in the dropdown$")
	public void i_select_Outcome_in_the_dropdown() throws Throwable {

		courseAvailableOnline.selectOutcomeOption();

	}

	@When("^I select scheduledcourse in the outcome$")
	public void i_select_scheduledcourse_in_the_outcome() throws Throwable {

		courseAvailableOnline.selectScheduledCourseInOutcocme();
	}

	@When("^I enter \"([^\"]*)\" in search area$")
	public void i_enter_in_search_area(String Coursetitle) throws Throwable {

		courseAvailableOnline.enterCourseTitle(Coursetitle);
	}

	@When("^I click on search button$")
	public void i_click_on_search_button() throws Throwable {

		courseAvailableOnline.clickOnSearchButton();
		

	}
	@When("^I select \"([^\"]*)\"in search results$")
	public void i_select_in_search_results(String ScheduledCourse) throws Throwable {
		
		courseAvailableOnline.clickOnScheduledCourseInSearchResults(ScheduledCourse);
		
	}
	@When("^I click on that selected \"([^\"]*)\"from search results$")
	public void i_click_on_that_selected_from_search_results(String course) throws Throwable {
		
		courseAvailableOnline.clickOnSelectedCourse(course);
	}
	
	@When("^I am navigating to salesforce$")
	public void i_am_navigating_to_salesforce() throws Throwable {
		
         
		 globalHooks.salesforceHomepage();

	}

	@Given("^I am navigating to salesforce homepage$")
	public void i_am_navigating_to_salesforce_homepage() throws Throwable {
		 globalHooks.startUp();
         globalHooks.salesforceHomepage();
	} 

	@When("^I am searching for scheduled course with \"([^\"]*)\"$")
	public void i_am_searching_for_scheduled_course_with(String salesforceID) throws Throwable {

		courseAvailableOnline.searchingForScheduledCourse(salesforceID);
		
	}

	@When("^I scroll the page to see Available online option$")
	public void i_scroll_the_page_to_see_Available_online_option() throws Throwable {

		courseAvailableOnline.pageScrollDown();

	}

	@When("^I am double click on Available online option$")
	public void i_am_double_click_on_Available_online_option() throws Throwable {

		courseAvailableOnline.doubleClickOnAvailableOption();

	}

	@When("^I click on save button$")
	public void i_click_on_save_button() throws Throwable {
		courseAvailableOnline.clickOnSaveButton();
	}

	@Then("^I should see available online option unticked$")
	public void i_should_see_available_online_option_unticked() throws Throwable {
		
		globalHooks.screenShot();
		courseAvailableOnline.assertionForUntickedAvailableOption();
      
       
        
	}

	@When("^I am searching for scheduled course with \"([^\"]*)\" which are having unticked available online option$")
	public void i_am_searching_for_scheduled_course_with_which_are_having_unticked_available_online_option(
			String salesforceID) throws Throwable {

		courseAvailableOnline.searchingForScheduledCourseWithUntickedAvailableOption(salesforceID);

	}

	@Then("^I should see Available online option ticked$")
	public void i_should_see_Available_online_option_ticked() throws Throwable {

		courseAvailableOnline.assertionForTickedAvailableOption();
        globalHooks.screenShot();
     

	}
	
	@After
	public void tearDown() {
		System.out.println("Inside teardown method");
		globalHooks.tearDown();
	}

   
}
