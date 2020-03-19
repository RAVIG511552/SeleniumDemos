package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoveToParentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Jarfiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://opensource-demo.orangehrmlive.com/index.php/");
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.className("button")).click();
		
		
		//String str=driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]//parent::li//preceding-sibling::li[1]//child::a[contains(text(),'WebTable')]")).getText();
		String str=driver.findElement(By.xpath("//b[contains(text(),'Performance')]//parent::a//parent::li//preceding-sibling::li[1]")).getText();
		driver.findElement(By.xpath("//b[contains(text(),'Performance')]//parent::a//parent::li//preceding-sibling::li[1]")).click();
		System.out.println(str);
	}

}
