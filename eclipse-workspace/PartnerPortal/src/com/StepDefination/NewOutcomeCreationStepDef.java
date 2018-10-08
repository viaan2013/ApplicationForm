package com.StepDefination;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewOutcomeCreationStepDef {

	WebDriver driver;

	@Given("^I am in sales force homepage$")
	public void i_am_in_sales_force_homepage() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sruthi.Kundoor\\eclipse-workspace\\PartnerPortal\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://intoglobal--iupsfuat.cs109.my.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);

	}

	@Given("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_and(String username, String password) throws Throwable {

		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {

		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);

	}

	@When("^I should see salesforce homepage$")
	public void i_should_see_salesforce_homepage() throws Throwable {

		Assert.assertTrue(
				driver.getCurrentUrl().contains("https://intoglobal--iupsfuat.cs109.my.salesforce.com/home/home.jsp"));

	}

	@When("^I select outcomes field from the tabs$")
	public void i_select_outcomes_field_from_the_tabs() throws Throwable {

		driver.findElement(By.className("allTabsArrow")).click();
		driver.findElement(By.xpath("//img[@title='Outcomes']")).click();

	}

	@When("^I click on new button$")
	public void i_click_on_new_button() throws Throwable {

		driver.findElement(By.name("new")).click();
	}

	@When("^I select \"([^\"]*)\" in the information$")
	public void i_select_in_the_information(String centre) throws Throwable {

		driver.findElement(By.id("CF00N3A00000CITIV")).clear();
		driver.findElement(By.id("CF00N3A00000CITIV")).click();
		driver.findElement(By.id("CF00N3A00000CITIV")).sendKeys(centre);

	}

	@When("^I enter \"([^\"]*)\"$")
	public String i_enter(String Outcome) throws Throwable {
		driver.findElement(By.id("00N3A00000CIUWf")).sendKeys(Outcome);
		System.out.println("Outcome= " + Outcome);
		return Outcome;

	}

	@When("^I click on Save button$")
	public String i_click_on_Save_button() throws Throwable {

		driver.findElement(By.name("save")).click();
		String outcomeID = driver.findElement(By.cssSelector(".dataCol.col02")).getText();
		System.out.println("outcomeID = " + outcomeID);
		return outcomeID;

	}

	@When("^I click on Add button in master courses$")
	public void i_click_on_Add_button_in_master_courses() throws Throwable {

		driver.findElement(By.id("Outcome:j_id1:MCOutcomeMaint:j_id3:j_id4:findAdd_lbl")).click();
	}

	@When("^I enter the \"([^\"]*)\" name$")
	public void i_enter_the_name(String subject) throws Throwable {

		driver.findElement(By.name("Outcome:j_id1:MCOutcomeMaint:j_id3:j_id4:j_id59")).click();
		driver.findElement(By.name("Outcome:j_id1:MCOutcomeMaint:j_id3:j_id4:j_id59")).sendKeys(subject);
		Thread.sleep(2000);

	}

	@When("^I click on Find button in master course$")
	public void i_click_on_Find_button_in_master_course() throws Throwable {

		driver.findElement(By.id("Outcome:j_id1:MCOutcomeMaint:j_id3:j_id4:j_id56")).click();
	}

	@When("^I select course of that particular university$")
	public void i_select_course_of_that_particular_university() throws Throwable {

		driver.findElement(By.name("Outcome:j_id1:MCOutcomeMaint:j_id3:j_id4:mcs:12:j_id73")).click();
		Thread.sleep(2000);

	}

	@When("^I click on add selected button$")
	public void i_click_on_add_selected_button() throws Throwable {

		driver.findElement(By.id("Outcome:j_id1:MCOutcomeMaint:j_id3:j_id4:j_id69")).click();
		Thread.sleep(2000);

	}

	@When("^I click on New Brand Outcome button$")
	public void i_click_on_New_Brand_Outcome_button() throws Throwable {

		driver.findElement(By.name("new00N3A00000CITII")).click();
		Assert.assertEquals("New Brand Outcome", driver.findElement(By.className("pageDescription")).getText());
	}

	@When("^I select \"([^\"]*)\" from parent record$")
	public void i_select_from_parent_record(String Brand) throws Throwable {

		driver.findElement(By.id("CF00N3A00000CITIH")).click();
		driver.findElement(By.id("CF00N3A00000CITIH")).sendKeys(Brand);

	}

	@When("^I click on Save brand outcome button$")
	public String i_click_on_Save_brand_outcome_button() throws Throwable {

		driver.findElement(By.cssSelector("#bottomButtonRow > input[name='save']")).click();
		String Outcomename = driver.findElement(By.className("pageDescription")).getText();
		System.out.println("Outcomename =" + Outcomename);
		return Outcomename;
	}

	@Then("^I should take a screenshot of Newoutcome$")
	public void i_should_take_a_screenshot_of_newoutcome() throws IOException, InterruptedException {

		screenShot();
		driver.close();

	}

	public void screenShot() throws IOException, InterruptedException {
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Sruthi.Kundoor\\Desktop\\Screenshots/screenshot_" + timestamp() + ".png");
		FileUtils.copyFile(scr, dest);
		Thread.sleep(3000);
	}

	public static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

	@Given("^I am in Contentful homepage$")
	public void i_am_in_Contentful_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sruthi.Kundoor\\eclipse-workspace\\PartnerPortal\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://app.contentful.com/spaces/xw2h6mjophtz/environments/test-course-content/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

	}

	@When("^I Enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_Enter_and(String email, String password) throws Throwable {

		driver.findElement(By.id("user_email")).click();
		driver.findElement(By.id("user_email")).sendKeys(email);
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys(password);

	}

	@When("^I click on Log in button$")
	public void i_click_on_Log_in_button() throws Throwable {

		driver.findElement(By.name("commit")).click();
		Thread.sleep(5000);

	}

	@When("^I have selected Outcome option in dropdown$")
	public void i_have_selected_Outcome_option_in_dropdown() throws Throwable {

		WebElement outcome = driver.findElement(By.xpath("//div[@class='search__select-value']//select"));
		Select select = new Select(outcome);
		select.selectByIndex(26);
		Thread.sleep(4000);

	}

	@When("^I enter \"([^\"]*)\" in search field in contentful$")
	public void i_enter_in_search_field_in_contentful(String outcome) throws Throwable {

		driver.findElement(By.cssSelector(".input-reset.search-next__query-input")).click();
		driver.findElement(By.cssSelector(".input-reset.search-next__query-input")).sendKeys(outcome);
		driver.findElement(By.cssSelector("div[class='advice advice--row-aligned']")).click();
	}

	@Then("^I should see related outcome search results$")
	public void i_should_see_related_outcome_search_results() throws Throwable {

		String error = driver.findElement(By.cssSelector(".header.advice__title.advice__title--normal")).getText();
		Assert.assertEquals("Sadly, we didn't find anything matching your search", error);

	}
}
	
