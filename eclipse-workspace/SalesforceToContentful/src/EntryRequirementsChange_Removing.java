import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class EntryRequirementsChange_Removing {
	WebDriver driver;
	
	@Before
	public void startup() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C://Users//Sruthi.Kundoor//Desktop//Automation//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://app.contentful.com/spaces/xw2h6mjophtz/environments/test-course-content/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.findElement(By.id("user_email")).click();
		driver.findElement(By.id("user_email")).sendKeys("charles.parvez@intoglobal.com");
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("Into3683");
		driver.findElement(By.name("commit")).click();
		Thread.sleep(5000);
	}
	
	@Test @Ignore
	public void academicEntryRequirements_Removing() throws InterruptedException, AWTException, IOException {

		WebElement outcome = driver.findElement(By.xpath("//div[@class='search__select-value']//select"));
		Select select = new Select(outcome);
		select.selectByIndex(26);
		Thread.sleep(4000);
		
		// Selecting scheduled course
		
		driver.findElement(By.cssSelector(".input-reset.search-next__query-input")).click();
		driver.findElement(By.cssSelector(".input-reset.search-next__query-input")).sendKeys("scheduledcourse");
		driver.findElement(By.cssSelector(".__filter-pill")).click();
		WebElement element = driver.findElement(By.xpath("//fieldset[@class='search-next__query-input-fieldset']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
		
		// Searching for course title
		
		driver.findElement(By.xpath("//input[@class='input-reset search-next__query-input']"))
				.sendKeys("International Year One in Business");
		driver.findElement(By.xpath("//input[@class='input-reset search-next__query-input']")).sendKeys(Keys.ENTER);

		driver.findElement(By.cssSelector(
				"a[href='/spaces/xw2h6mjophtz/environments/test-course-content/entries/aCI3A000000Caf5WAC']")).click();

		System.out.println("scheduledcourse = " + driver.getCurrentUrl());
		
		// Selecting Scheduled Course
		
		driver.findElement(By.xpath(
				"//div[@class='ReferenceCard__title'][text()='International Year One in Business - January Start - 3 Terms - NCL - 2018/19']"))
				.click();
		Thread.sleep(2000);
		String actual = driver.findElement(By.xpath(
				"//div[@class='ReferenceCard__title'][text()='International Year One in Business - January Start - 3 Terms - NCL - 2018/19']"))
				.getText();
		Assert.assertEquals("International Year One in Business - January Start - 3 Terms - NCL - 2018/19", actual);

		// Url with outcomeID and salesforceID

		System.out.println("Url with outcomeID and salesforceID=" + driver.getCurrentUrl());

		// Selecting Academic entry requirements

		driver.findElement(By.xpath("//div[@class='ReferenceCard__title'][text()='UK : Academic : A-Levels']")).click();
		Thread.sleep(3000);
		String academiccourseUrl = driver.getCurrentUrl();
		System.out.println("Academic entry requirements =" + academiccourseUrl);
		String expectedcourseUrl = "https://app.contentful.com/spaces/xw2h6mjophtz/environments/test-course-content/entries/01t3A000007GaTpQAK-aCJ3A000000GmbtWAC?previousEntries=aCI3A000000Caf5WAC,01t3A000007GaTpQAK";
		Assert.assertEquals(expectedcourseUrl, academiccourseUrl);

		// SalesforceID of Academic entry requirements

		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);

		driver.findElements(By.xpath("//input[@class='cf-form-input x--directed']")).get(14).click();
		Thread.sleep(2000);

		// Taking screenshot

		Robot r = new Robot();
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle screenRect = new Rectangle(screensize);
		BufferedImage image = r.createScreenCapture(screenRect);
		ImageIO.write(image, "png", new File("C://Users//Sruthi.Kundoor//Desktop//Screenshots/./img.png "
				+ ((Calendar.HOUR) + "11" + (Calendar.MINUTE) + "31") + ".png"));

		String salesforceID = driver.findElements(By.xpath("//input[@class='cf-form-input x--directed']")).get(14)
				.getText();
		System.out.println(salesforceID);

		// Navigating to Sales force

		driver.navigate().to("https://intoglobal--iupsfuat.cs109.my.salesforce.com");

		// User credentials for Sales force

		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("sruthi.kundoor@intoglobal.com.iupsfuat");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("Into1234");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(3000);

		// Searching for scheduled course in Sales force

		driver.navigate().to("https://intoglobal--iupsfuat.cs109.my.salesforce.com/aCJ3A000000GmbtWAC");
		String academiccourseURLinsalesforce = driver.getCurrentUrl();
		System.out.println(academiccourseURLinsalesforce);
		String ExpectedcourseURLinsalesforce = "https://intoglobal--iupsfuat.cs109.my.salesforce.com/aCJ3A000000GmbtWAC";
		Assert.assertEquals(ExpectedcourseURLinsalesforce, academiccourseURLinsalesforce);

		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Sruthi.Kundoor\\Desktop\\Screenshots/screenshot_" + timestamp() + ".png");
		FileUtils.copyFile(scr, dest);
		Thread.sleep(3000);

		// Deleting Academic course from Salesforce
		driver.findElement(By.name("del")).click();
		Alert simpleAlert = driver.switchTo().alert();
		String alertText = simpleAlert.getText();
		System.out.println("Alert text is " + alertText);
		simpleAlert.accept();
	}

	@Test
	public void englishLanguageEntryRequirements_Removing() throws InterruptedException, AWTException, IOException {
		
		WebElement outcome = driver.findElement(By.xpath("//div[@class='search__select-value']//select"));
		Select select = new Select(outcome);
		select.selectByIndex(26);
		Thread.sleep(3000);
		
		// Selecting scheduled course
		
		driver.findElement(By.cssSelector(".input-reset.search-next__query-input")).click();
		driver.findElement(By.cssSelector(".input-reset.search-next__query-input")).sendKeys("scheduledcourse");
		driver.findElement(By.cssSelector(".__filter-pill")).click();
		WebElement element = driver.findElement(By.xpath("//fieldset[@class='search-next__query-input-fieldset']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
		
		// Searching for course title
		
		driver.findElement(By.xpath("//input[@class='input-reset search-next__query-input']"))
				.sendKeys("International Year One in Business");
		driver.findElement(By.xpath("//input[@class='input-reset search-next__query-input']")).sendKeys(Keys.ENTER);

		driver.findElement(By.cssSelector(
				"a[href='/spaces/xw2h6mjophtz/environments/test-course-content/entries/aCI3A000000Caf5WAC']")).click();

		System.out.println("scheduledcourse = " + driver.getCurrentUrl());
		
		// Selecting Scheduled Course
		
		driver.findElement(By.xpath(
				"//div[@class='ReferenceCard__title'][text()='International Year One in Business - January Start - 3 Terms - NCL - 2018/19']"))
				.click();
		Thread.sleep(2000);
		String actual = driver.findElement(By.xpath(
				"//div[@class='ReferenceCard__title'][text()='International Year One in Business - January Start - 3 Terms - NCL - 2018/19']"))
				.getText();
		Assert.assertEquals("International Year One in Business - January Start - 3 Terms - NCL - 2018/19", actual);

		// Url with outcomeID and salesforceID

		System.out.println("Url with outcomeID and salesforceID=" + driver.getCurrentUrl());

		// Selecting EnglishLanguageEntry Requirements

		driver.findElement(By.xpath("//div[@class='ReferenceCard__title'][text()='Untitled']")).click();
		Thread.sleep(3000);
		String EnglishLanguagecourseUrl = driver.getCurrentUrl();
		System.out.println("EnglishLanguageEntry requirements =" + EnglishLanguagecourseUrl);
		String expectedcourseUrl = "https://app.contentful.com/spaces/xw2h6mjophtz/environments/test-course-content/entries/01t3A000007GaTpQAK-aCJ3A000000Gmc4WAC?previousEntries=aCI3A000000Caf5WAC,01t3A000007GaTpQAK";
		Assert.assertEquals(expectedcourseUrl, EnglishLanguagecourseUrl);

		// SalesforceID of EnglishLanguage entry requirements

		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);

		// Taking screenshot

		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Sruthi.Kundoor\\Desktop\\Screenshots/screenshot_" + timestamp() + ".png");
		FileUtils.copyFile(scr, dest);
		Thread.sleep(3000);


		// Navigating to Sales force

		driver.navigate().to("https://intoglobal--iupsfuat.cs109.my.salesforce.com");

		// User credentials for Sales force

		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("sruthi.kundoor@intoglobal.com.iupsfuat");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("Into1234");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(3000);

		// Searching for scheduled course in Sales force

		driver.navigate().to("https://intoglobal--iupsfuat.cs109.my.salesforce.com/aCJ3A000000Gmc4WAC");
		String academiccourseURLinsalesforce = driver.getCurrentUrl();
		System.out.println(academiccourseURLinsalesforce);
		String ExpectedcourseURLinsalesforce = "https://intoglobal--iupsfuat.cs109.my.salesforce.com/aCJ3A000000Gmc4WAC";
		Assert.assertEquals(ExpectedcourseURLinsalesforce, academiccourseURLinsalesforce);
		Thread.sleep(3000);

	
		
		File scr1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest1= new File("C:\\Users\\Sruthi.Kundoor\\Desktop\\Screenshots/screenshot_" + timestamp() + ".png");
		FileUtils.copyFile(scr1, dest1);
		Thread.sleep(3000);

		// Deleting EnglishLanuagecourse from Salesforce
		
		 driver.findElement(By.name("del")).click();
		 Alert simpleAlert = driver.switchTo().alert();
		String alertText = simpleAlert.getText();
		System.out.println("Alert text is " + alertText);
		simpleAlert.accept();

		}
	
	@Test
	public void AcademicLanguageEntryRequirements_Removing() throws InterruptedException, AWTException, IOException {
		
		WebElement outcome = driver.findElement(By.xpath("//div[@class='search__select-value']//select"));
		Select select = new Select(outcome);
		select.selectByIndex(26);
		Thread.sleep(4000);
		
		// Selecting scheduled course
		
		driver.findElement(By.cssSelector(".input-reset.search-next__query-input")).click();
		driver.findElement(By.cssSelector(".input-reset.search-next__query-input")).sendKeys("scheduledcourse");
		driver.findElement(By.cssSelector(".__filter-pill")).click();
		WebElement element = driver.findElement(By.xpath("//fieldset[@class='search-next__query-input-fieldset']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
		
		// Searching for course title
		
		driver.findElement(By.xpath("//input[@class='input-reset search-next__query-input']"))
				.sendKeys("International Year One in Business");
		driver.findElement(By.xpath("//input[@class='input-reset search-next__query-input']")).sendKeys(Keys.ENTER);

		driver.findElement(By.cssSelector(
				"a[href='/spaces/xw2h6mjophtz/environments/test-course-content/entries/aCI3A000000Caf5WAC']")).click();

		System.out.println("scheduledcourse = " + driver.getCurrentUrl());
		
		// Selecting Scheduled Course
		
		driver.findElement(By.xpath(
				"//div[@class='ReferenceCard__title'][text()='International Year One in Business - January Start - 3 Terms - NCL - 2018/19']"))
				.click();
		Thread.sleep(2000);
		String actual = driver.findElement(By.xpath(
				"//div[@class='ReferenceCard__title'][text()='International Year One in Business - January Start - 3 Terms - NCL - 2018/19']"))
				.getText();
		Assert.assertEquals("International Year One in Business - January Start - 3 Terms - NCL - 2018/19", actual);

		// Url with outcomeID and salesforceID

		System.out.println("Url with outcomeID and salesforceID=" + driver.getCurrentUrl());
		
		
		// Selecting AcademicLanguageEntry Requirements

		driver.findElement(By.xpath("//div[@class='ReferenceCard__title'][text()='China : Academic : University or Diploma Year 1']")).click();
		Thread.sleep(3000);
		String AcademicLanguagecourseUrl = driver.getCurrentUrl();
		System.out.println("AcademicLanguageEntry requirements =" + AcademicLanguagecourseUrl);
		String expectedcourseUrl = "https://app.contentful.com/spaces/xw2h6mjophtz/environments/test-course-content/entries/01t3A000007GaTpQAK-aCJ3A000000GmbqWAC?previousEntries=aCI3A000000Caf5WAC,01t3A000007GaTpQAK";
		Assert.assertEquals(expectedcourseUrl,AcademicLanguagecourseUrl);

		// SalesforceID of AcademicLanguage entry requirements

		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);

		// Taking screenshot

		
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Sruthi.Kundoor\\Desktop\\Screenshots/screenshot_" + timestamp() + ".png");
		FileUtils.copyFile(scr, dest);
		Thread.sleep(3000);


		
		// Navigating to Sales force

		driver.navigate().to("https://intoglobal--iupsfuat.cs109.my.salesforce.com");

		// User credentials for Sales force

		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("sruthi.kundoor@intoglobal.com.iupsfuat");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("Into5835");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(1000);
		

		// Searching for scheduled course in Sales force

		driver.navigate().to("https://intoglobal--iupsfuat.cs109.my.salesforce.com/aCJ3A000000GmbqWAC");
		String academiccourseURLinsalesforce = driver.getCurrentUrl();
		System.out.println(academiccourseURLinsalesforce);
		String ExpectedcourseURLinsalesforce = "https://intoglobal--iupsfuat.cs109.my.salesforce.com/aCJ3A000000GmbqWAC";
		Assert.assertEquals(ExpectedcourseURLinsalesforce, academiccourseURLinsalesforce);
		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Sruthi.Kundoor\\Desktop\\Screenshots/screenshot_" + timestamp() + ".png");
		FileUtils.copyFile(screenshot, destination);
		Thread.sleep(3000);

		
		// Deleting AcademicLanuagecourse from Sales force

		driver.findElement(By.name("del")).click();
		Alert simpleAlert = driver.switchTo().alert();
		String alertText = simpleAlert.getText();
		System.out.println("Alert text is " + alertText);
		simpleAlert.accept();

	}

	private String timestamp() {

		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

	@After
	public void teardown() {

		// driver.quit();

	}

}
