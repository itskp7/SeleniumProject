package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MissisaugaTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.mississauga.ca/portal/home");
		
		WebElement cityH = driver.findElement(By.id("tnNavHall")); //(By.xpath("//div[@id='tnNavHall']//a//img"));  // webelement created first
		
		Actions builder = new Actions(driver);    //  this is object made
		builder.moveToElement(cityH).build().perform();   // the webelement made is used here
		
		Thread.sleep(2000);
		
		List<WebElement> citLink = driver.findElements(By.xpath("//div[@id='tnNavHallMenu']/a"));
		System.out.println(citLink.size());
		
		for (WebElement a : citLink) {
			System.out.println(a.getText());
		}
		
		/*for (int i=0;i<citLink.size();i++) {
			System.out.println(citLink.get(i).getText());
		}*/
		
		
		
		

	}

}
