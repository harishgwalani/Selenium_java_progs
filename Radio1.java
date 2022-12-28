package selenium_programs;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/q/Desktop/selinum jar and drivers/chrome_driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement newaccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		newaccount.click();
		Thread.sleep(5000);
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("ravi");

		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("gwalani");

		Thread.sleep(5000);

		//first method
		WebElement male = driver.findElement(By.xpath("//input[@value='1']"));
		male.click();

		WebElement female = driver.findElement(By.xpath("//input[@value='2']"));
		female.click();

		WebElement custom = driver.findElement(By.xpath("//input[@value='-1']"));
		custom.click();

		
		//2nd Method
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("size of radio butoone is " + radio.size());

		System.out.println("male is enabled or not " + radio.get(1).isEnabled());// male is enabled or not

		System.out.println("female is enabled or not " + radio.get(0).isEnabled());// female is enabled or not

		System.out.println("custom is enabled or not " + radio.get(1).isEnabled());// custom is enabled or not

		System.out.println("custome is displayed or not " + radio.get(2).isDisplayed());// custom

		System.out.println("male is displayed or not " + radio.get(1).isDisplayed());// custom

		System.out.println("female is displayed or not " + radio.get(0).isDisplayed());// custom

		System.out.println("female is selected or not " + radio.get(0).isSelected());// female
		Thread.sleep(2000);
		radio.get(0).click();
		System.out.println("female is selected or not " + radio.get(0).isSelected());// female
		Thread.sleep(2000);

		System.out.println(radio.get(0).isSelected());// female

		//3rd way correct way
		
		List<WebElement> radios=driver.findElements(By.xpath("//label[contains(@class,'mt')]"));
		System.out.println("Total radio button "+radios.size());
		String expResult="Custom";
		for(int i=0;i<radios.size();i++)//0 //1  //2
		{
			if(radios.get(i).getText().equalsIgnoreCase(expResult))//female==custom  //male==cusome //custome=-custom
			{
					radios.get(i).click();
					System.out.println(expResult+ " clicked");
					break;
			}
			
		}
	} 

}
