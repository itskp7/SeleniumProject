package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");
		
		//if popup comes then close it and type iphone
		//if no popup then type iphone directly
		// both case should work
		
		Thread.sleep(3000);
		List<WebElement> popUp = driver.findElements(By.linkText("x"));
		
		if(popUp.size()>0){
			popUp.get(0).click();
		}
		
		/*
		 * driver.findElement(By.xpath("//a[@class='close-layer']")).click();
		 * 
		 * Thread.sleep(2000);
		 */
		
		driver.findElement(By.id("search-key")).sendKeys("iphone");
		
		
	}

}
