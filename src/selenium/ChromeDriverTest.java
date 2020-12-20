package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("fsgsvsvfrvgr"); //working
		driver.findElement(By.name("pass")).sendKeys("fsfseeegreg");
		driver.findElement(By.id("loginbutton")).click();
	
	}

}
