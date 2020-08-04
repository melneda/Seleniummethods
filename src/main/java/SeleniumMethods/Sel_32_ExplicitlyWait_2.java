package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

   public class Sel_32_ExplicitlyWait_2 {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://app.hubspot.com/login");	
	//Define locators first
	
	By email=By.id("username");
	By password=By.id("password");
	By loginBtn=By.id("loginBtn");
	
	getElement(driver, email).sendKeys("bmw@sample.com");
	getElement(driver, password).sendKeys("dffsfsfds");
	getElement(driver, loginBtn).click();
	
	
	
	}

	
	
	
	
	
	//Basic usage I have two concept in the method
	/**
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(WebDriver driver,By locator) {
	WebDriverWait wait=new WebDriverWait(driver, 15);
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	
	WebElement element=driver.findElement(locator);
	return element;
	
		
		
	}
	
   
   
   }
   