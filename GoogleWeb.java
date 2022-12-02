import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleWeb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C://Users//q//Desktop//selinum jar and drivers//chromedriver_win32/chromedriver.exe");
		// navigate to url
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.in/");

		WebElement gmail = driver.findElement(By.xpath("//div//div[1]//div//div[1]//a"));
		String name = gmail.getText();
		boolean b = gmail.isDisplayed();
		System.out.println(name);

		// xpath by attribute name
//	WebElement gmail=driver.findElement(By.xpath("//a[@class='gb_d']"));
//	gmail.click();
		// xpath by text

//	WebElement gmail=driver.findElement(By.xpath("//a[text()='Gmail']"));
//	gmail.click();

		// xpath by contains

//	WebElement gmail=driver.findElement(By.xpath("//a[contains(text(),'Gm')]"));
//	gmail.click();

		// xpath by index
//	WebElement gmail=driver.findElement(By.xpath("//a[@class='gb_d'][1]"));
//	gmail.click();
		// (//a[@class='gb_d'])[2]
		// xpath by absolute
//	WebElement gmail=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[1]/a"));
//	gmail.click();

		// xpath by Relative
//	WebElement gmail=driver.findElement(By.xpath("//div//div//div[1]//div//div[1]//a"));
//	gmail.click();
	}

}
