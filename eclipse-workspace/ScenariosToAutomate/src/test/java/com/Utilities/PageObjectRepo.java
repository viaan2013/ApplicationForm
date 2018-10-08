package com.Utilities;

import org.openqa.selenium.WebDriver;

import com.pages.CourseAvailableOnlinePage;
import com.pages.EntryRequirementsAddingPage;
import com.pages.EntryRequirementsRemovingpage;
import com.pages.NewOutcomeCreationPage;
import com.pages.ProductProgressionPage;

public class PageObjectRepo {
	
	public static WebDriver driver;
	public static String username="sruthi.kundoor@intoglobal.com.iupsfuat";
	public static String password="Into1234";
	public static String contentfulusername="charles.parvez@intoglobal.com";
	public static String contentfulpassword="Into3683";
	public static String contentfulURL="https://app.contentful.com/spaces/xw2h6mjophtz/environments/test-course-content/";
	public static String salesforceURL="https://intoglobal--iupsfuat.cs109.my.salesforce.com";
	public static String driverpathkey="webdriver.chrome.driver";
	public static String driverpathvalue ="C://Users//Sruthi.Kundoor//Desktop//Automation//chromedriver_win32//chromedriver.exe";
	
	
	
	public static CourseAvailableOnlinePage courseAvailableOnline =new CourseAvailableOnlinePage();
	public static EntryRequirementsAddingPage entryRequirementsAdding=new EntryRequirementsAddingPage();
	public static EntryRequirementsRemovingpage entryRequirementsRemoving=new EntryRequirementsRemovingpage();
	public static NewOutcomeCreationPage newOutcomeCreationPage=new NewOutcomeCreationPage();
	public static ProductProgressionPage productProgressionPage=new  ProductProgressionPage();
	public static  GlobalHooks globalHooks=new GlobalHooks();
	
	
	}


