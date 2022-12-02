import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumtutorial2 {
	public static void main(String[] args) {
		// open the chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C://Users//q//Desktop//selinum jar and drivers//chrome_driver/chromedriver.exe");
		// navigate to url
		WebDriver driver = new ChromeDriver();
		// SearchContext driver1=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		// maximize the chrome browser
		driver.manage().window().maximize();
		// amazon serach bar
		// sreach by id
//<input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder="" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search">
//<input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder="" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search">

// driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Redmi 10");
		// orwq

		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("t shirts for women");
		search.submit();
		// serach by name
//        driver.findElement(By.name("field-keywords")).sendKeys("realme");

		// <a
		// href="/s?bbn=16225007011&amp;rh=i%3Aspecialty-aps%2Cn%3A16225007011%2Cn%3A13896617011&amp;ref_=nav_em__nav_desktop_sa_intl_computers_tablets_0_2_6_4"
		// class="hmenu-item">Computers &amp; Tablets</a>

		// <a href="/gp/goldbox?ref_=nav_cs_gb" class="nav-a " tabindex="0"
		// data-csa-c-type="link" data-csa-c-slot-id="nav_cs_0"
		// data-csa-c-content-id="nav_cs_gb"
		// data-csa-c-id="nefk40-45zmxv-ey3wv6-dqn4ew">Today's Deals</a>
//        driver.findElement(By.linkText("Today's Deals")).click();
	}
}
