package selenium_programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulator3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/q/Desktop/selinum jar and drivers/chrome_driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/draggable/");

		Thread.sleep(3000);
		List<WebElement> allframes=driver.findElements(By.tagName("iframe"));
		System.out.println("Total frame in the web element is "+allframes.size());
		driver.switchTo().frame(0);
		
		WebElement draggable=driver.findElement(By.id("draggable"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.dragAndDropBy(draggable, 100, 40);
		Thread.sleep(3000);
		act.clickAndHold(draggable).dragAndDropBy(draggable, 100, 40).build().perform();
		
		
		
		
		

	}

}
