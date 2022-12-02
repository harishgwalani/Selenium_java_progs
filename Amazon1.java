import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C://Users//q//Desktop//selinum jar and drivers//chromedriver_win32/chromedriver.exe");
		// navigate to url
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Redmi");
		WebElement submitsearch = driver.findElement(By.id("nav-search-submit-button"));
		submitsearch.click();
		Thread.sleep(3000);
//	WebElement clicable=driver.findElement(By.linkText("Redmi 9 Activ (Coral Green, 4GB RAM, 64GB Storage)| Octa-core Helio G35 | 5000 mAh Battery"));
//	clicable.click();	
		WebElement clicable = driver.findElement(By.partialLinkText("Redmi"));
		clicable.click();
	}

}
