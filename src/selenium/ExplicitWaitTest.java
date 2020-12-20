package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/javascript4.htm");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,30);  // we have to create a object for using explicit wait// webdriverwait is a inbuilt class
		
		driver.findElement(By.xpath("//input[@value='confirm box']")).click(); // also can use .name("B2")
		// Thread.sleep(2000);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert ale = driver.switchTo().alert();
		System.out.println(ale.getText());
		
		//ale.accept(); //for clicking on ok
		ale.dismiss(); // it will click on cancel in this case with dismiss
	}

}
