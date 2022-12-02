import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C://Users//q//Desktop//selinum jar and drivers//chromedriver_win32/chromedriver.exe");
        //navigate to url
        WebDriver driver=new ChromeDriver();
        //SearchContext driver1=new ChromeDriver();
        driver.get("https://www.google.com");
        //Thread.sleep(3000);
        //driver.findElement(By.name("q")).sendKeys("Selenium in java");
       // driver.findElement(By.name("btnK")).click();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        String t=driver.getTitle();
        System.out.println(t);
        String ps=driver.getPageSource();
        System.out.println(ps);
        String g=driver.getCurrentUrl();
        System.out.println(g);
        
        }

}
