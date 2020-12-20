package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorTest {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe" );
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("fsgsvsvfrvgr"); //working
		driver.findElement(By.cssSelector("#pass")).sendKeys("fsfseeegreg");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();

	}

}
