package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitWaitTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.name("lastname")).sendKeys("fsgvrddbgr");
		System.out.println(driver.findElement(By.name("lastname")).getAttribute("value"));
		driver.findElement(By.name("reg_email__")).sendKeys("9521848915");
		driver.findElement(By.name("reg_passwd__")).sendKeys("faecsecfefcec");
		
		WebElement mon = driver.findElement(By.id("month"));  // this is a object created
		Select m = new Select(mon);
		m.selectByValue("3");        ///can be done by index as well but not in inverted commas
		
		WebElement dat = driver.findElement(By.id("day"));
		Select d = new Select(dat);
		d.selectByValue("20");
		
		WebElement ye = driver.findElement(By.id("year"));
		Select y = new Select(ye);
		y.selectByValue("2000");   // can be done by text as well
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
	
		
		driver.findElement(By.name("websubmit")).click();
		//Thread.sleep(2000);
		
		//verify that user is getting error message
		String expectedErrMsg = "What’s your name?";
		String actualErrMsg = driver.findElement(By.xpath("//div[contains(@id, 'js_')]")).getText();
		System.out.println(actualErrMsg);
		
		
		if(expectedErrMsg.equals(actualErrMsg)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
	}

}
}