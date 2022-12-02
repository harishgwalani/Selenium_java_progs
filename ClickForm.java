import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class ClickForm{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://Users//q//Desktop//selinum jar and drivers//chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.facebook.com/";
        driver.get(url);
        // identify elements
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("123456");
        // submitting form with click()
        driver.findElement(By.name("login")).click();
        //driver.quit();
    }
}