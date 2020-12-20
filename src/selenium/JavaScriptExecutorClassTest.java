package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutorClassTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;    //  javascriptexecutor is a inbuilt class for scrolling
		//jse.executeScript("window.scrollBy(0,1600)");  // type it by hand window...  // x and y co-ordinates
		
		WebElement a = driver.findElement(By.linkText("Registration"));
		System.out.println(a.getLocation());  // this will give exact x and y coordinates of particular
		
		jse.executeScript("arguments[0].scrollIntoView(true)", a);
	}

}
