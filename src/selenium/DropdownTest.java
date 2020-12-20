package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		// all category list from ebay print and size but not clicking
		
		//driver.findElement(By.id("gh-cat")).click();
		//Thread.sleep(1000);
		
		List<WebElement> allCateg = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(allCateg.size());
		
		for(WebElement a : allCateg) {
			if(a.isSelected()) {
			System.out.println(a.getText()+"--------"+a.isSelected());
		}
	}
  	
		WebElement box = driver.findElement(By.id("gh-cat"));  // WebElement form where you want to select any option 
		Select s = new Select(box);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByValue("2984");
		Thread.sleep(2000);
		s.selectByVisibleText("Books");
		System.out.println("------------------------------after selecting from drodown------------------------------");
		
		for(WebElement a : allCateg) {
			if(a.isSelected()) {
			System.out.println(a.getText()+"--------"+a.isSelected());
		}	
	}

	}

}
