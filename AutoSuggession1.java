package selenium_programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggession1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/q/Desktop/selinum jar and drivers/chrome_driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("How Stuff Works");

		List<WebElement> Allsuggesion = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println("Total Auto Suggesion is " + Allsuggesion.size());

		for (int i = 0; i < Allsuggesion.size(); i++) {
			String expresult = "How Stuff Works book";
			if (Allsuggesion.get(i).getText().equalsIgnoreCase(expresult)) {
				Allsuggesion.get(i).click();
				System.out.println(Allsuggesion.get(i));
				break;
			}

		}
	}
}
