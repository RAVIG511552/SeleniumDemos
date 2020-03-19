package SeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllChechBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Jarfiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		List<WebElement> multcbs=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0;i<multcbs.size();i++)
		{
			multcbs.get(i).click();
		}
		driver.findElement(By.xpath("//div[@class='container center']//div[contains(@class,'row')]")).click();

	}

}
