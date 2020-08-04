package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_09_NameConcept {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://the-internet.herokuapp.com/login");
	Thread.sleep(5000);

	//First Usage
	WebElement userElement=driver.findElement(By.name("username"));
	userElement.sendKeys("bob@hotmail.com");
	
	//second
	
driver.findElement(By.name("username")).sendKeys("berna@gmail.com");

//thirdusage

By username=By.name("username");
By pass=By.name("password");
WebElement element=driver.findElement(username);
element.sendKeys("ilhan@gmail.com");

//Fourth
//ElementUtil.getElement(driver, username)
	
	}
}