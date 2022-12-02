import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium5 {
	public static void main(String[] args) {

//        System.setProperty("webdriver.gecko.driver","C:/Users/q/Desktop/selinum jar and drivers/firefox_driver/geckodriver.exe");
//        WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver",
				"C://Users//q//Desktop//selinum jar and drivers//chromedriver_win32/chromedriver.exe");
		// navigate to url
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div/input[2]")).sendKeys("harish.gwalani@gmail.com");

//        WebElement b = driver.findElement(By.className("_2IX_2- _3mctLh VJZDxU"));
//        b.click();
//        driver.manage().window().maximize();
		// VfPpkd-vQzf8d
		//// *[@id='identifierNext']/div/button/span
	}
}
