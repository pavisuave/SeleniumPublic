package XpathTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathTest {
public static void main(String args[]) {
	
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	//WebDriverManager.chromedriver().setup();
	//WebDriver driver=new ChromeDriver();
	//driver.get("https://demo.guru99.com/test/web-table-element.php");
	driver.get("https://demo.guru99.com/Agile_Project/Agi_V1/index.php");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	WebElement e=driver.findElement(By.xpath("//div[@id='leftcontainer']//table//tbody//tr[1]//td[3]"));
//	System.out.println(e.getText());
//	List<WebElement> row=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
//	//System.out.println("no of rows"+driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr")).getSize());
//	System.out.println("no of rows"+row.size());
//	WebElement e1=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
//	System.out.println("content"+e1.getText());
//	//driver.findElement("")
	
}
}
