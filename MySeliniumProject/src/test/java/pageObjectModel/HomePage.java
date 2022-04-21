package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
	By menuBar=By.xpath("//*[@id=\"menu-item-27617\"]/a/span[2]");
    By menulist=By.xpath("//*[@id=\"menu-item-27618\"]/a/span[2]");
	WebDriver driver;

public HomePage(WebDriver driver ) {
	this.driver=driver;
}
public void homePageAction() {
	WebElement menu=driver.findElement(menuBar);
	Actions action=new Actions(driver);
	action.moveToElement(menu).perform();
	//click the link
	driver.findElement(menulist).click();
	
}
}
