package usa;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class USAApplicationForm {
	public static WebDriver driver;

	@Before
	public  void startUp() {
		
		System.setProperty("webdriver.chrome.driver",
				"C://Users//Sruthi.Kundoor//Desktop//Automation//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://apply-staging.intostudy.com");
		System.out.println(driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void usaTestcases() throws InterruptedException, AWTException {
	// course selector

		driver.findElement(By.cssSelector("img[class='flag'][src='../assets/flags/flag-us.svg']")).click();
		driver.findElement(By.name("searchTerm")).click();
		driver.findElement(By.name("searchTerm")).sendKeys("social");
		driver.findElement(By.name("searchTerm")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("Undergraduate")).click();
		driver.findElement(By.cssSelector("label[for= 'Yes']")).click();
		driver.findElements(By.className("uni-list-item")).get(0).click();
		driver.findElement(By.cssSelector(".btn.btn-primary.search-button")).click();
		driver.findElement(By.xpath("//div/app-search-results/div/div/div[2]/div[2]/div/div/div[3]/button")).click();

		// your program session

		// 1st startdate in the list
		// driver.findElement(By.cssSelector("span.from")).click();

		// 2nd start date in the list
		// driver.findElement(By.xpath("//div/app-form-item[2]/app-scheduled-course-selector-question/div/div/div/div/ul/li[2]/div/div/span[2]")).click();

		// 3rd start date in the list
		driver.findElement(By.xpath(
				"//div/app-form-item[2]/app-scheduled-course-selector-question/div/div/div/div/ul/li[3]/div/div/span[2]"))
				.click();

		/*
		  //4th start date in the list driver.findElement(By.xpath(
		  "//div/app-form-item[2]/app-scheduled-course-selector-question/div/div/div/div/ul/li[4]/div/div/span[2]"
		  )).click();
		 */

		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		WebElement degree = driver.findElement(
				By.xpath("//div/app-form-item[3]/app-progression-selector-question/div/div/div/div[2]/div/div[2]/select"));
		Select progressiondegree = new Select(degree);
		progressiondegree.selectByValue("aCE3A000000TNirWAG");
		driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
			    
	    //About you session
			    
		driver.findElement(By.id("email")).sendKeys("deleteme@delete.com");
		driver.findElement(By.id("firstName")).sendKeys("03.08@USA regression");
		driver.findElement(By.id("lastName")).sendKeys("test");
		Select phone = new Select(driver.findElement(By.id("phone")));
		phone.selectByVisibleText("Antigua and Barbuda +1-268");
		driver.findElements(By.id("phone")).get(1).sendKeys("453246334654");
		driver.findElement(By.id("dateOfBirth_day")).sendKeys("20");
		Select month = new Select(driver.findElement(By.id("dateOfBirth_month")));
		month.selectByVisibleText("January");
		driver.findElement(By.id("dateOfBirth_year")).sendKeys("2000");
		Select nationality = new Select(driver.findElement(By.id("nationality")));
		nationality.selectByVisibleText("Egypt");
		driver.findElement(By.id("gender_f")).click();
        driver.findElement(By.id("address.addressLine1")).sendKeys("Brighton");
		driver.findElement(By.id("address.addressLine2")).sendKeys("surrey");
		driver.findElement(By.id("address.addressLine3")).sendKeys("line3");
		driver.findElement(By.id("address.towncity")).sendKeys("Brighton");
		driver.findElement(By.id("address.stateregion")).sendKeys("east croydon");
		driver.findElement(By.id("address.zipcode")).sendKeys("rh6 8Gh");
		Select countryfield = new Select(driver.findElement(By.id("address.country")));
		countryfield.selectByVisibleText("Russia");
		driver.findElement(By.xpath("//div/app-form-item[8]/app-section/fieldset/app-form-item-container/div/app-form-item[2]/app-boolean-question/div/div[2]/div/div/button")).click();
	    driver.findElement(By.id("correspondenceAddress.addressLine1")).click();
	    driver.findElement(By.id("correspondenceAddress.addressLine1")).sendKeys("Brighton");
	    driver.findElement(By.id("correspondenceAddress.addressLine2")).click();
	    driver.findElement(By.id("correspondenceAddress.addressLine2")).sendKeys("addressline2");
	    driver.findElement(By.id("correspondenceAddress.addressLine3")).click();
	    driver.findElement(By.id("correspondenceAddress.addressLine3")).sendKeys("addressline3");
	    driver.findElement(By.id("correspondenceAddress.towncity")).click();
	    driver.findElement(By.id("correspondenceAddress.towncity")).sendKeys("town");
	    driver.findElement(By.id("correspondenceAddress.stateregion")).click();
	    driver.findElement(By.id("correspondenceAddress.stateregion")).sendKeys("state");
	    driver.findElement(By.id("correspondenceAddress.zipcode")).click();
	    driver.findElement(By.id("correspondenceAddress.zipcode")).sendKeys("RH6 7HG");
	    
	    Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		
	    WebElement country= driver.findElement(By.id("correspondenceAddress.country"));
	    Select secondcountry=new Select(country);
	    secondcountry.selectByVisibleText("Andorra");
	    driver.findElement(By.cssSelector("div.col.text-right > span.ng-star-inserted > button.btn.btn-primary")).click();
	    
	    //Education History
	    
	    driver.findElement(By.id("currentInstitution")).click();
	    driver.findElement(By.id("currentInstitution")).sendKeys("JNTU");
	    driver.findElement(By.id("qualificationName")).click();
	    driver.findElement(By.id("qualificationName")).sendKeys("Qualification");
	    driver.findElement(By.id("otherPastStudies")).click();
	    driver.findElement(By.id("otherPastStudies")).sendKeys("Past studies");
	    driver.findElement(By.xpath("//div/app-form-item[2]/app-section/fieldset/app-form-item-container/div/app-form-item/app-boolean-question/div/div[2]/div/div/button")).click();
	    driver.findElement(By.xpath("//div/app-form-item[2]/app-multiple-choice-question/div/div[2]/div/label[2]/span")).click();
	    driver.findElement(By.xpath("//div/app-form-item[3]/app-section/fieldset/app-form-item-container/div/app-form-item/app-boolean-question/div/div[2]/div/div/button")).click();
	    driver.findElement(By.xpath("//div/app-form-item[3]/app-section/fieldset/app-form-item-container/div/app-form-item[2]/app-multiple-choice-question/div/div[2]/div/label[3]/span")).click();
	    driver.findElement(By.xpath("//div/app-form-item[4]/app-section/fieldset/app-form-item-container/div/app-form-item/app-boolean-question/div/div[2]/div/div/button")).click();
	    driver.findElement(By.xpath("//div/app-form-item[4]/app-section/fieldset/app-form-item-container/div/app-form-item[2]/app-boolean-question/div/div[2]/div/div/button")).click();
	    driver.findElement(By.id("qualificationStudyingInUnaccountedGap")).click();
	    driver.findElement(By.id("qualificationStudyingInUnaccountedGap")).sendKeys("4months gap");
	    driver.findElement(By.cssSelector("div.col.text-right > span.ng-star-inserted > button.btn.btn-primary")).click();
	    
	    //Additional information
	    
	    //yes for education counsellor
	    
	   /* driver.findElement(By.xpath("//div/app-form-item[3]/app-section/fieldset/app-form-item-container/div/app-form-item/app-boolean-question/div/div[2]/div/div/button")).click();
	    driver.findElement(By.id("educationCounsellor")).click();
	    driver.findElement(By.id("educationCounsellor")).sendKeys("education counsellor");
	    Thread.sleep(5000);*/
	    
	    // No for education counsellor
	    
	  driver.findElement(By.xpath("//div/app-form-item[3]/app-section/fieldset/app-form-item-container/div/app-form-item/app-boolean-question/div/div[2]/div/div/button[2]")).click();
	   
	    driver.findElement(By.xpath("//div/app-form-item[4]/app-section/fieldset/app-form-item-container/div/app-form-item/app-boolean-question/div/div[2]/div/div/button")).click();
	    driver.findElement(By.xpath("//div/app-form-item[2]/app-boolean-question/div/div[2]/div/div/button")).click();
	    driver.findElement(By.xpath("//div/app-form-item[4]/app-section/fieldset/app-form-item-container/div/app-form-item[3]/app-boolean-question/div/div[2]/div/div/button")).click();
	    driver.findElement(By.id("dualCitizenshipInformation")).click();
	    driver.findElement(By.id("dualCitizenshipInformation")).sendKeys("Dual citizenship");
	    driver.findElement(By.xpath("//div/app-form-item[4]/app-section/fieldset/app-form-item-container/div/app-form-item[5]/app-boolean-question/div/div[2]/div/div/button")).click();
	    driver.findElement(By.id("numberOfDependents")).click();
	    driver.findElement(By.id("numberOfDependents")).sendKeys("2");
	    driver.findElement(By.cssSelector("div.col.text-right > span.ng-star-inserted > button.btn.btn-primary")).click();
	    
	    //Terms and Conditions
	    
	    driver.findElement(By.cssSelector("button.btn.btn-outline-secondary")).click();
	    driver.findElement(By.cssSelector("button.btn.btn-outline-secondary")).click();
	    driver.findElement(By.cssSelector("button.btn.btn-outline-secondary")).click();
	    driver.findElement(By.cssSelector("div.col.text-right > span.ng-star-inserted > button.btn.btn-primary")).click();
	    Thread.sleep(5000);
	    String Expectedurl="https://www.intostudy.com/en-gb/apply/thank-you-for-applying-us";
		String Actualurl=driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		Assert.assertEquals(Expectedurl,Actualurl);
	}
	@After
	public void tearDown() {
		driver.close();
	    
		
	}

}
