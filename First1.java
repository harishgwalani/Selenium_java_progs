import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First1 {
	public static void main(String[] args) {
	

		// Chrome

		System.setProperty("webdriver.chrome.driver", "C:/Users/q/Desktop/selinum jar and drivers/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();


		//Firefox

		System.setProperty("webdriver.gecko.driver", "C:/Users/q/Desktop/selinum jar and drivers/firefox_driver/geckodriver.exe");

		WebDriver driver1 = new FirefoxDriver();

		//Microsoft Edge

		System.setProperty("webdriver.edge.driver", "C:/Users/q/Desktop/selinum jar and drivers/edgedriver_win64/msedgedriver.exe");

		WebDriver driver2 = new EdgeDriver();

		driver.get("https://www.facebook.com");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.close();

		//driver.quit();
	}

}
