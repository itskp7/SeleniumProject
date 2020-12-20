package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		File scrFile = driver.getScreenshotAs(OutputType.FILE);   // This is for FirefoxDriver, Chrodriver or any class driver
		//File scrFile = ((TakeScreenshot)driver).getScreenshotAs(OutputType.FILE);  // This line is for WebDriver  (if line 16 used)
		FileUtils.copyFile(scrFile, new File("C:/testing/screenshot.jpeg"));
		
		
	
	}

}
