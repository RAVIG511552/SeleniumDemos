package SeleniumTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jarfiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[contains(text(),'click')]")).click();
		//String parentWindowHandler=driver.getWindowHandle();
		//System.out.println("Parent handler: "+parentWindowHandler);
		//System.out.println(driver.getTitle());
//		for(int i=0;i<3;i++){
//			clickElement.click();
//			Thread.sleep(3000);
//		}
		
		Set<String> childWindows=driver.getWindowHandles();
		Iterator<String>iter=childWindows.iterator();
		
		String mainWindow=iter.next();
		String childWindow=iter.next();
		
		System.out.println("main:"+mainWindow);
		System.out.println("child1:"+childWindow);
		
		driver.switchTo().window(mainWindow);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(mainWindow);
		
		driver.findElement(By.xpath("//a[contains(text(),'Open New Seperate Windows')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.switchTo().window(mainWindow);
		
		driver.findElement(By.xpath("//a[contains(text(),'Open Seperate Multiple Windows')]")).click();
		driver.findElement(By.xpath("//button[@onclick='multiwindow()']")).click();
		driver.switchTo().window(mainWindow);
		driver.get("https://www.google.com/");
		driver.quit();
	}
}
