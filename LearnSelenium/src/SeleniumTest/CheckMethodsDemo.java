package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckMethodsDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jarfiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		boolean checkpresence=driver.findElement(By.id("Email")).isDisplayed();
		System.out.println(checkpresence);
		
		boolean checkenable=driver.findElement(By.id("Email")).isEnabled();
		System.out.println(checkenable);
		
		if(checkpresence && checkenable)
		{
			driver.findElement(By.id("Email")).sendKeys("naniravi4664@gmail.com");
		}
	}

}
