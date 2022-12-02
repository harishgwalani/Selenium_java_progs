import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        //open the chrome browser
//        System.setProperty("webdriver.chrome.driver","C://Users//q//Desktop//selinum jar and drivers//chrome_driver/chromedriver.exe");
//        //navigate to url
//        WebDriver driver=new ChromeDriver();
//        //SearchContext driver1=new ChromeDriver();
//        driver.get("https://www.google.com");
//        driver.close();
        //open the firefox browser
        System.setProperty("webdriver.gecko.driver","C://Users//q//Desktop//selinum jar and drivers//firefox_driver/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.google.com");
    }
}
