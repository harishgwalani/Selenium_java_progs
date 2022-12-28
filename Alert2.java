package selenium_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alert2 {
	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/q/Desktop/selinum jar and drivers/chrome_driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");

		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
//
////Verify the alert
		String actualString = driver.switchTo().alert().getText();
		String expString = "Do you confirm action?";
		Assert.assertEquals(actualString, expString);
		System.out.println("Alert text verified");
//		//Accept the alert
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		System.out.println("Alert accepted");
//		
//		//Dismiss the alert
		Thread.sleep(3000);
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		System.out.println("Alert dismiss");
		

		// sending data to alert box

		Thread.sleep(3000);

		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("harish");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

		System.out.println("Alert input accepted");

	}
}
