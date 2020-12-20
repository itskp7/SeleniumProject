package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSuggestionList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("canada");
		Thread.sleep(1000);
		
		List<WebElement> allSearch = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(allSearch.size());
		
		/*for (int i=0; i<allSearch.size(); i++) {
			System.out.println(allSearch.get(i).getText());

	}*/
		for(WebElement a : allSearch) {
			System.out.println(a.getText());
		}

}
}