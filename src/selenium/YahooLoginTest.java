package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		// enter wrong email and click on next button
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://login.yahoo.com/?.src=ym&.partner=none&.lang=en-CA&.intl=ca&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%3F.intl%3Dca%26.lang%3Den-CA%26.partner%3Dnone%26.src%3Dfp");
		
		driver.findElement(By.id("login-username")).sendKeys("fsvsvewbr");
		driver.findElement(By.id("login-signin")).click();
		
		Thread.sleep(2000);
		
		String expectedErrMsg = "Sorry, we don't recognize this email.";
		String actualErrMsg = driver.findElement(By.id("username-error")).getText();
		System.out.println(actualErrMsg);
		
		if(expectedErrMsg.equals(actualErrMsg)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
	}

}
