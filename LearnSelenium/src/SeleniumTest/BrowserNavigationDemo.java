package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jarfiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.navigate().forward();
		Thread.sleep(5000);
		
		driver.navigate().to("http://demowebshop.tricentis.com/");
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		driver.close();
	}

}
