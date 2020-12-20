package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeysTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://login.yahoo.com/?.src=ym&lang=en-CA&done=https%3A%2F%2Fmail.yahoo.com%2F%3F.intl%3Dca%26.lang%3Den-CA%26.partner%3Dnone%26.src%3Dfp%26guce_referrer%3DaHR0cHM6Ly9jYS55YWhvby5jb20v%26guce_referrer_sig%3DAQAAAIvWFiiyV0NTq0TdcgnWkbctBwlk34BX1u22oV9et4caQSQXQjLbaLmYxz4pxor1Dqcmecepn4d3Pg0XvhrRU26FIVUTVI8-cO-y2w384SFfyIDzhysjZ7EMMhoVkmzDxdwhedVXl1Rzd_kYaBvzdZAyA6zELadUdkjjiCv-djzz&.partner=none");
		
		driver.findElement(By.id("login-username")).sendKeys("krunal");
		driver.findElement(By.id("login-username")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-passwd")).sendKeys("dasfferfgfrs");
		driver.findElement(By.id("login-passwd")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		String expectedErr = "Invalid password. Please try again";
		String actualErr = driver.findElement(By.className("error-msg")).getText();
		System.out.println(actualErr);
		
		if(expectedErr.equals(actualErr)) {
			System.out.println("passed");
		}else {
			System.out.println("failed");
		}
	

	}

}
