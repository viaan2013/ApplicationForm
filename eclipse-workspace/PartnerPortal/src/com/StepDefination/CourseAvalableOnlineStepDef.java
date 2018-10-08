package com.StepDefination;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CourseAvalableOnlineStepDef {
	WebDriver driver;

	@Given("^I am in Contentful home page$")
	public void i_am_in_Contentful_home_page() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//Sruthi.Kundoor//Desktop//Automation//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://app.contentful.com/spaces/xw2h6mjophtz/environments/test-course-content/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

	}

	@Given("^I enter \"([^\"]*)\" and \"([^\"]*)\" in contentful$")
	public void i_enter_and_in_contentful(String Email, String Password) throws Throwable {

		driver.findElement(By.id("user_email")).click();
		driver.findElement(By.id("user_email")).sendKeys(Email);
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys(Password);

	}

	@When("^I click on Login button$")
	public void i_click_on_Login_button() throws Throwable {

		driver.findElement(By.name("commit")).click();
		Thread.sleep(5000);

	}

	@When("^I select Outcome in the dropdown$")
	public void i_select_Outcome_in_the_dropdown() throws Throwable {

		WebElement outcome = driver.findElement(By.xpath("//div[@class='search__select-value']//select"));
		Select select = new Select(outcome);
		select.selectByVisibleText("Outcome");
		Thread.sleep(2000);

	}

	@When("^I select scheduledcourse in the outcome$")
	public void i_select_scheduledcourse_in_the_outcome() throws Throwable {

		driver.findElement(By.cssSelector(".input-reset.search-next__query-input")).click();
		driver.findElement(By.cssSelector(".input-reset.search-next__query-input")).sendKeys("scheduledcourse");
		driver.findElement(By.cssSelector(".__filter-pill")).click();
		WebElement element = driver.findElement(By.xpath("//fieldset[@class='search-next__query-input-fieldset']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();

	}

	@When("^I enter \"([^\"]*)\" in search area$")
	public void i_enter_in_search_area(String Coursetitle) throws Throwable {

		driver.findElement(By.xpath("//input[@class='input-reset search-next__query-input']")).sendKeys(Coursetitle);

	}

	@When("^I click on search button$")
	public void i_click_on_search_button() throws Throwable {

		driver.findElement(By.xpath("//input[@class='input-reset search-next__query-input']")).sendKeys(Keys.ENTER);

	}
	@When("^I select \"([^\"]*)\"in search results$")
	public void i_select_in_search_results(String ScheduledCourse) throws Throwable {
		
		driver.findElement(By.cssSelector(
				"a[href='/spaces/xw2h6mjophtz/environments/test-course-content/entries/"+ScheduledCourse+"']")).click();
	   
	}

	@When("^I click on that selected \"([^\"]*)\"from search results$")
	public void i_click_on_that_selected_from_search_results(String course) throws Throwable {
		
		driver.findElement(By.xpath(""+course +"")).click();
		Thread.sleep(5000);
	}
	

	@When("^I am navigating to salesforce$")
	public void i_am_navigating_to_salesforce() throws Throwable {

		driver.navigate().to("https://intoglobal--iupsfuat.cs109.my.salesforce.com");
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("sruthi.kundoor@intoglobal.com.iupsfuat");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("Into1234");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(3000);

	}

	@Given("^I am navigating to salesforce homepage$")
	public void i_am_navigating_to_salesforce_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//Sruthi.Kundoor//Desktop//Automation//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://intoglobal--iupsfuat.cs109.my.salesforce.com");
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("sruthi.kundoor@intoglobal.com.iupsfuat");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("Into1234");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(3000);

	}

	@When("^I am searching for scheduled course with \"([^\"]*)\"$")
	public void i_am_searching_for_scheduled_course_with(String salesforceID) throws Throwable {

		driver.navigate().to("https://intoglobal--iupsfuat.cs109.my.salesforce.com/" + salesforceID + "");
		String Actualcourse = driver.findElement(By.id("Name_ileinner")).getText();
		System.out.println(Actualcourse);

	}

	@When("^I scroll the page to see Available online option$")
	public void i_scroll_the_page_to_see_Available_online_option() throws Throwable {

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);

	}

	@When("^I am double click on Available online option$")
	public void i_am_double_click_on_Available_online_option() throws Throwable {

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("00N30000006G28a_chkbox"))).doubleClick().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("00N30000006G28a")).click();
		Thread.sleep(2000);

	}

	@When("^I click on save button$")
	public void i_click_on_save_button() throws Throwable {
		driver.findElement(By.name("inlineEditSave")).click();
		Thread.sleep(2000);

	}

	@Then("^I should see Available online option unticked$")
	public void i_should_see_Available_online_option_unticked() throws Throwable {

		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);

		try {

			boolean checkbox = driver.findElement(By.xpath("//img[@id='00N30000006G28a_chkbox'][@tilte='Not Checked']"))
					.isDisplayed();
			checkbox = true;
			System.out.println(checkbox + " Checkbox is unticked");
           
            
		} catch (Exception e) {
			screenShot();
			System.out.println("Print an error" + e);
		}

	}

	@Given("^I enter \"([^\"]*)\" and \"([^\"]*)\" in salesforce$")
	public void i_enter_and_in_salesforce(String Username, String Password) throws Throwable {

		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys(Username);
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys(Password);

	}

	@When("^I am searching for scheduled course with \"([^\"]*)\" which are having unticked available online option$")
	public void i_am_searching_for_scheduled_course_with_which_are_having_unticked_available_online_option(
			String salesforceID) throws Throwable {

		driver.navigate().to("https://intoglobal--iupsfuat.cs109.my.salesforce.com/" + salesforceID + "");

	}

	@Then("^I should see Available online option ticked$")
	public void i_should_see_Available_online_option_ticked() throws Throwable {

		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		try {

			boolean checkbox2 = driver.findElement(By.xpath("//img[@id='00N30000006G28a_chkbox'][@tilte='Checked']"))
					.isDisplayed();
			checkbox2 = true;
			System.out.println(checkbox2 + " Checkbox is ticked");

		} catch (Exception e) {
			screenShot();
			System.out.println("Print an error" + e);
		}

	}

	private void screenShot() throws IOException, InterruptedException {
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Sruthi.Kundoor\\Desktop\\Screenshots/screenshot_" + timestamp() + ".png");
		FileUtils.copyFile(scr, dest);
		Thread.sleep(3000);
	}

	public static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

	@Then("^I should see no results for that particular course$")
	public void i_should_see_no_results_for_that_particular_course() throws Throwable {

	}

}
