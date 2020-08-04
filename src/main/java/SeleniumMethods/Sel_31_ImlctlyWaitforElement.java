package SeleniumMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_31_ImlctlyWaitforElement {
public static void main(String[] args) throws InterruptedException {
	
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://app.hubspot.com/login");	
driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
//imp wait  will be applied all the web elements by default
//global wait not for specific. 
driver.get("https://app.hubspot.com/login");
Thread.sleep(5000);

driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
//driver.findElement(By.id("username")).sendKeys("ilhan@abc.com");// nullify imp wait this doesnt work here. it is not for locator , it is global.



}
}
