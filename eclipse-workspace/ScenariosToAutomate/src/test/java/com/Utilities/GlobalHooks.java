package com.Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class GlobalHooks extends PageObjectRepo {

	public void startUp() {

		System.setProperty(driverpathkey, driverpathvalue);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS);
	}

	public void contentfulHomepage() throws InterruptedException {
		driver.get(contentfulURL);
		driver.findElement(By.id("user_email")).click();
		driver.findElement(By.id("user_email")).sendKeys(contentfulusername);
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys(contentfulpassword);
		driver.findElement(By.name("commit")).click();
		Thread.sleep(5000);
	}

	public void salesforceHomepage() throws InterruptedException {

		driver.get(salesforceURL);
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("Login")).click();
		Thread.sleep(3000);
	}

	public void tearDown() {

		driver.quit();
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

}
