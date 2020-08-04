package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_12_XPathConcept {

	
	
	
	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
	
	//	WebElement userEl = driver.findElement(By.xpath("//input[@id='username']"));
//		userEl.sendKeys("seh23@gmail.com");
//		WebElement pword = driver.findElement(By.xpath("//input[@id='password']"));
//		pword.sendKeys("she4366");
//		WebElement loginBtn = driver.findElement(By.xpath("//button[@id='loginBtn']"));
//		loginBtn.click();
		
		 By username = By.id("username");
		 By pword = By.xpath("//input[@id='password']");
		 By loginBtn = By.xpath("//button[@id='loginBtn']");
		
		
		ElementUtil.getElement(driver, username).sendKeys("sef3@gmail.com");
		ElementUtil.getElement(driver, pword).sendKeys("543hsgsf");
		ElementUtil.getElement(driver, loginBtn).click();		

	}

}
