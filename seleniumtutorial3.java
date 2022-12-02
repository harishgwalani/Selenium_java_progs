import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class seleniumtutorial3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/q/Desktop/selinum jar and drivers/chrome_driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        List<WebElement> link=driver.findElements(By.tagName("a"));
        System.out.println(link.size());
        for(WebElement l:link )
        {
            System.out.println(l.getText());
        }
    }
}
