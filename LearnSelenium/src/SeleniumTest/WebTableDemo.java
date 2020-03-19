package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Jarfiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///E:/Jarfiles/toolstable.html");
		driver.manage().window().maximize();
		String toolname=driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]")).getText();
		System.out.println("Tool name is: "+toolname);
		driver.close();
	}

}
