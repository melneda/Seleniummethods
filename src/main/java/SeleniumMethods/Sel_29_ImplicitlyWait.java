package SeleniumMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_29_ImplicitlyWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		// imlicit wait tells webdriver to wait if the element is not available immediatly
		//and webdriver waits till the elemenet s visible in specific time
		//it will throw Nosuch ElementException
		//imp wait can be used only elements==NOT non element
		//this is not dynamic.
		
		
	}

}
