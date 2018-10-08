package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.Utilities.PageObjectRepo;

public class CourseAvailableOnlinePage extends PageObjectRepo{
	
	
	public void selectOutcomeOption() throws InterruptedException {
		
		WebElement outcome = driver.findElement(By.xpath("//div[@class='search__select-value']//select"));
		Select select = new Select(outcome);
		select.selectByVisibleText("Outcome");
		Thread.sleep(5000);
		
	}

	public void selectScheduledCourseInOutcocme() {
		
		driver.findElement(By.cssSelector(".input-reset.search-next__query-input")).click();
		driver.findElement(By.cssSelector(".input-reset.search-next__query-input")).sendKeys("scheduledcourse");
		driver.findElement(By.cssSelector(".__filter-pill")).click();
		WebElement element = driver.findElement(By.xpath("//fieldset[@class='search-next__query-input-fieldset']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
		
		
	}
	public void enterCourseTitle(String Coursetitle ){
		
		driver.findElement(By.xpath("//input[@class='input-reset search-next__query-input']")).sendKeys(Coursetitle);

	}
	public void clickOnSearchButton() {
		
		driver.findElement(By.xpath("//input[@class='input-reset search-next__query-input']")).sendKeys(Keys.ENTER);
	}
	
	public void clickOnScheduledCourseInSearchResults(String ScheduledCourse) {
		
		driver.findElement(By.cssSelector(
				"a[href='/spaces/xw2h6mjophtz/environments/test-course-content/entries/"+ScheduledCourse+"']")).click();
	  
	}
	public void clickOnSelectedCourse(String course) throws InterruptedException {
		
		driver.findElement(By.xpath(""+course+"")).click();
		Thread.sleep(5000);
		
	}
	
	public void searchingForScheduledCourse(String salesforceID) {
		
		driver.navigate().to("https://intoglobal--iupsfuat.cs109.my.salesforce.com/" + salesforceID + "");
		String Actualcourse = driver.findElement(By.id("Name_ileinner")).getText();
		System.out.println(Actualcourse);
		
		
	}
	public void pageScrollDown() throws AWTException {
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		
	}
	
	public void doubleClickOnAvailableOption() throws InterruptedException {
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("00N30000006G28a_chkbox"))).doubleClick().build().perform();
		Thread.sleep(5000);
		driver.findElement(By.id("00N30000006G28a")).click();
		Thread.sleep(5000);
	}
	
	public void clickOnSaveButton() throws InterruptedException  {
		
		driver.findElement(By.name("inlineEditSave")).click();
		Thread.sleep(5000);

	}
	
	public void assertionForUntickedAvailableOption() throws AWTException  {
		
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("00N30000006G28a_chkbox"))).doubleClick().build().perform();
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='00N30000006G28a']")).isSelected());
		System.out.println("checkbox is unticked");
		
	}
	
	public void assertionForTickedAvailableOption() throws AWTException {
		
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("00N30000006G28a_chkbox"))).doubleClick().build().perform();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='00N30000006G28a']")).isSelected());
		System.out.println("Checkbox is ticked");
			
		
     }	
	
	
  public void searchingForScheduledCourseWithUntickedAvailableOption(String salesforceID) {
		
		driver.navigate().to("https://intoglobal--iupsfuat.cs109.my.salesforce.com/" + salesforceID + "");
		
	}
}
