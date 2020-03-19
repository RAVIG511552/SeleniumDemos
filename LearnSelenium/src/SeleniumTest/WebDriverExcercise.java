package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverExcercise {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jarfiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		
		String title=driver.getTitle();
		int titlelength=title.length();
		System.out.println("Title:"+title);
		System.out.println("Title Length:"+titlelength);
		
		String acturl="http://demowebshop.tricentis.com/";
		String expurl=driver.getCurrentUrl();
		if(acturl.equalsIgnoreCase(expurl))
		{
			System.out.println("correct url");
		}
		else
		{
			System.out.println("incorrect url");
		}
		
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		int pgl=pagesource.length();
		System.out.println("Page Source length:"+pgl);
		driver.close();
	}

}
