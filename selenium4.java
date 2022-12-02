import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium4 {
	public static void main(String[] args) {
//        System.setProperty("webdriver.gecko.driver","C:/Users/q/Desktop/selinum jar and drivers/firefox_driver/geckodriver.exe");
//        WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver",
				"C://Users//q//Desktop//selinum jar and drivers//chromedriver_win32/chromedriver.exe");
		// navigate to url
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin");
		driver.manage().window().maximize();
		try {
			driver.findElement(By.id("identifierId")).sendKeys("harish.gwalani@gmail.com");
			driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
