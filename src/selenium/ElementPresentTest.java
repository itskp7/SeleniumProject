package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe" );  // we have to type this because its a application and not jar, copypaste address in value in double quotes
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//We cannot use WebElement to check element is present or not
		
		/*if(driver.findElement(By.linkText("Aboutbfgnfnfth")).isDisplayed()) {
			System.out.println("Element Present");
		}else {
			System.out.println("Element not present");
		}*/
		
		List<WebElement> element = driver.findElements(By.linkText("About"));
		System.out.println(element.size());
		
		if (element.size()>0) {
			System.out.println("Element Present");
		}else {
			System.out.println("Element not present");
		}
	}

}
