package SeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationDemo {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Jarfiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.className("button")).click();
		
		String str=driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).getText();
		System.out.println(str);
		
		//Explicit wait
		//WebDriverWait mywait1=new WebDriverWait(driver,10);
		//mywait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));
		
		driver.findElement(By.linkText("Welcome Admin")).click();
		
		//WebDriverWait mywait2=new WebDriverWait(driver,10);
		//mywait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Logout')]")));
		
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
		driver.close();
	}

}
