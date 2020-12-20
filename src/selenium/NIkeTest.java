package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NIkeTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe" );
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.nike.com/ca/");
		
		WebElement men = driver.findElement(By.xpath("//a[@aria-label='MEN']"));  //nikul did by linktext "MEN"
		
		Actions builder = new Actions(driver);    
		builder.moveToElement(men).build().perform();   
		
		Thread.sleep(3000);
		
		List<WebElement> menLink = driver.findElements(By.xpath("//div[@id='NavigationMenu-0-1']//div[2]/a")); // nikul did by "//div[@data-nav='1,1]/a"
		System.out.println(menLink.size());
		
		for (WebElement a : menLink) {
			System.out.println(a.getText());
		}

	}

}
