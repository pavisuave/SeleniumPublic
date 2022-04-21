package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class ComeUrl {
	WebDriver driver;
	public ComeUrl(WebDriver driver) {
		this.driver=driver;
	}
	public void browserSetUp() {
	driver.get("https://www.google.com/");
	//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
