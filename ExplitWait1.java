package selenium_programs;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplitWait1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/q/Desktop/selinum jar and drivers/chrome_driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// implicit Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		WebElement username = driver.findElement(By.className("inputtext"));
		username.sendKeys("jhhjhd");

		// explicit Wait
		WebDriverWait wt = new WebDriverWait(driver, 60);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("passs"))).sendKeys("12345");
//	WebElement password=driver.findElement(By.id("pass"));
//	password.sendKeys("1234");
		WebElement loginbutton = driver.findElement(By.name("login"));
		loginbutton.click();
		WebElement error = driver.findElement(By.cssSelector("div._9ay7"));
		String msg = error.getText();
		System.out.println(msg);
	}
}
