package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver","E:\\Jarfiles\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "E:\\Jarfiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
	}

}
