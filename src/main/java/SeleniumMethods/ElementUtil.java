package SeleniumMethods;

import java.sql.Driver;

import org.omg.PortableServer.ServantActivator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {
	// we create common methods for test cases
	// we can use these methods again and again

	public static String getAlertText(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		return text;

	}

	//This method is used to launch browser
	
	public static WebDriver launchBrowser(WebDriver driver, String browserName) {
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/Mymac/Documents/Drivers/chromedriver");
			driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/Mymac/Documents/Drivers/geckodriver");
			driver = new FirefoxDriver();

	 	} else {
			System.out.println("Invalid Browser" + browserName);
		}

		return driver;

	}
	
	
	// This method is used to navigate URL
	public static void launchURL(WebDriver driver,String url){
		driver.get(url);
	}
	
	
	//This method is used to get title
	public static String getPageTitle(WebDriver driver){
		 return driver.getTitle();
	}
	
//	//This is used get element
//	
//	public static WebElement getElement( WebDriver driver,By locator){
//		WebElement element=driver.findElement(locator);
//		return element;
//	}
	//This method is used to click on the element
	public static void clickOn(WebDriver driver,By locator){
		driver.findElement(locator).click();
		
	}
	//This is close browser
	
	public static void closeBrowser(WebDriver driver){
		driver.close();
	}
	
	//this is quit browser
	public static void quitBrowser(WebDriver driver){
		driver.quit();
	}
	
	public static WebElement getElement(WebDriver driver, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		WebElement element = driver.findElement(locator);
		return element;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
