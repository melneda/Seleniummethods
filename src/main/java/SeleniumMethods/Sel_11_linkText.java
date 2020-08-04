package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_11_linkText {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();// also we can use fullscreen() method, or sometimes we use // chromeOptions-- maximize method
//	driver.manage().deleteAllCookies();
	driver.get("https://app.hubspot.com/login");
//	Thread.sleep(5000);
	
	
	
	
	
}
}