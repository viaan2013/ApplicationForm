package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.Utilities.PageObjectRepo;


public class ProductProgressionPage extends PageObjectRepo{
	
  
	public void selectOutcomeOption() throws InterruptedException {
		
		WebElement outcome = driver.findElement(By.xpath("//div[@class='search__select-value']//select"));
	    Select select = new Select(outcome);
		select.selectByVisibleText("Outcome");
		Thread.sleep(6000);

   }
	
	public void selectScheduledCourseInOutcome() {
		
		driver.findElement(By.cssSelector(".input-reset.search-next__query-input")).click();
		driver.findElement(By.cssSelector(".input-reset.search-next__query-input")).sendKeys("scheduledcourse");
		driver.findElement(By.cssSelector(".__filter-pill")).click();

   }
	
	public void searchCourseTitle(String courseTitle) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@class='input-reset search-next__query-input']")).sendKeys(courseTitle);
		driver.findElement(By.xpath("//input[@class='input-reset search-next__query-input']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);

   }
	
	public void selectCourseFromSearchresults(String Course) throws InterruptedException {
		
		driver.findElement(By
				.cssSelector("a[href='/spaces/xw2h6mjophtz/environments/test-course-content/entries/"+Course+"']"))
				.click();
		Thread.sleep(4000);

	}
	
	public void selectScheduledCourse(String scheduledCourse) throws InterruptedException {
		
		driver.findElement(By.xpath("" + scheduledCourse + "")).click();
		Thread.sleep(1000);
		String actual = driver.findElement(By.xpath("" + scheduledCourse + "")).getText();

		System.out.println("actualcourse = " + actual);
		
		
	}
	
	public void printURLWithOutcomeID() {
		
		System.out.println("scheduledcourse with outcome ID and salesforceID = " + driver.getCurrentUrl());
	}
	
	
	public void clickOnProductProgressionCourse(String productProgression) throws InterruptedException {
		
		driver.findElement(By.xpath("" + productProgression + "")).click();
		Thread.sleep(2000);
		String actual = driver.findElement(By.xpath("" + productProgression + "")).getText();
		System.out.println("productprogression =" + actual);
		Thread.sleep(6000);
	}
	
	public void printProductProgressionURL() {
		
		String productprogression = driver.getCurrentUrl();
		System.out.println("productprogressionURL = " + productprogression);

     }
	
	
	public void searchForScheduledCourseInSalesforce(String scheduledcourse) {
		
		driver.navigate().to("https://intoglobal--iupsfuat.cs109.my.salesforce.com/" + scheduledcourse + " ");
		
	}
	
	public void clickOnProductProgressionInactiveOption() throws InterruptedException {
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("00N3A00000CITIf_chkbox"))).doubleClick().build().perform();
		Thread.sleep(3000);
		driver.findElement(By.id("00N3A00000CITIf")).click();
		Thread.sleep(2000);
		
	}
	 
	public void clickOnSaveButton() throws InterruptedException {
		
		driver.findElement(By.cssSelector("#bottomButtonRow > input[name=\"inlineEditSave\"]")).click();
		Thread.sleep(9000);
		String EndUrl = driver.getCurrentUrl();
		System.out.println("EndUrl =" + EndUrl);
		
	}
	
	public void searchingForProgressionDegreeWithuntickedProductprogressioninactiveOption(String progressiondegree) {
		
		driver.navigate().to("https://intoglobal--iupsfuat.cs109.my.salesforce.com/" + progressiondegree + "");
		
	}
	
	public void assertionForTickedProductProgression() {
		
	
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("00N3A00000CITIf_chkbox"))).doubleClick().build().perform();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='00N3A00000CITIf']")).isSelected());
		System.out.println("checkbox is ticked");
		
	}
		
   public void assertionForUntickedProductProgression() {

		
        Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("00N3A00000CITIf_chkbox"))).doubleClick().build().perform();
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='00N3A00000CITIf']")).isSelected());
		System.out.println("checkbox is unticked");
					
	}	
		
}
