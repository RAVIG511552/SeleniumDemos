package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstFirefoxDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Jarfiles\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demowebshop.tricentis.com/login");
	}

}
