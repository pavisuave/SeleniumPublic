package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	WebDriver driver;
	By searchBox=By.name("q");
	By searchButton=By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]//following-sibling::input[@type='submit']");
	//By searchButton=By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]");
	By webPageLink=By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a//h3[contains(text(),'Get')]");
	public GoogleSearchPage(WebDriver driver) {
		this.driver=driver;
	}
		
	public void Searchpage() {
		driver.findElement(searchBox).sendKeys("Way2Automation");
		driver.findElement(searchButton).click();
	}
    public void searchResults() {
    	driver.findElement(webPageLink).click();
    }
		
	
}
