package SeleniumMethods;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel_18_DropDown_2 {
	
 public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "/Users/mymac/Documents/Drivers/chromedriver");
    WebDriver driver =new ChromeDriver();
   driver.get("https://www.facebook.com");
   
   //Locators
	WebElement day=driver.findElement(By.id("day"));
	WebElement month=driver.findElement(By.id("month"));
	WebElement year=driver.findElement(By.id("year"));

 selectDropdownValuebyTetx(day, "9");
 selectDropdownValuebyTetx(month, "Sep");
 selectDropdownValuebyTetx( year,"2012");
 
 
 driver.close();
 
 }

 
 
 /**
 * 
 * @param element
 * @param value
 */
 
 
 public static void selectDropdownValuebyTetx(WebElement element, String value) {
	 Select select=new Select(element);
	 select.selectByVisibleText(value);
 }
 /**
  * @param element
  * @param index
  * 
  */

 public static void selectDropdownByindex(WebElement element, int index ) {
	 Select select=new Select(element);
	 select.selectByIndex(index);
 }
 

 
 
}
