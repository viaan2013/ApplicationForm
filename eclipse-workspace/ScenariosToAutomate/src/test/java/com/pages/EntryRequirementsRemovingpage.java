package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.Utilities.PageObjectRepo;

public class EntryRequirementsRemovingpage extends PageObjectRepo {

	public void selectOutcomeFromDropdown() throws InterruptedException {

		WebElement outcome = driver.findElement(By.xpath("//div[@class='search__select-value']//select"));
		Select select = new Select(outcome);
		select.selectByVisibleText("Outcome");
		Thread.sleep(4000);
    }

	public void clickOnSearchText() {

		driver.findElement(By.cssSelector(".input-reset.search-next__query-input")).click();
	}

	public void scheduledCourseOptionInOutcome() {

		driver.findElement(By.cssSelector(".input-reset.search-next__query-input")).sendKeys("scheduledcourse");
		driver.findElement(By.cssSelector(".__filter-pill")).click();
		WebElement element = driver.findElement(By.xpath("//fieldset[@class='search-next__query-input-fieldset']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	}

	public void enterCourseTitle(String coursetitle) {

		driver.findElement(By.xpath("//input[@class='input-reset search-next__query-input']")).sendKeys(coursetitle);
		driver.findElement(By.xpath("//input[@class='input-reset search-next__query-input']")).sendKeys(Keys.ENTER);

	}

	public void selectCourseFromSearchResults(String course) {

		driver.findElement(By
				.cssSelector("a[href='/spaces/xw2h6mjophtz/environments/test-course-content/entries/" + course + "']"))
				.click();

		System.out.println("scheduledcourse = " + driver.getCurrentUrl());
	}

	public void selectScheduledCourseFromList(String scheduledcourses) throws InterruptedException {

		driver.findElement(By.xpath("" + scheduledcourses + "")).click();
		Thread.sleep(2000);
		String actual = driver.findElement(By.xpath("" + scheduledcourses + "")).getText();
		Assert.assertTrue(scheduledcourses.contains(actual));

	}

	public void selectEntryRequirementsFromScheduledCourse(String EntryRequirements) throws InterruptedException {

		driver.findElement(By.xpath("" + EntryRequirements + "")).click();
		Thread.sleep(3000);
		String courseUrl = driver.getCurrentUrl();
		System.out.println("Entry requirements =" + courseUrl);
	}

	public void pageScrollForSalesforceID() throws AWTException {

		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		
	}

	public void searchForScheduledCourseInSalesforce(String  URLWithsalesforceID) {
		
		driver.navigate().to("" + URLWithsalesforceID + "");
        Assert.assertEquals(URLWithsalesforceID, driver.getCurrentUrl());
    }
	public void takeScreenShot() throws IOException, InterruptedException {
		
		globalHooks.screenShot();
	}

	public void clickOnDeleteButton() throws InterruptedException {

		 driver.findElement(By.name("del")).click();
		 Thread.sleep(3000);
			
    }
	

	public void assertionForAlertBoxWithMessage() {

		String alertText = driver.switchTo().alert().getText();
		System.out.println("Alert text is " + alertText);
		Assert.assertEquals(alertText, "Are you sure?");
	
    }

	public void selectOkInAlertBox() throws InterruptedException {

		driver.switchTo().alert().accept();
		Thread.sleep(1000);
        System.out.println("passed");
		
    }
	public void AssertionForErrorMessage(String Course) {
		
		driver.navigate().to("https://intoglobal--iupsfuat.cs109.my.salesforce.com/"+ Course +"");
		Assert.assertEquals(driver.findElement(By.cssSelector("td > span")).getText(), "Record deleted");
	}
	
}
