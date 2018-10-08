package com.pages;

import java.io.IOException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Utilities.PageObjectRepo;

public class NewOutcomeCreationPage extends PageObjectRepo{
	
	
	public void assertionForsalesforceHomepage() {
		
		Assert.assertTrue(
				driver.getCurrentUrl().contains("https://intoglobal--iupsfuat.cs109.my.salesforce.com/home/home.jsp"));
		
	}
	
	public void selectionOfOutcomeField() {
		
		driver.findElement(By.className("allTabsArrow")).click();
		driver.findElement(By.xpath("//img[@title='Outcomes']")).click();
	}
	
	public void clickOnNewButton() {
		
		driver.findElement(By.name("new")).click();
	}
	public void selectionOfCentre(String centre) {
		
		driver.findElement(By.id("CF00N3A00000CITIV")).clear();
		driver.findElement(By.id("CF00N3A00000CITIV")).click();
		driver.findElement(By.id("CF00N3A00000CITIV")).sendKeys(centre);
		
	}
	public String enterOutcome(String Outcome) {
		
		driver.findElement(By.id("00N3A00000CIUWf")).sendKeys(Outcome);
		System.out.println("Outcome= " + Outcome);
		return Outcome;
		
	}
	
	public String clickSaveButton() {
		
		driver.findElement(By.name("save")).click();
		String outcomeID = driver.findElement(By.cssSelector(".dataCol.col02")).getText();
		System.out.println("outcomeID = " + outcomeID);
		return outcomeID;
	
	}
	
	public void clickOnAddButton() {
		
		driver.findElement(By.id("Outcome:j_id1:MCOutcomeMaint:j_id3:j_id4:findAdd_lbl")).click();
	}
	public void enterName(String subject) throws InterruptedException {
		
		driver.findElement(By.name("Outcome:j_id1:MCOutcomeMaint:j_id3:j_id4:j_id59")).click();
		driver.findElement(By.name("Outcome:j_id1:MCOutcomeMaint:j_id3:j_id4:j_id59")).sendKeys(subject);
		Thread.sleep(2000);
	}
	
	public void clickOnFindButtonInMasterCourse() {
		
		
		driver.findElement(By.id("Outcome:j_id1:MCOutcomeMaint:j_id3:j_id4:j_id56")).click();
	}
	public void selectCourseOfParticularUniversity() throws InterruptedException {
		
		
		driver.findElement(By.name("Outcome:j_id1:MCOutcomeMaint:j_id3:j_id4:mcs:12:j_id73")).click();
		Thread.sleep(2000);
	}
	
	 public void clickOnAddselectedButton() throws InterruptedException {
		 
		 driver.findElement(By.id("Outcome:j_id1:MCOutcomeMaint:j_id3:j_id4:j_id69")).click();
		 Thread.sleep(2000);
 
	 }
	 public void clickOnNewBrandOutcomeButton() {
		 
			driver.findElement(By.name("new00N3A00000CITII")).click();
			Assert.assertEquals("New Brand Outcome", driver.findElement(By.className("pageDescription")).getText());
	 }
	 public void selectFromParentRecord(String Brand) {
		 
		 
		 driver.findElement(By.id("CF00N3A00000CITIH")).click();
		 driver.findElement(By.id("CF00N3A00000CITIH")).sendKeys(Brand);
	 }
	 public String clickOnSaveBrandOutcomeButton() {
		 
		driver.findElement(By.cssSelector("#bottomButtonRow > input[name='save']")).click();
		String Outcomename = driver.findElement(By.className("pageDescription")).getText();
		System.out.println("Outcomename =" + Outcomename);
		return Outcomename;
	 }
	 
	 public void takeAScreenShot() throws InterruptedException, IOException {
		 
	 globalHooks.screenShot();
	 
	 }
	 public void selectOutcomeOption() throws InterruptedException {
		 
		WebElement outcome = driver.findElement(By.xpath("//div[@class='search__select-value']//select"));
		Select select = new Select(outcome);
		select.selectByVisibleText("Outcome");
		Thread.sleep(4000);
	 }
	 
	 public void enterOutcomeInSearchField(String outcome) {
		 
		 
		driver.findElement(By.cssSelector(".input-reset.search-next__query-input")).click();
		driver.findElement(By.cssSelector(".input-reset.search-next__query-input")).sendKeys(outcome);
		driver.findElement(By.cssSelector("div[class='advice advice--row-aligned']")).click();
	 }
	 public void assertionForRelatedOutcomeSearchResults() {
		 
		 String error = driver.findElement(By.cssSelector(".header.advice__title.advice__title--normal")).getText();
		 Assert.assertEquals("Sadly, we didn't find anything matching your search", error);
	 }
	 public void assertion() {
	     String outcome=	driver.findElement(By.id("Name_ileinner")).getText();
	     System.out.println("outcome="+ outcome);
		 Assert.assertTrue(driver.getTitle().contains(outcome));
		 System.out.println("Passed New Brand Outcome");
	 }
	 
	
	 
	
	
	
	

}
