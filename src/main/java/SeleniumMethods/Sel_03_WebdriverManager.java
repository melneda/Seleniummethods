package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_03_WebdriverManager {
	
	public static void main(String[] args) {

		
	//	WebDriverManager.firefoxdriver().setup();	
		//WebDriver driver=new FirefoxDriver();

WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
//WebDriver driver=new ChromeDriver().browserPath("")
driver.get(" https://siliconelabs.com/");

}
}