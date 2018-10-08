package com.StepDefination;
import java.io.IOException;
import com.Utilities.PageObjectRepo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EntryRequirementsAddingStepDef extends PageObjectRepo{

	@Given("^I am in Salesforce Login page$")
	public void i_am_in_Salesforce_Login_page() throws Throwable {
		
       globalHooks.salesforceHomepage();
     }

	@When("^I select Entry requiremnts option in salesforce$")
	public void i_select_Entry_requiremnts_option_in_salesforce() throws Throwable {

		entryRequirementsAdding.selectEntryRequirementOption();

	}

	@When("^I click on New button$")
	public void i_click_on_New_button() throws Throwable {

		entryRequirementsAdding.clickOnNewButton();

	}

	@When("^I enter deails in \"([^\"]*)\"$")
	public void i_enter_deails_in(String EntryRequirementName) throws Throwable {

		entryRequirementsAdding.enterDetailsInEntryRequirements(EntryRequirementName);

	}

	@When("^I select \"([^\"]*)\"$")
	public void i_select(String QualificationType) throws Throwable {

		entryRequirementsAdding.selectQualificationType(QualificationType);
	}

	@When("^I enter details in \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and \"([^\"]*)\"$")
	public void i_enter_details_in_and(String QualificationCountry, String Qualification, String Requirement,
			String Writing, String Reading, String Speaking, String Listening, String Notes, String Internal_code)
			throws Throwable {
		entryRequirementsAdding.enterAllOtherDetails(QualificationCountry, Qualification, Requirement, Writing, Reading, Speaking, Listening, Notes, Internal_code);
		
	}
	@When("^I enter details in englishentryrequirements \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and \"([^\"]*)\"$")
	public void i_enter_details_in_and(String qualification, String requirement, String  writing, String reading, String speaking, String listening, String  notes, String internal_code) throws Throwable {
		
		
		entryRequirementsAdding.enterAllOtherDetailsForEnglishEntryRequirements(qualification, requirement, writing, reading, speaking, listening, notes, internal_code);
		
	}


	@When("^I click on Save button at the bottom row$")
	public void i_click_on_Save_button_at_the_bottom_row() throws Throwable {
		
		entryRequirementsAdding.clickonSaveButton();
	}

	@When("^I clik on New Product Entry$")
	public void i_clik_on_New_Product_Entry() throws Throwable {

		entryRequirementsAdding.clickOnNewProductEntry();

	}

	@When("^I select \"([^\"]*)\" in Product text box$")
	public void i_select_in_Product_text_box(String scheduledcourse) throws Throwable {

		entryRequirementsAdding.selectScheduledCourseInProductTextBox(scheduledcourse);

	}

	@Then("^I take screenshot for future use$")
	public void i_take_screenshot_for_future_use() throws IOException, InterruptedException {

		entryRequirementsAdding.takeScreenShot();
		
    }

	
}


