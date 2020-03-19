package SeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFramesDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jarfiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		List<WebElement>iframes=driver.findElements(By.tagName("iframe"));
		System.out.println("Number of frames: "+iframes.size());
		for(int i=0;i<iframes.size();i++)
		{
			System.out.println(iframes.get(i).getAttribute("name"));
		}
		WebElement frame=driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input")).sendKeys("Selenium");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input")).sendKeys("webdriver");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),'Single Iframe')]")).click();
		driver.close();
	}

}
