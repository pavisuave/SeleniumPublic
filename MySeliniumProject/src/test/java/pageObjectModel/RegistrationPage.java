package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
	WebDriver driver;
	By name=By.xpath("//input[@name='name']");
	By phone=By.xpath("//input[@name='phone']");
	public RegistrationPage(WebDriver driver) {
		this.driver=driver;
	}
	public void form() {
		//registration form
		//name
	     driver.findElement(name).sendKeys("pavithra");
		//phone
		driver.findElement(phone).sendKeys("1223344");
			
	}
}
