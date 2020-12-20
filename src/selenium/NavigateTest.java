package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe" );  // we have to type this because its a application and not jar, copypaste address in value in double quotes
		FirefoxDriver driver = new FirefoxDriver();
		//driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.google.com/");
		
		/*driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/
	
	}

}
