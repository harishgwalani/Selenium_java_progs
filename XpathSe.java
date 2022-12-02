import java.sql.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSe {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/htg", "root", "root");
			Statement s = con.createStatement();
//rerive code
//	ResultSet rs=s.executeQuery("select * from person");
//	while(rs.next())
//	{
//		System.out.println(rs.getString("id"));
//		System.out.println(rs.getString("name"));	
//	}

			// insert into sql code
//	 s.executeUpdate("insert into person values(104,'barkha')");

//seleinium
			ResultSet rs = s.executeQuery("select * from person where id=101");
			while (rs.next()) {
				System.setProperty("webdriver.chrome.driver",
						"C:/Users//q//Desktop//selinum jar and drivers//chromedriver_win32//chromedriver.exe");

				WebDriver driver = new ChromeDriver();

				driver.get("https://login.salesforce.com");
				driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(rs.getString("id"));

				driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(rs.getString("name"));

			}

			System.out.println("Connected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}