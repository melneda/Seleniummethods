package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.bcel.internal.generic.I2D;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_08_IDConcept {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();// also we can use fullscreen() method, or sometimes we use // chromeOptions-- maximize method
//	driver.manage().deleteAllCookies();
	driver.get("https://app.hubspot.com/login");
	Thread.sleep(5000);
	
	//ID
	//ID is a locator in DOM (HTML) id is unique
	
	//First usage
	WebElement userElement=driver.findElement(By.id("username"));
	userElement.sendKeys("berna@gmail.com");

	WebElement userPass=driver.findElement(By.id("password"));
	userPass.sendKeys("test123456");
	
	WebElement loginBtn=driver.findElement(By.id("loginBtn"));
	loginBtn.click();
	
	// Second usage
	
	driver.findElement(By.id("username")).sendKeys("Berna@hotmail.com");
	
	//Third usage// prof usage
	
	By username=By.id("username");
	//WebElement userElement1=driver.findElement(username);
	//userElement.sendKeys("bob@gmail.com");
	
	// fourth usage;
	ElementUtil.getElement(driver, username).sendKeys("bob@gmail.com");
//	ElementUtil.getElement(driver, password).sendKeys("test1234");
	
	
}
}
