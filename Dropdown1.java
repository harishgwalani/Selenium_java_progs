package selenium_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/q/Desktop/selinum jar and drivers/chrome_driver/chromedriver.exe");
		
		//Driver
		WebDriver driver = new ChromeDriver();
		
		
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement newaccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		newaccount.click();
		Thread.sleep(5000);
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("ravi");

		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("gwalani");

		Thread.sleep(5000);
		// 1st way
		List<WebElement> allbirthmonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Total month is " + allbirthmonth.size());
		System.out.println(allbirthmonth.get(8).isEnabled());

		allbirthmonth.get(8).click();

		// 2nd way
		WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(bm);
		month.selectByVisibleText("Apr");
		month.selectByIndex(3);
		month.selectByIndex(4);
		System.out.println(month.getFirstSelectedOption().getText());

		// 3rd way
		WebElement bm1 = driver.findElement(By.xpath("//select[@id='month']"));
		Select month1 = new Select(bm1);
		List<WebElement> dropdown = month1.getOptions();
		for (int i = 0; i < dropdown.size(); i++) {
			String dropdownvalues = dropdown.get(i).getText();//0 //1//2//3//10
			if (dropdownvalues.equalsIgnoreCase("Nov"))//nov ==Nov//true
			{
				dropdown.get(i).click();
			}
		}
		
		//4th way
		bm1.sendKeys("Feb");
		
		//5th way
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Dec");
		
		//6th mulltiple selection
		
		System.out.println(month1.isMultiple());

	}

}
