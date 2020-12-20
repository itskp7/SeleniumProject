package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		// Because in different FRAME
		driver.switchTo().frame(0);
		
		WebElement a = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement b = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(a, b).build().perform();
		
		Thread.sleep(2000);
		
		///HomeWork Part
		String expectedText = "Dropped!";
		String actualText = driver.findElement(By.xpath("//div[@id='droppable']")).getText();
		System.out.println(actualText);
		
		if (expectedText.equals(actualText)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		/*List<WebElement> kp = driver.findElements(By.id("droppable"));  // by link text doesn't work why? 
		System.out.println(kp.size());
		
		for (WebElement krunal:kp) {
			if (krunal.equals(obj))
		}*/
		
		//System.out.println();
		/*if () {
			System.out.println("Test pass");
		}else {
			System.out.println("Test fail");
		}*/
		

	}

}
