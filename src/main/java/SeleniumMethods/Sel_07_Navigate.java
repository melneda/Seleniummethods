package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_07_Navigate {
	
		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "/Users/mymac/Documents/Drivers/chromedriver");

			WebDriver driver=new ChromeDriver();
			//Navigation is interface and navigate is abstract method.
			driver.get("http://www.amazon.com");
			
			//Navigate
			driver.navigate().to("http://www.ebay.com");
			Thread.sleep(2000);
			
			driver.navigate().back();// amazon
			Thread.sleep(2000);
			driver.navigate().forward();//ebay
			Thread.sleep(2000);
			driver.navigate().back();// amz
			driver.navigate().refresh();
			driver.quit();
	}

}
