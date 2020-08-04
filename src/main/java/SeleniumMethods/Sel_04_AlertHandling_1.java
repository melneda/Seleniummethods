package SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_04_AlertHandling_1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(" https://mail.rediff.com/cgi-bin/login.cgi");
		
		// Locators
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(4000);
	   
		//to handle alert we will use alert interface
		
		Alert alert=driver.switchTo().alert();// I created alert object
		String text= alert.getText();
		System.out.println(text);
		
		//Verification
		if(text.equals("Please enter a valid user name")) {
			System.out.println("correct text: "+text);
		}else {
			System.out.println("incorrect text"+text);
		}
			
		
		//alert.accept(); // Always prefer accept button
		alert.dismiss();
		
		driver.quit();
		//driver.close();
		System.out.println("Test Completed");
		
		
	}

}
