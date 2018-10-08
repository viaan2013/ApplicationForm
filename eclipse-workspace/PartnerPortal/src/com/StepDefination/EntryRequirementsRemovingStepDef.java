package com.StepDefination;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
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

public class EntryRequirementsRemovingStepDef {
	WebDriver driver;

	@Given("^I am in test-course-content homepage in contentful$")
	public void i_am_in_test_course_content_homepage_in_contentful() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//Sruthi.Kundoor//Desktop//Automation//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://app.contentful.com/spaces/xw2h6mjophtz/environments/test-course-content/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

	}

	@Given("^I enter \"([^\"]*)\" and \"([^\"]*)\" in contentful login page$")
	public void i_enter_and_in_contentful_login_page(String email, String password) throws Throwable {

		driver.findElement(By.id("user_email")).click();
		driver.findElement(By.id("user_email")).sendKeys(email);
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys(password);
		driver.findElement(By.name("commit")).click();
		Thread.sleep(5000);

	}

	@Given("^I click and select outcome option in dropdown$")
	public void i_click_and_select_outcome_option_in_dropdown() throws Throwable {

		WebElement outcome = driver.findElement(By.xpath("//div[@class='search__select-value']//select"));
		Select select = new Select(outcome);
		select.selectByIndex(26);
		Thread.sleep(4000);

	}

	@Given("^I click on search text box$")
	public void i_click_on_search_text_box() throws Throwable {

		driver.findElement(By.cssSelector(".input-reset.search-next__query-input")).click();

	}

	@Given("^I select scheduled course option in outcome$")
	public void i_select_scheduled_course_option_in_outcome() throws Throwable {

		driver.findElement(By.cssSelector(".input-reset.search-next__query-input")).sendKeys("scheduledcourse");
		driver.findElement(By.cssSelector(".__filter-pill")).click();
		WebElement element = driver.findElement(By.xpath("//fieldset[@class='search-next__query-input-fieldset']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();

	}

	@When("^I enter \"([^\"]*)\" in searchbox$")
	public void i_enter_in_searchbox(String coursetitle) throws Throwable {

		driver.findElement(By.xpath("//input[@class='input-reset search-next__query-input']")).sendKeys(coursetitle);
		driver.findElement(By.xpath("//input[@class='input-reset search-next__query-input']")).sendKeys(Keys.ENTER);

	}

	@When("^I select \"([^\"]*)\" from search results and click on it$")
	public void i_select_from_search_results_and_click_on_it(String course) throws Throwable {

		driver.findElement(By
				.cssSelector("a[href='/spaces/xw2h6mjophtz/environments/test-course-content/entries/" + course + "']"))
				.click();

		System.out.println("scheduledcourse = " + driver.getCurrentUrl());

	}

	@When("^I select one of the \"([^\"]*)\" from the list and click$")
	public void i_select_one_of_the_from_the_list_and_click(String scheduledcourses) throws Throwable {

		driver.findElement(By.xpath("" + scheduledcourses + "")).click();
		Thread.sleep(2000);
		String actual = driver.findElement(By.xpath("" + scheduledcourses + "")).getText();
		Assert.assertEquals("International Year One in Business - January Start - 3 Terms - NCL - 2018/19", actual);

	}

	@When("^I select one of the \"([^\"]*)\"from the selected scheduled course$")
	public void i_select_one_of_the_from_the_selected_scheduled_course(String EntryRequirements) throws Throwable {

		driver.findElement(By.xpath("" + EntryRequirements + "")).click();
		Thread.sleep(3000);
		String courseUrl = driver.getCurrentUrl();
		System.out.println("Entry requirements =" + courseUrl);

	}

	@When("^I  do the page scroll for salesforce ID of that course$")
	public void i_do_the_page_scroll_for_salesforce_ID_of_that_course() throws Throwable {

		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);

	}

	@When("^I navigate to salesforce url$")
	public void i_navigate_to_salesforce_url() throws Throwable {

		driver.navigate().to("https://intoglobal--iupsfuat.cs109.my.salesforce.com");
		Thread.sleep(2000);

	}

	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\" in salesforce login page and click on login button$")
	public void i_enter_and_in_salesforce_login_page_and_click_on_login_button(String Username, String Password)
			throws Throwable {

		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys(Username);
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.id("Login")).click();
		Thread.sleep(3000);

	}

	@When("^I search for scheduledcourse in salesforce with \"([^\"]*)\"$")
	public void i_search_for_scheduledcourse_in_salesforce_with(String URLWithsalesforceID) throws Throwable {

		driver.navigate().to("" + URLWithsalesforceID + "");

		Assert.assertEquals(URLWithsalesforceID, driver.getCurrentUrl());

	}

	@When("^I take a screenshot for of that for future use$")
	public void i_take_a_screenshot_for_of_that_for_future_use() throws Throwable {

		screenshot();
	}

	@When("^I click on delete button$")
	public void i_click_on_delete_button() throws Throwable {

		driver.findElement(By.name("del")).click();

	}

	@Then("^I should see alert box with message$")
	public String i_should_see_alert_box_with_message() throws Throwable {

		String alertText = driver.switchTo().alert().getText();
		System.out.println("Alert text is " + alertText);
		return alertText;

	}

	@Then("^I select ok in the alert box$")
	public void i_select_ok_in_the_alert_box() throws Throwable {

		driver.switchTo().alert().accept();

	}

	public void screenshot() throws IOException, InterruptedException {

		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Sruthi.Kundoor\\Desktop\\Screenshots/screenshot_" + "EntryRequirementsRemoving"
				+ timestamp() + ".png");
		FileUtils.copyFile(scr, dest);
		Thread.sleep(3000);

	}

	private String timestamp() {

		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

}
