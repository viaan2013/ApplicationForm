
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class CourseAvailableOnline {
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

	@Test 
	@Ignore
	public void courseAvailableOnlineTrueToFalse() throws InterruptedException, AWTException {
		
		//Selecting outcome
		WebElement outcome = driver.findElement(By.xpath("//div[@class='search__select-value']//select"));
		Select select = new Select(outcome);
		select.selectByIndex(26);
		Thread.sleep(2000);
		
		//Selecting scheduled course
		
		driver.findElement(By.cssSelector(".input-reset.search-next__query-input")).click();
		driver.findElement(By.cssSelector(".input-reset.search-next__query-input")).sendKeys("scheduledcourse");
		driver.findElement(By.cssSelector(".__filter-pill")).click();
		WebElement element = driver.findElement(By.xpath("//fieldset[@class='search-next__query-input-fieldset']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
		
		//Searching for course title
		
		driver.findElement(By.xpath("//input[@class='input-reset search-next__query-input']"))
				.sendKeys("International Year One in Business");
		driver.findElement(By.xpath("//input[@class='input-reset search-next__query-input']")).sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector(
				"a[href='/spaces/xw2h6mjophtz/environments/test-course-content/entries/aCI3A000000Caf5WAC']")).click();
		
		//Selecting Scheduled Course
		
		driver.findElement(By.xpath(
				"//div[@class='ReferenceCard__title'][text()='International Year One in Business - January Start - 3 Terms - NCL - 2018/19']"))
				.click();
		Thread.sleep(2000);
		String actual = driver.findElement(By.xpath(
				"//div[@class='ReferenceCard__title'][text()='International Year One in Business - January Start - 3 Terms - NCL - 2018/19']"))
				.getText();
		Assert.assertEquals("International Year One in Business - January Start - 3 Terms - NCL - 2018/19", actual);
		
		//Url with outcomeID and salesforceID
		
		System.out.println(driver.getCurrentUrl());
		
		//Navigating to Sales force 
		
        driver.navigate().to("https://intoglobal--iupsfuat.cs109.my.salesforce.com");
        
        //User credentials for Sales force
        
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("sruthi.kundoor@intoglobal.com.iupsfuat");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("Into1234");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(3000);
		
		//Searching for scheduled course in Sales force
		
		driver.navigate().to("https://intoglobal--iupsfuat.cs109.my.salesforce.com/01t3A000007GaTpQAK");
		String Actualcourse = driver.findElement(By.id("Name_ileinner")).getText();
		String expectedcourse= "International Year One in Business - January Start - 3 Terms - NCL - 2018/19";
		Assert.assertEquals(expectedcourse, Actualcourse);
		System.out.println(Actualcourse);
		
	   //For page down
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		
		//Clicking on available online option
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("00N30000006G28a_chkbox"))).doubleClick().build().perform();
		Thread.sleep(5000);
		driver.findElement(By.id("00N30000006G28a")).click();
		Thread.sleep(5000);
		
		//Clicking on SAVE button
		
	    driver.findElement(By.name("inlineEditSave")).click();
	    Thread.sleep(5000);
	    String actualUrl=   driver.getCurrentUrl();
	    String expectedUrl= "https://intoglobal--iupsfuat.cs109.my.salesforce.com/01t3A000007GaTp";
	    Assert.assertEquals(expectedUrl, actualUrl);
		System.out.println(actualUrl);
		
		
		}
	
	
	@Test
//	@Ignore
	public void courseAvailableOnlineFalseToTrue() throws InterruptedException, AWTException {

		// Checking the course in contentful
		driver.get("https://app.contentful.com/spaces/xw2h6mjophtz/environments/test-course-content/entries/01t3A000007TDKWQA4");

		String error = driver.findElement(By.xpath("//div[@class='empty-state__title']")).getText();
		System.out.println(error);
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
		
		//Academic English -INTO Colorado State University

		driver.navigate().to("https://intoglobal--iupsfuat.cs109.my.salesforce.com/01t3A000007TDKWQA4");

		// For page down

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);

		// Clicking on available online option

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("00N30000006G28a_chkbox"))).doubleClick().build().perform();
		Thread.sleep(5000);
		driver.findElement(By.id("00N30000006G28a")).click();
		Thread.sleep(5000);

		// Clicking on SAVE button

		driver.findElement(By.name("inlineEditSave")).click();
		Thread.sleep(5000);
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://intoglobal--iupsfuat.cs109.my.salesforce.com/01t3A000007TDKW";
		Assert.assertEquals(expectedUrl, actualUrl);
		System.out.println(actualUrl);

	}

	@Test @Ignore
	
	//After API Update
	public void afterAPIUpadte() throws InterruptedException {
		

		WebElement outcome = driver.findElement(By.xpath("//div[@class='search__select-value']//select"));
		Select select = new Select(outcome);
		select.selectByIndex(26);
		Thread.sleep(2000);
		
		//Selecting scheduled course
		
		driver.findElement(By.cssSelector(".input-reset.search-next__query-input")).click();
		driver.findElement(By.cssSelector(".input-reset.search-next__query-input")).sendKeys("scheduledcourse");
		driver.findElement(By.cssSelector(".__filter-pill")).click();
		WebElement element = driver.findElement(By.xpath("//fieldset[@class='search-next__query-input-fieldset']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
		
		//Searching for course title
		
		driver.findElement(By.xpath("//input[@class='input-reset search-next__query-input']"))
				.sendKeys("International Year One in Business");
		driver.findElement(By.xpath("//input[@class='input-reset search-next__query-input']")).sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector(
				"a[href='/spaces/xw2h6mjophtz/environments/test-course-content/entries/aCI3A000000Caf5WAC']")).click();
		Assert.assertFalse(driver.getPageSource().contains("International Year One in Business - January Start - 3 Terms - NCL - 2018/19"));
		Thread.sleep(2000);
		
		
	}

	@After
	public void tearDown() {

		driver.quit();

	}
}