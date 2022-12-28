package selenium_programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/q/Desktop/selinum jar and drivers/chrome_driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
		List<WebElement> CompanyList = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("Number of Company is " + CompanyList.size());

		List<WebElement> currentprice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Number of current is " + currentprice.size());

		// Total Company and current price resp
//		for (int i = 0; i < CompanyList.size(); i++) {
//			System.out.println("The Name of Company is "+CompanyList.get(i).getText()+"The Current price is "+currentprice.get(i).getText());
		driver.manage().deleteAllCookies();
		String expectedString = "UCO Bank";
		for (int i = 0; i < CompanyList.size(); i++) {

			if (CompanyList.get(i).getText().equalsIgnoreCase(expectedString)) {
				System.out.println("The Name of Company is " + CompanyList.get(i).getText() + "The Current price is "
						+ currentprice.get(i).getText());
				CompanyList.get(i).click();
				break;

			}
		}

	}

}
