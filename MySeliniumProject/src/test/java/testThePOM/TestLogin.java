package testThePOM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjectModel.GoogleSearchPage ;
public class TestLogin {
	WebDriver driver;
	 GoogleSearchPage pom;
	@BeforeTest
	public void setUpTest() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
	@Test
	public void googleSearch() {
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//searchBox
		//driver.findElement(By.name("q")).sendKeys("Way2Automation");
		//googleSearchButton
		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]")).click();
		//selecting the first url
		//driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div[1]/a")).click();
		pom=new GoogleSearchPage(driver);
		pom.Searchpage();
		pom.searchResults();
		//MouseOverAction
		WebElement menu=driver.findElement(By.xpath("//*[@id=\"menu-item-27617\"]/a/span[2]"));
		Actions action=new Actions(driver);
		action.moveToElement(menu).perform();
		//click the link
		driver.findElement(By.xpath("//*[@id=\"menu-item-27618\"]/a/span[2]")).click();
		//registration form
		//name
	    driver.findElement(By.xpath("//input[@name='name']")).sendKeys("pavithra");
		//phone
	    driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("1223344");
	}
	@AfterTest
	public void closeBrowser() {
		//driver.close();
		System.out.println("test is completed successfully");
	}
}
