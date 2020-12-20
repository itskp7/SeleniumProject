package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		String s = driver.findElement(By.name("_nkw")).getAttribute("placeholder"); // also id works
		System.out.println(s);
		
		//verify user is able to enter anything in the search box
		driver.findElement(By.id("gh-ac")).sendKeys("iphone");
		String p = driver.findElement(By.id("gh-ac")).getAttribute("value");  //SEEEEEEEEEEEEEEEEEEEEEEEE
		System.out.println(p);
		
	
		

	}

}
