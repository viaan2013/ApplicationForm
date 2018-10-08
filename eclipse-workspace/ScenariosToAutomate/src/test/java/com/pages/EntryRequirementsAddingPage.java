package com.pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.Utilities.PageObjectRepo;

public class EntryRequirementsAddingPage extends PageObjectRepo{
	
  public void selectEntryRequirementOption() {
		
		driver.findElement(By.className("allTabsArrow")).click();
		driver.findElement(By.xpath("//img[@title='Entry Requirements']")).click();
	}
	public void clickOnNewButton() {
		
		driver.findElement(By.name("new")).click();
	}
	public void enterDetailsInEntryRequirements(String EntryRequirementName) {
		
		driver.findElement(By.name("Name")).click();
		driver.findElement(By.name("Name")).sendKeys(EntryRequirementName);
	}
	public void selectQualificationType(String QualificationType) {
		
		WebElement dropdown = driver.findElement(By.name("00N3A00000CIUWt"));
		Select options = new Select(dropdown);
		options.selectByVisibleText(QualificationType);

	}
	public void enterAllOtherDetails(String QualificationCountry, String Qualification, String Requirement,
			String Writing, String Reading, String Speaking, String Listening, String Notes, String Internal_code) {
		
		       // Qualification country dropdown
				WebElement country = driver.findElement(By.name("00N3A00000CIUWs"));
				Select countryselection = new Select(country);
				countryselection.selectByVisibleText(QualificationCountry);

				// Qualification
				driver.findElement(By.name("00N3A00000CIUWu")).click();
				driver.findElement(By.name("00N3A00000CIUWu")).sendKeys(Qualification);

				// Requirement
				driver.findElement(By.name("00N3A00000CIUWw")).click();
				driver.findElement(By.name("00N3A00000CIUWw")).sendKeys(Requirement);

				// Writing
				driver.findElement(By.name("00N3A00000CIUWy")).click();
				driver.findElement(By.name("00N3A00000CIUWy")).sendKeys(Writing);

				// Reading
				driver.findElement(By.name("00N3A00000CIUWv")).click();
				driver.findElement(By.name("00N3A00000CIUWv")).sendKeys(Reading);

				// Speaking
				driver.findElement(By.name("00N3A00000CIUWx")).click();
				driver.findElement(By.name("00N3A00000CIUWx")).sendKeys(Speaking);

				// Listening
				driver.findElement(By.name("00N3A00000CIUWq")).click();
				driver.findElement(By.name("00N3A00000CIUWq")).sendKeys(Listening);

				// Notes
				driver.findElement(By.name("00N3A00000CIUWr")).click();
				driver.findElement(By.name("00N3A00000CIUWr")).sendKeys(Notes);

				// Internal_code
				driver.findElement(By.name("00N3A00000CIUWp")).click();
				driver.findElement(By.name("00N3A00000CIUWp")).sendKeys(Internal_code);

	}
	public void enterAllOtherDetailsForEnglishEntryRequirements(String qualification, String requirement,
			String writing, String reading, String speaking, String listening, String notes, String internal_code){
		
		
		// Qualification
		driver.findElement(By.name("00N3A00000CIUWu")).click();
		driver.findElement(By.name("00N3A00000CIUWu")).sendKeys(qualification);

		// Requirement
		driver.findElement(By.name("00N3A00000CIUWw")).click();
		driver.findElement(By.name("00N3A00000CIUWw")).sendKeys(requirement);

		// Writing
		driver.findElement(By.name("00N3A00000CIUWy")).click();
		driver.findElement(By.name("00N3A00000CIUWy")).sendKeys(writing);

		// Reading
		driver.findElement(By.name("00N3A00000CIUWv")).click();
		driver.findElement(By.name("00N3A00000CIUWv")).sendKeys(reading);

		// Speaking
		driver.findElement(By.name("00N3A00000CIUWx")).click();
		driver.findElement(By.name("00N3A00000CIUWx")).sendKeys(speaking);

		// Listening
		driver.findElement(By.name("00N3A00000CIUWq")).click();
		driver.findElement(By.name("00N3A00000CIUWq")).sendKeys(listening);

		// Notes
		driver.findElement(By.name("00N3A00000CIUWr")).click();
		driver.findElement(By.name("00N3A00000CIUWr")).sendKeys(notes);

		// Internal_code
		driver.findElement(By.name("00N3A00000CIUWp")).click();
		driver.findElement(By.name("00N3A00000CIUWp")).sendKeys(internal_code);

		}
	
	public void clickonSaveButton() {
		
		driver.findElement(By.cssSelector("#bottomButtonRow > input[name='save']")).click();
	}
	public void clickOnNewProductEntry() {
		
		driver.findElement(By.name("new00N3A00000CIUWz")).click();
	}
	public void selectScheduledCourseInProductTextBox(String scheduledcourse) {
		
		driver.findElement(By.name("CF00N3A00000CIUX0")).click();
		driver.findElement(By.name("CF00N3A00000CIUX0")).sendKeys(scheduledcourse);
	}
	public void takeScreenShot() throws IOException, InterruptedException {
		
		globalHooks.screenShot();
		driver.quit();
	}
	
	
	

}
