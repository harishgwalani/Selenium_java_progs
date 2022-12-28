package selenium_programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository {

	public static void main(String[] args) throws Exception {

		// specify the location of the properties file

		File src = new File("C:\\Users\\q\\eclipse-workspace\\Oct_10_Selenium\\Repository\\object_repo.properties");

		// create FileInputStream class object to load the fiile

		FileInputStream fis = new FileInputStream(src);

		// create properties class object to read the file

		Properties pro = new Properties();
		pro.load(fis);

		// setting the property of chrome browser and passing the chromDriver path

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/q/Desktop/selinum jar and drivers/chrome_driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get(pro.getProperty("URL"));

		// getProperty() method accept key and it returns value for the same

		driver.findElement(By.xpath(pro.getProperty("Email"))).sendKeys(pro.getProperty("TestData1"));

		driver.findElement(By.xpath(pro.getProperty("Password"))).sendKeys(pro.getProperty("TestData2"));

		driver.findElement(By.xpath(pro.getProperty("Loginbtn"))).click();
	


	}

}
