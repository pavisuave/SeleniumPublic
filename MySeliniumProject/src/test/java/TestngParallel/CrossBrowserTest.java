package TestngParallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTest {

	WebDriver driver;
	@Parameters("browserName")
	@BeforeTest
	//@Parameters("browserName")
	public void setUp(String browserName) {
		System.out.println("Browser name is:"+browserName);
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		} else {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
	}
	@Test
	public void parallelBrowserTest() throws Exception{
		driver.get("https://google.com");
		//Thread.sleep(4000);
		driver.findElement(By.name("q")).sendKeys("apple");
	}
	@AfterTest
	public void closeBrowser() {
		//driver.quit();
		//driver.close();
		
		System.out.println("test is completed successfully");
	}
		
	
}
