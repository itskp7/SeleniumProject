package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		WebElement elect = driver.findElement(By.linkText("Electronics"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(elect).build().perform();
		
		Thread.sleep(2000);
		
		List<WebElement> fLinks = driver.findElements(By.xpath("//li[5]//div[2]//div[1]//div[1]//ul[1]//li"));
		System.out.println(fLinks.size());
		
		/*for (int i=0; i<fLinks.size(); i++) {
			System.out.println(fLinks.get(i).getText());
		}*/
		
		
		

	}

}
