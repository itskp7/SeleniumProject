package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSuggestionTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/");
		
		driver.findElement(By.id("uh-search-box")).sendKeys("canada");
		Thread.sleep(1000);
		
		List<WebElement> allSearch = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(allSearch.size());
		
		for(WebElement a : allSearch) {
			System.out.println(a.getText());
		}

	}

}
