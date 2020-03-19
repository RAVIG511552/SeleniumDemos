package SeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jarfiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("div"));
		System.out.println("Number of links: "+links.size());
		System.out.println("The link names are: ");
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
		driver.close();
	}

}
