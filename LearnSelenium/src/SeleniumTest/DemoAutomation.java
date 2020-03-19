package SeleniumTest;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Jarfiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Ravi");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("g");
		
		driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("singasandra,banglore");
		
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']")).sendKeys("naniravi466@gmail.com");
		
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern']")).sendKeys("8978442742");
		
		driver.findElement(By.xpath("//*[@type='radio' and @value='Male']")).click();
		
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		driver.findElement(By.id("checkbox2")).click();
		
//		List<WebElement> multcbs=driver.findElements(By.xpath("//input[@type='checkbox']"));
//		for(int i=0;i<multcbs.size();i++)
//		{
//			multcbs.get(i).click();
//		}
//		driver.findElement(By.xpath("//div[@class='container center']//div[contains(@class,'row')]")).click();
//		
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		driver.findElement(By.linkText("Arabic")).click();
		driver.findElement(By.xpath("//section[@id='section']//li[8]")).click();
		driver.findElement(By.xpath("//li[16]")).click();
		
		
		driver.findElement(By.xpath("//div[@class='container center']//div[contains(@class,'row')]")).click();
		
		driver.findElement(By.xpath("//select[@id='Skills']")).click();
		driver.findElement(By.xpath("//select[@id='Skills']//option[10]")).click();
		
		driver.findElement(By.xpath("//div[@class='container center']//div[contains(@class,'row')]")).click();
		
		driver.findElement(By.id("countries")).click();
		driver.findElement(By.xpath("//option[106]")).click();
		
		driver.findElement(By.xpath("//div[@class='container center']//div[contains(@class,'row')]")).click();
		
		driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
		driver.findElement(By.xpath("//li[contains(text(),'India')]")).click();
		
		WebElement year=driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select sel1=new Select(year);
		sel1.selectByValue("1995");
		List<WebElement> yearcount=sel1.getOptions();
		System.out.println(yearcount.size());
		for(int i=0;i<yearcount.size();i++)
		{
			System.out.println(yearcount.get(i).getText());
		}
		
		//driver.findElement(By.id("yearbox")).click();
		//driver.findElement(By.xpath("//option[contains(text(),'1997')]")).click();
		
		WebElement month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select sel2=new Select(month);
		sel2.selectByIndex(4);
		List<WebElement> monthcount=sel2.getOptions();
		System.out.println(monthcount.size());
		for(int i=0;i<monthcount.size();i++)
		{
			System.out.println(monthcount.get(i).getText());
		}
		
		//driver.findElement(By.xpath("//select[@placeholder='Month']")).click();
		//driver.findElement(By.xpath("//option[contains(text(),'July')]")).click();
		
		WebElement day=driver.findElement(By.xpath("//select[@id='daybox']"));
		Select sel3=new Select(day);
		sel3.selectByVisibleText("27");
		List<WebElement> daycount=sel3.getOptions();
		System.out.println(daycount.size());
		for(int i=0;i<daycount.size();i++)
		{
			System.out.println(daycount.get(i).getText());
		}
		
		//driver.findElement(By.xpath("//select[@id='daybox']")).click();
		//driver.findElement(By.xpath("//select[@id='daybox']//option[contains(text(),'27')]")).click();
		
		driver.findElement(By.id("firstpassword")).sendKeys("Ravi123");
		driver.findElement(By.id("secondpassword")).sendKeys("Ravi123");
		
		driver.findElement(By.id("submitbtn")).click();
	}

}
