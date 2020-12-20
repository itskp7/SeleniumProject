package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		List<WebElement> radioButton = driver.findElements(By.name("group1"));
		System.out.println(radioButton.size());
		
		for (WebElement a : radioButton) {
			if(a.isSelected()) {                                                     //only for selecting on one button and printing
			System.out.println(a.getAttribute("value")+"---------"+a.isSelected());  //after value +... is for printing true or false
		}
		}
		
		//driver.findElement(By.xpath("//input[@value='Cheese']")).click(); // no need to create a webelement bcz we have a list already so just click on index
		radioButton.get(2).click();
		System.out.println("----------------------after selecting the radio button---------");
		
		for (WebElement a: radioButton) {
			if (a.isSelected()) {
			System.out.println(a.getAttribute("value")+"-----"+a.isSelected());
		}
		}

	}

}
