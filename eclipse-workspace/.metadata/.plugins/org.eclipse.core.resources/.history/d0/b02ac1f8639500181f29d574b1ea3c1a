import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class EntryRequirementsChange_Adding {

	WebDriver driver;

	@Before
	public void startup() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//Sruthi.Kundoor//Desktop//Automation//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://intoglobal--iupsfuat.cs109.my.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("sruthi.kundoor@intoglobal.com.iupsfuat");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("Into5835");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
	}

	@Test
	public void EnglishLanguageEntry_Course_Adding() throws InterruptedException, AWTException, IOException {


	  // Clicking on entry requirements in Salesforce
		
		driver.findElement(By.className("allTabsArrow")).click();
		driver.findElement(By.xpath("//img[@title='Entry Requirements']")).click();
		
		//Clicking on New button in entry requirement
		driver.findElement(By.name("new")).click();
		
		//Entry reqiurement name
		driver.findElement(By.name("Name")).click();
		driver.findElement(By.name("Name")).sendKeys("English :TOFEL");
		
		//Qualification name dropdown
		WebElement dropdown=driver.findElement(By.name("00N3A00000CIUWt"));
		Select options=new Select(dropdown);
		options.selectByVisibleText("English");
		
		//Qualification country dropdown
		WebElement country=driver.findElement(By.name("00N3A00000CIUWs"));
		Select countryselection=new Select(country);
		countryselection.selectByVisibleText("China");
		
		//Qualification
		driver.findElement(By.name("00N3A00000CIUWu")).click();
		driver.findElement(By.name("00N3A00000CIUWu")).sendKeys("TOFEL");
		
		//Requirement
		driver.findElement(By.name("00N3A00000CIUWw")).click();
		driver.findElement(By.name("00N3A00000CIUWw")).sendKeys("6");
		
		//Writing
		driver.findElement(By.name("00N3A00000CIUWy")).click();
		driver.findElement(By.name("00N3A00000CIUWy")).sendKeys("5");
		
		//Reading
		driver.findElement(By.name("00N3A00000CIUWv")).click();
		driver.findElement(By.name("00N3A00000CIUWv")).sendKeys("5.5");
		
		//Speaking
		driver.findElement(By.name("00N3A00000CIUWx")).click();
		driver.findElement(By.name("00N3A00000CIUWx")).sendKeys("4");
		
		//Listening
		driver.findElement(By.name("00N3A00000CIUWq")).click();
		driver.findElement(By.name("00N3A00000CIUWq")).sendKeys("5");
		
		//Notes
		driver.findElement(By.name("00N3A00000CIUWr")).click();
		driver.findElement(By.name("00N3A00000CIUWr")).sendKeys("information in notes");
		
		//Internal_code
		driver.findElement(By.name("00N3A00000CIUWp")).click();
		driver.findElement(By.name("00N3A00000CIUWp")).sendKeys("IN12345");
		
		//Save button
		driver.findElement(By.cssSelector("#bottomButtonRow > input[name='save']")).click();
		
		//New product entry
		driver.findElement(By.name("new00N3A00000CIUWz")).click();
		
		//Product name
		driver.findElement(By.name("CF00N3A00000CIUX0")).click();
		driver.findElement(By.name("CF00N3A00000CIUX0")).sendKeys("International Foundation in Accounting and Finance - September Start - 3 Terms - MER - 2018/19");
		
		//clicking on save button
		driver.findElement(By.cssSelector("#bottomButtonRow > input[name='save']")).click();
		screenShot();
		
	}
		
		//Taking screenshot
		
		public void screenShot() throws IOException, InterruptedException {
			File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\Sruthi.Kundoor\\Desktop\\Screenshots/screenshot_" + timestamp() + ".png");
			FileUtils.copyFile(scr, dest);
			Thread.sleep(3000);
		
		
		
    }
	
	
	
    private String timestamp() {
    	
    return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
		
	}

	

	@After
	public void tearDown() {

		// driver.close();
	}

}
