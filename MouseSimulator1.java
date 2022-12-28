package selenium_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulator1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/q/Desktop/selinum jar and drivers/chrome_driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");

		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		WebElement electronic=driver.findElement(By.xpath("//*[text()='Electronics']"));
		Actions act=new Actions(driver);
		
		Thread.sleep(3000);
		act.moveToElement(electronic).build().perform();
		
//		Thread.sleep(3000);
//		act.contextClick().build().perform();
		
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		System.out.println("Enter press");
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		
		Thread.sleep(3000);
		WebElement Home=driver.findElement(By.xpath("//*[text()='Home']"));
		
		Thread.sleep(3000);
		
		act.sendKeys(Home, Keys.ENTER).build().perform();
		System.out.println("Home option clicked");

	}

}
