package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe" );  // we have to type this because its a application and not jar, copypaste address in value in double quotes
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://www.google.com/");
			
			
			//driver.findElement(By.linkText("About")).click();
			driver.findElement(By.partialLinkText("Abo")).click(); // even "A" could work but should be first
			
			Thread.sleep(2000);
			
			String expectedTitle = "Google - About Google, Our Culture & Company News";
			String actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			
			String expectedUrl = "about.google";
			String actualUrl = driver.getCurrentUrl();
			System.out.println(actualUrl);
			
			if(expectedTitle.equals(actualTitle) && actualUrl.contains(expectedUrl)) {
				System.out.println("test pass");
			}else {
				System.out.println("test fail");
				
			}

			

	}

}
