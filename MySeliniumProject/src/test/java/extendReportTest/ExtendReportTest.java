package extendReportTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjectModel.ComeUrl;
import pageObjectModel.GoogleSearchPage;
import pageObjectModel.HomePage;
import pageObjectModel.RegistrationPage;

public class ExtendReportTest {
	WebDriver driver;
	GoogleSearchPage pom;
	ComeUrl setup;
	HomePage mouseovers;
	RegistrationPage formtofill;
	ExtentTest test1;
	ExtentReports extent;

	public ExtendReportTest() {
		System.out.println("Before Test Suite");
		ExtentHtmlReporter htmlReport = new ExtentHtmlReporter("extendReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReport);
		test1 = extent.createTest("googleSearch", "Search the way to automation");
	}
	
//	@BeforeSuite // It runs only once for suite tag
//	public void extentReport() {
//		System.out.println("Before Test Suite");
//		ExtentHtmlReporter htmlReport = new ExtentHtmlReporter("extendReport.html");
//		extent = new ExtentReports();
//		extent.attachReporter(htmlReport);
//		test1 = extent.createTest("googleSearch", "Search the way to automation");
//
//	}

	/*
	 * @BeforeTest public void setUpTest() {
	 * 
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver(); }
	 */

	@Parameters("browserName")

	@BeforeTest // It runs for each test tag
	 //@Parameters("browserName")
	public void setUp(String browserName) {
		//test1.pass("Test setup is started");
		try {
		System.out.println("Browser name is:" + browserName);
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			System.out.println("Browser intialize");
		}
		//test1.pass("Test setup is completed");
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	@Test(priority = 1)
	public void googleSearch() {
		//System.out.println("Starting the googleSearch");
		//test1.log(Status.INFO, "Starting the testCase");
		setup = new ComeUrl(driver);
		setup.browserSetUp();
		test1.pass("nativgated to way2automation page ");
		pom = new GoogleSearchPage(driver);
		pom.Searchpage();
		test1.pass("Enter the text in searchbox");
		test1.pass("click the button");
		pom.searchResults();
	}

	@Test(priority = 2)
	public void homePage() {
		System.out.println("Starting homePage");
		mouseovers = new HomePage(driver);
		// MouseOverAction
		mouseovers.homePageAction();
		test1.pass("point the mouse in registration menu");
		test1.pass("click the practice1 from the dropdown");
	}

	@Test(priority = 3)
	public void registrationForm() {
		System.out.println("Starting registrationForm");
		// registration form
		formtofill = new RegistrationPage(driver);

		formtofill.form();
		test1.pass("form filled successfully");

	}

	@AfterTest
	public void closeBrowser() {
		//driver.close();
		System.out.println("test is completed successfully");
		test1.info("test completed");
		

	}
	@AfterSuite
	public void closeExtent() {
		extent.flush();
	}

}
