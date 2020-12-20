package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe" );  // we have to type this because its a application and not jar, copypaste address in value in double quotes
		// ClassName objName = new ClassName();
		// FirefoxDriver driver = new FirefoxDriver();
		// InterfaceName(Parent class) objName = new ClassName();
		
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.id("email")).sendKeys("safgrdfxvdf");
			driver.findElement(By.id("pass")).sendKeys("dafrgsgsa");
			driver.findElement(By.id("loginbutton")).click();
			

	}

}
