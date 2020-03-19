package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Jarfiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("naniravi4664@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("pwd@123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

		
		String er="WebShop";
		String ar=driver.getTitle();
		System.out.println(ar);
		if(er.equals(ar))
		{
			System.out.println("correct page");
		}
		else
		{
			System.out.println("incorrect page");
		}
		
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
	}

}
