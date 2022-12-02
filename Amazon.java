import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/q/Desktop/selinum jar and drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/ap/register");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\'ap_customer_name\']")).sendKeys("Harish Gwalani");
		driver.findElement(By.xpath("//*[@id=\'ap_phone_number\']")).sendKeys("9096308941");
	}
}
