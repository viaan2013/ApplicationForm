
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class NewOutcomeCreation {
	public WebDriver driver;

	@Before
	public void startUp() {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//Sruthi.Kundoor//Desktop//Automation//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://intoglobal--iupsfuat.cs109.my.salesforce.com");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);

	}

	@Test
	public void newOutcomeCreation() throws Exception {
		// login credentials

		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("sruthi.kundoor@intoglobal.com.iupsfuat");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("Into5835");
		driver.findElement(By.id("Login")).click();

		// outcome tab

		driver.findElement(By.className("allTabsArrow")).click();
		driver.findElement(By.xpath("//img[@title='Outcomes']")).click();

		// new outcome creation

		driver.findElement(By.name("new")).click();
		driver.findElement(By.id("CF00N3A00000CITIV")).clear();
		driver.findElement(By.id("CF00N3A00000CITIV")).click();
		driver.findElement(By.id("CF00N3A00000CITIV")).sendKeys("INTO City, University of London");
		driver.findElement(By.id("00N3A00000CIUWf")).sendKeys("OutcomeReTest");
		driver.findElement(By.name("save")).click();

		// Master courses

		driver.findElement(By.id("Outcome:j_id1:MCOutcomeMaint:j_id3:j_id4:findAdd_lbl")).click();
		driver.findElement(By.name("Outcome:j_id1:MCOutcomeMaint:j_id3:j_id4:j_id59")).click();
		driver.findElement(By.name("Outcome:j_id1:MCOutcomeMaint:j_id3:j_id4:j_id59")).sendKeys("Academic English");
		Thread.sleep(2000);
		driver.findElement(By.id("Outcome:j_id1:MCOutcomeMaint:j_id3:j_id4:j_id56")).click();
		driver.findElement(By.name("Outcome:j_id1:MCOutcomeMaint:j_id3:j_id4:mcs:12:j_id73")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Outcome:j_id1:MCOutcomeMaint:j_id3:j_id4:j_id69")).click();
		Thread.sleep(2000);

	 // New Brand outcome
			
		driver.findElement(By.name("new00N3A00000CITII")).click();
		driver.findElement(By.id("CF00N3A00000CITIH")).click();
		driver.findElement(By.id("CF00N3A00000CITIH")).sendKeys("INTO City University, London (Parent)");
		driver.findElement(By.cssSelector("#bottomButtonRow > input[name='save']")).click();
		
				
	    }
	
	
     public void tearDown() {
		driver.close();

	   }

}
