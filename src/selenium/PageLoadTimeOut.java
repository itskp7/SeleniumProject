package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageLoadTimeOut {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/javascript4.htm");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@value='confirm box']")).click(); // also can use .name("B2")
		Thread.sleep(2000);
		
		Alert ale = driver.switchTo().alert();
		System.out.println(ale.getText());
		
		//ale.accept(); //for clicking on ok
		ale.dismiss(); // it will click on cancel in this case with dismiss
		

	}

}
