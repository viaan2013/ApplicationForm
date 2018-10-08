import java.awt.AWTException;
import java.util.concurrent.TimeUnit;
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

public class ProductProgressionInactive {
	
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
	
	public void productProgressionInactiveFromFalseToTrue() throws InterruptedException, AWTException {
		
		//Selecting outcome
		
		WebElement outcome = driver.findElement(By.xpath("//div[@class='search__select-value']//select"));
		Select select = new Select(outcome);
		select.selectByIndex(26);
		Thread.sleep(3000);
		
		//Selecting scheduled course
		
		driver.findElement(By.cssSelector(".input-reset.search-next__query-input")).click();
		driver.findElement(By.cssSelector(".input-reset.search-next__query-input")).sendKeys("scheduledcourse");
		driver.findElement(By.cssSelector(".__filter-pill")).click();
		WebElement element = driver.findElement(By.xpath("//fieldset[@class='search-next__query-input-fieldset']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
		
		//Searching for course title
		
		driver.findElement(By.xpath("//input[@class='input-reset search-next__query-input']"))
				.sendKeys("Jamie");
		driver.findElement(By.xpath("//input[@class='input-reset search-next__query-input']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.cssSelector(
				"a[href='/spaces/xw2h6mjophtz/environments/test-course-content/entries/aCI8E0000008Ph4WAE']")).click();
		
		System.out.println("scheduledcourse = " + driver.getCurrentUrl());
		
		//Selecting Scheduled Course
		
		driver.findElement(By.xpath(
				"//div[@class='ReferenceCard__title'][text()='International Foundation in Accounting and Finance - September Start - 3 Terms - MER - 2018/19']"))
				.click();
		Thread.sleep(2000);
		String actual = driver.findElement(By.xpath(
				"//div[@class='ReferenceCard__title'][text()='International Foundation in Accounting and Finance - September Start - 3 Terms - MER - 2018/19']"))
				.getText();
		Assert.assertEquals("International Foundation in Accounting and Finance - September Start - 3 Terms - MER - 2018/19", actual);
		
		//Url with outcomeID and salesforceID
		
		System.out.println("Url with outcomeID and salesforceID="+  driver.getCurrentUrl());
		
		//product progression course in Contentful
		
		driver.findElement(By.xpath(
				"//cf-entity-field[12]/div/div/div[2]/cf-widget-renderer/cf-reference-editor/div[2]/ol/li/cf-entity-link/div/div/article/a/div/div/div")).click();
		String progressioncourse = driver.findElement(By.xpath(
				"//cf-entity-field[12]/div/div/div[2]/cf-widget-renderer/cf-reference-editor/div[2]/ol/li/cf-entity-link/div/div/article/a/div/div/div"))
				.getText();
		Assert.assertEquals("Business and Management", progressioncourse);
	    System.out.println("progrssion course link ="+ driver.getCurrentUrl());
	    
	    
	    
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
		
		driver.navigate().to("https://intoglobal--iupsfuat.cs109.my.salesforce.com/aCD3A0000009J8xWAE");
		String Actualcourse = driver.findElement(By.id("lookup01t3A000006S8AN00N3A00000CITIi")).getText();
		String expectedcourse= "International Foundation in Accounting and Finance - September Start - 3 Terms - MER - 2018/19";
		Assert.assertEquals(expectedcourse, Actualcourse);
		System.out.println(Actualcourse);
		
	    //Clicking on product progression inactive
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("00N3A00000CITIf_chkbox"))).doubleClick().build().perform();
		Thread.sleep(3000);
		driver.findElement(By.id("00N3A00000CITIf")).click();
		Thread.sleep(2000);
	
		
		//Clicking on SAVE button
		
		driver.findElement(By.cssSelector("#bottomButtonRow > input[name=\"inlineEditSave\"]")).click();
	    Thread.sleep(5000);
	    String actualUrl=   driver.getCurrentUrl();
	    String expectedUrl= "https://intoglobal--iupsfuat.cs109.my.salesforce.com/aCD3A0000009J8x";
	    Assert.assertEquals(expectedUrl, actualUrl);
		System.out.println(actualUrl);
		
		
		}
	
	@Test
	 @Ignore
	public void  productProgressionInactiveFromTrueToFalse() throws InterruptedException {
		
		
		 
		//Navigating to Sales force 
		
        driver.get("https://intoglobal--iupsfuat.cs109.my.salesforce.com");
        
        //User credentials for Sales force
        
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("sruthi.kundoor@intoglobal.com.iupsfuat");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("Into1234");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(3000);
		
		
		// Searching for scheduled course in Sales force

		driver.navigate().to("https://intoglobal--iupsfuat.cs109.my.salesforce.com/aCD3A0000009J8xWAE");
		
		String Actualcourse = driver.findElement(By.id("lookup01t3A000006S8AN00N3A00000CITIi")).getText();
		String expectedcourse = "International Foundation in Accounting and Finance - September Start - 3 Terms - MER - 2018/19";
		Assert.assertEquals(expectedcourse, Actualcourse);
		System.out.println(Actualcourse);

		// Clicking on product progression inactive

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("00N3A00000CITIf_chkbox"))).doubleClick().build().perform();
		Thread.sleep(3000);
		driver.findElement(By.id("00N3A00000CITIf")).click();
		Thread.sleep(2000);

		// Clicking on SAVE button

		driver.findElement(By.cssSelector("#bottomButtonRow > input[name='inlineEditSave']")).click();
		Thread.sleep(5000);
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://intoglobal--iupsfuat.cs109.my.salesforce.com/aCD3A0000009J8x";
		Assert.assertEquals(expectedUrl, actualUrl);
		System.out.println(actualUrl);
		
		
	}
	
	
	 public void tearDown() {
		 
		driver.quit();
		
		   }
	


}