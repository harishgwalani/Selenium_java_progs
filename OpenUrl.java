package selenium_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrl {

	public static void main(String[] args) throws InterruptedException {
		//setting the property of chrome browser and passing chrome driver path
		System.setProperty("webdriver.chrome.driver","C:/Users/q/Desktop/selinum jar and drivers/chrome_driver/chromedriver.exe");
		
		//launch the chrome browser we create reference object.WebDriver is interface and ChromeDriver is class.Every interface is class.
		WebDriver driver=new ChromeDriver();
		
		//implicit wait -wait for all webElement 30 sec if failure occurce after 30 sec occurce
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//launch the url 
		driver.get("https://www.facebook.com/");
		
		//finding path of web element using className tag
		WebElement username=driver.findElement(By.className("inputtext"));
		username.sendKeys("jhhjhd");
		
		//finding path of web element  using id tag
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("1234");
		
		//finding path of web element  using name tag
		WebElement loginbutton=driver.findElement(By.name("login"));
		loginbutton.click();
		
		//finding path of web element using css Selector tag
		WebElement error=driver.findElement(By.cssSelector("div._9ay7"));
		String msg=error.getText();
		System.out.println(msg);
		
		
		

	}

}
