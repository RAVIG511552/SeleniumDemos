package SeleniumTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Jarfiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert alert1=driver.switchTo().alert();
		String alertmsg=alert1.getText();
		System.out.println(alertmsg);
		Thread.sleep(3000);
		alert1.accept();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert alert2=driver.switchTo().alert();
		String alertmsg2=alert2.getText();
		System.out.println(alertmsg2);
		Thread.sleep(3000);
		alert2.dismiss();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert alert3=driver.switchTo().alert();
		alert3.sendKeys("Ravi");
		Thread.sleep(3000);
		alert3.accept();
		Thread.sleep(3000);
		driver.close();
	}

}
