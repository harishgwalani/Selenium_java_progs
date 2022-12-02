import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users//q//Desktop//selinum jar and drivers//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("email")).sendKeys("harish.gwalani@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("12345");
		driver.findElement(By.className("_42ft")).click();
		System.out.println(driver.findElement(By.cssSelector("div._9ay7")).getText());
//		driver.findElement(By.xpath(null))
		driver.findElement(By.linkText("Forgotten password?")).click();
		
	}

}
