package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://moodle.cestarcollege.com/moodle/");
		
		driver.findElement(By.linkText("Faq")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());
		
		Iterator<String> iter = allWindows.iterator();
		String mainWindow = iter.next();
		String childWindow = iter.next();
		System.out.println(mainWindow);
		System.out.println(childWindow);
		
		driver.switchTo().window(childWindow);   //// for this and 3 lines after that to work the whole drama is to
		System.out.println(driver.getTitle());   //// be written as above
		
		driver.switchTo().window(mainWindow);
		System.out.println(driver.getTitle());
		
	}

}
