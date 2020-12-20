package selenium;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowserTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//String browser = "Firefox";  //Chrome  // we'll read this value from data file
		WebDriver driver; /// WebDriver created  
		
		FileInputStream kp = new FileInputStream("C:\\testing\\MultipleBrowserPropFile.properties");   // for reading from data file
		Properties prop = new Properties();
		prop.load(kp);
		
		String browser = prop.getProperty("browser");
		
		if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe" );
			driver = new FirefoxDriver();	
		}else {
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe" );
			driver = new ChromeDriver();
		}
		
		//FileInputStream kp = new FileInputStream("C:\\testing\\MultipleBrowserPropFile.properties");
		//Properties prop = new Properties();
		//prop.load(kp);
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("incorrectEmail"));   
		System.out.println(prop.getProperty("incorrectPass"));
		
		
		/*driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("fsgsvsvfrvgr"); //working
		driver.findElement(By.name("pass")).sendKeys("fsfseeegreg");
		driver.findElement(By.linkText("Log In")).click();*/
		
		String u = prop.getProperty("url");
		driver.get(u);
		
		String e = prop.getProperty("incorrectEmail");
		driver.findElement(By.name("email")).sendKeys(e);
		
		String p = prop.getProperty("incorrectPass");
		driver.findElement(By.name("pass")).sendKeys(p);
		
		driver.findElement(By.name("login")).click();  //also can use .sendKeys(Keys.ENTER);
	}

}
