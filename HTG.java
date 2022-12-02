import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HTG {
	public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver","C:/Users/q/Desktop/selinum jar and drivers/chrome_driver/chromedriver.exe");
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.facebook.com");
//        driver.close();

		System.setProperty("webdriver.gecko.driver",
				"C:/Users/q/Desktop/selinum jar and drivers/firefox_driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.close();
	}
}
