package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe" );  // we have to type this because its a application and not jar, copypaste address in value in double quotes
		// ClassName objName = new ClassName();
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			
			WebElement email = driver.findElement(By.id("email")); 
			email.sendKeys("safgrdfxvdf");
			
			WebElement password = driver.findElement(By.id("pass"));
			password.sendKeys("dafrgsgsa");
			
			WebElement login = driver.findElement(By.id("loginbutton"));
			login.click();

	}

}
