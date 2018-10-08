package com.StepDefination;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
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

public class EntryRequirementsAddingStepDef {

	WebDriver driver;

	@Given("^I am in Salesforce Login page$")
	public void i_am_in_Salesforce_Login_page() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//Sruthi.Kundoor//Desktop//Automation//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://intoglobal--iupsfuat.cs109.my.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

	}

	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\" in login page$")
	public void i_enter_and_in_login_page(String username, String password) throws Throwable {

		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys(username);

		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@When("^I click on login button in salesforce login page$")
	public void i_click_on_login_button_in_salesforce_login_page() throws Throwable {

		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);

	}

	@When("^I select Entry requiremnts option in salesforce$")
	public void i_select_Entry_requiremnts_option_in_salesforce() throws Throwable {

		driver.findElement(By.className("allTabsArrow")).click();
		driver.findElement(By.xpath("//img[@title='Entry Requirements']")).click();

	}

	@When("^I click on New button$")
	public void i_click_on_New_button() throws Throwable {

		driver.findElement(By.name("new")).click();

	}

	@When("^I enter deails in \"([^\"]*)\"$")
	public void i_enter_deails_in(String EntryRequirementName) throws Throwable {

		driver.findElement(By.name("Name")).click();
		driver.findElement(By.name("Name")).sendKeys(EntryRequirementName);

	}

	@When("^I select \"([^\"]*)\"$")
	public void i_select(String QualificationType) throws Throwable {

		WebElement dropdown = driver.findElement(By.name("00N3A00000CIUWt"));
		Select options = new Select(dropdown);
		options.selectByVisibleText(QualificationType);

	}

	@When("^I enter details in \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and \"([^\"]*)\"$")
	public void i_enter_details_in_and(String QualificationCountry, String Qualification, String Requirement,
			String Writing, String Reading, String Speaking, String Listening, String Notes, String Internal_code)
			throws Throwable {

		// Qualification country dropdown
		WebElement country = driver.findElement(By.name("00N3A00000CIUWs"));
		Select countryselection = new Select(country);
		countryselection.selectByVisibleText(QualificationCountry);

		// Qualification
		driver.findElement(By.name("00N3A00000CIUWu")).click();
		driver.findElement(By.name("00N3A00000CIUWu")).sendKeys(Qualification);

		// Requirement
		driver.findElement(By.name("00N3A00000CIUWw")).click();
		driver.findElement(By.name("00N3A00000CIUWw")).sendKeys(Requirement);

		// Writing
		driver.findElement(By.name("00N3A00000CIUWy")).click();
		driver.findElement(By.name("00N3A00000CIUWy")).sendKeys(Writing);

		// Reading
		driver.findElement(By.name("00N3A00000CIUWv")).click();
		driver.findElement(By.name("00N3A00000CIUWv")).sendKeys(Reading);

		// Speaking
		driver.findElement(By.name("00N3A00000CIUWx")).click();
		driver.findElement(By.name("00N3A00000CIUWx")).sendKeys(Speaking);

		// Listening
		driver.findElement(By.name("00N3A00000CIUWq")).click();
		driver.findElement(By.name("00N3A00000CIUWq")).sendKeys(Listening);

		// Notes
		driver.findElement(By.name("00N3A00000CIUWr")).click();
		driver.findElement(By.name("00N3A00000CIUWr")).sendKeys(Notes);

		// Internal_code
		driver.findElement(By.name("00N3A00000CIUWp")).click();
		driver.findElement(By.name("00N3A00000CIUWp")).sendKeys(Internal_code);

	}

	@When("^I click on Save button at the bottom row$")
	public void i_click_on_Save_button_at_the_bottom_row() throws Throwable {
		driver.findElement(By.cssSelector("#bottomButtonRow > input[name='save']")).click();

	}

	@When("^I clik on New Product Entry$")
	public void i_clik_on_New_Product_Entry() throws Throwable {

		driver.findElement(By.name("new00N3A00000CIUWz")).click();

	}

	@When("^I select \"([^\"]*)\" in Product text box$")
	public void i_select_in_Product_text_box(String scheduledcourse) throws Throwable {

		driver.findElement(By.name("CF00N3A00000CIUX0")).click();
		driver.findElement(By.name("CF00N3A00000CIUX0")).sendKeys(scheduledcourse);

	}

	@Then("^I take screenshot for future use$")
	public void i_take_screenshot_for_future_use() throws IOException, InterruptedException {

		screenShot();
		driver.close();

	}

	public void screenShot() throws IOException, InterruptedException {
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Sruthi.Kundoor\\Desktop\\Screenshots/screenshot_" + "Entry requirements adding"
				+ timestamp() + ".png");
		FileUtils.copyFile(scr, dest);
		Thread.sleep(3000);
	}

	public static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

}


