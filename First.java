import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class First {
	public static void main(String[] args) throws InterruptedException {
//        open the chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C://Users//q//Desktop//selinum jar and drivers//chromedriver_win32/chromedriver.exe");
		// navigate to url
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> abc = driver.findElements(By.tagName("a"));
		int num = abc.size();
		System.out.println(num);
//for(int i=1;i<=num;i++)
//{
//	System.out.println(abc.get(i).getText());
//	Thread.sleep(1000);
//}
		for (WebElement i : abc) {
			System.out.println(i.getText());
//	System.out.println(abc.get(i).getText());
			Thread.sleep(1000);
		}

//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
////WebElement radio_btn=driver.findElement(By.xpath("//input[@value='radio1']"));
//radio_btn.click();
//boolean b=radio_btn.isSelected();
//System.out.println(b);

		WebElement dropdown_btn = driver.findElement(By.id("dropdown-class-example"));

		Select s = new Select(dropdown_btn);

		System.out.println();
		Thread.sleep(1000);
		s.selectByValue("option2");
		Thread.sleep(1000);
		s.selectByValue("option1");
		s.selectByVisibleText("option1");

		// SearchContext driver1=new ChromeDriver();
//        driver.get("https://www.google.com");
		// By class name
//       WebElement gmail=driver.findElement(By.className("gb_d"));
//       gmail.click();

//       WebElement gmail=driver.findElement(By.partialLinkText("Gm"));
//       gmail.click();
//       
//      WebElement n= driver.findElement(By.tagName("a"));
////      boolean txt=n.isDisplayed();
////      
//      boolean txt=n.isEnabled();
//      
//       System.out.println(txt);
		// gmail.click();

//        WebElement search=driver.findElement(By.name("q"));
//        search.sendKeys("Java");
//        Thread.sleep(3000);
//        WebElement btn=driver.findElement(By.name("btnK"));
//        btn.click();
//        driver.close();
//        d
//        WebElement we1=driver.findElement(By.name("q"));
//        we1.sendKeys("Selenium");
//       // WebElement we2=driver.findElement(By.name("q"));
//      WebElement  we2=driver.findElement(By.name("btnK"));
//        we2.click();
//    }
	}
}
