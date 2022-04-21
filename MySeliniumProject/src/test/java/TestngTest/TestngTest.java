package TestngTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngTest {
	WebDriver driver;
	@BeforeTest
	public void setUpTest() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		}
	@Test
	public void googleSearch() {
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("apple");
	}
	@AfterTest
	public void closeBrowser() {
		//driver.close();
		System.out.println("test is completed successfully");
	}
}
