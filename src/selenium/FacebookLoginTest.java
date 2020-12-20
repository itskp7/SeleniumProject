package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe" );
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.className("inputtext login_form_input_box")).sendKeys("hgfhfrdrxtjy");  //when there is space in class name, we cannot use it directly
		//driver.findElement(By.id("email")).sendKeys("gvjhghghjhjk");  //working
		driver.findElement(By.name("email")).sendKeys("fsgsvsvfrvgr"); //working
		//driver.findElement(By.tagName("input")).sendKeys("csfdedwef"); // not working bcz tag name "input is not unique or first in e list
		
		driver.findElement(By.name("pass")).sendKeys("fsfseeegreg");
		driver.findElement(By.id("loginbutton")).click();
		
		//id
		//name
		//class name - cannot use direct;y if there is a space
		//linktext - only for the links
		//partial linktext - only for links
		//tagName usuallly not unique
		//cssSelector - write by your own
		//xpath - write by your own
		
		
		
		
		
		
        
	}

}
