package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		List<WebElement> link = driver.findElements(By.linkText("Sortable"));
		System.out.println(link.size());
		
		// verifying sortable link present or not (should be present)
		
		if (link.size()>0) {
			System.out.println("Sortable Present");
		}else {
			System.out.println("Sortable not present");
		}
		
		// verifying draggable box present or not (so it should not be present)
		
		List<WebElement> box = driver.findElements(By.id("draggable"));
        System.out.println(box.size());
		
		if (box.size()>0) {
			System.out.println("draggable Present");
		}else {
			System.out.println("draggable not present");
		}
		
		//driver.switchTo().frame(0);  //INDEX
		//driver.switchTo().frame("demo-frame");  // When you have name or id for the frame. we cannot string in this case.
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));   // WebElement
		System.out.println("--------------------------------After switching to frame----------------------------------");
		
		link = driver.findElements(By.linkText("Sortable"));
		System.out.println(link.size());
		
		// verifying sortable link present or not (should be present)
		
		if (link.size()>0) {
			System.out.println("Sortable Present");
		}else {
			System.out.println("Sortable not present");
		}
		
		// verifying draggable box present or not (so it should not be present)
		
		box = driver.findElements(By.id("draggable"));
        System.out.println(box.size());
		
		if (box.size()>0) {
			System.out.println("draggable Present");
		}else {
			System.out.println("draggable not present");
		}
		
		driver.switchTo().defaultContent(); // switch to main page
		System.out.println("-------------------After switching to main----------------------");
		
		link = driver.findElements(By.linkText("Sortable"));
		System.out.println(link.size());
		
		// verifying sortable link present or not (should be present)
		
		if (link.size()>0) {
			System.out.println("Sortable Present");
		}else {
			System.out.println("Sortable not present");
		}
		
		// verifying draggable box present or not (so it should not be present)
		
		box = driver.findElements(By.id("draggable"));
        System.out.println(box.size());
		
		if (box.size()>0) {
			System.out.println("draggable Present");
		}else {
			System.out.println("draggable not present");
		}
		
		// driver.switchTo().parentFrame();   for switching to the parent of that frame

	}

}
