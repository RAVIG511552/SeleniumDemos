package SeleniumTest;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jDemo {

	public static void main(String[] args) 
	{
		Logger log=Logger.getLogger(Log4jDemo.class);
		System.setProperty("webdriver.chrome.driver", "E:\\Jarfiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		log.info("URL Launched");
		
		String expTitle=driver.getTitle();
		String actTitle="Google";
		
		System.out.println("Expected title: "+expTitle);
		System.out.println("Actual title: "+actTitle);
		log.warn("Check Title");
		
		if(expTitle.equals(actTitle))
		{
			System.out.println("We get into correct url");
			log.info("The URL is correct");
		}
		else
		{
			System.out.println("oops...we get into inscorrect url");
			log.error("The URL is incorrect");
		}
		driver.close();
	}

}
