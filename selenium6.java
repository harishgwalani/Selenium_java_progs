import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium6 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:/Users/q/Desktop/selinum jar and drivers/firefox_driver/geckodriver.exe");
//        WebDriver driver=new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver","C://Users//q//Desktop//selinum jar and drivers//chrome_driver/chromedriver.exe");
        //navigate to url
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/login/");

        WebElement l = driver.findElement(By.name("email"));
        l.sendKeys("harish.gwalani@gmail.com");
        l.click();
        ///html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span
        //driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/span")).click();

        WebElement b = driver.findElement(By.name("pass"));
        b.sendKeys("031088");
        b.click();
        driver.findElement(By.name("login")).click();
        driver.manage().window().maximize();
    }
}
