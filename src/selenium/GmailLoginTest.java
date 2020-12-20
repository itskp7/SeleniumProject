package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.findElement(By.id("identifierId")).sendKeys("svgrdvdfbf");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(3000);
		
		String ExpectedErrMsg = "Couldn't find your Google Account";
		String actualErrMsg = driver.findElement(By.className("o6cuMc")).getText();
		System.out.println(actualErrMsg);
		
		if(ExpectedErrMsg.equals(actualErrMsg)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		

	}

}
