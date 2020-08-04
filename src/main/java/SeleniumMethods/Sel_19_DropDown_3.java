package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import sun.security.action.GetBooleanAction;

public class Sel_19_DropDown_3 {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "/Users/mymac/Documents/Drivers/chromedriver");
		  WebDriver driver =new ChromeDriver();
		  driver.get("https://www.facebook.com");
		   
		   
		   By day=By.id("day");
		   By month=By.id("month");
		   By year=By.id("year");
		   
		   
		   selectDropdownByVisibleText(driver, day, "23");
		   selectDropdownByVisibleText(driver, month, "Apr");
		   selectDropdownByVisibleText(driver, year, "2017");
		   
		  		   
		  }

	
	public static void selectDropdownByVisibleText(WebDriver driver,By locator,String value) {
		
		WebElement element=getElement(driver, locator);
		Select select=new Select(element);
		select.selectByVisibleText(value);
		
		
		
	}
	
	/**
	 * Get Element
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(WebDriver driver, By locator) {
		WebElement element=driver.findElement(locator);
		return element;
		
		
	}
	
	
}
