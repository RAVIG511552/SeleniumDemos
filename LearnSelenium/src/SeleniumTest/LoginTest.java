package SeleniumTest;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Jarfiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.get("http://demowebshop.tricentis.com/login");
		//driver.findElement(By.id("Email")).sendKeys("naniravi4664@gmail.com");
		//driver.findElement(By.name("Password")).sendKeys("pwd@123");
		//driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		//driver.findElement(By.className("ico-logout")).click();
		
		driver.get("http://demowebshop.tricentis.com/register");
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Ravi");
		driver.findElement(By.id("LastName")).sendKeys("g");;
		driver.findElement(By.name("Email")).sendKeys("ravigangadharolla33@gmail.com");;
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("pwd@1234");;
		driver.findElement(By.name("ConfirmPassword")).sendKeys("pwd@1234");;
		driver.findElement(By.name("register-button")).click();
		driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']")).click();
		driver.findElement(By.className("ico-logout")).click();
	}

}
