package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.nashorn.internal.scripts.JS;

public class Sel_40_JavaScriptExamples {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		//driver.get("https://app.hubspot.com/login");
		driver.get("https://darksky.net/");
		Thread.sleep(5000);
		//System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		// if out test case ajax or dynamic we use java script
		//get title with JS
	//	String title=JavaScriptUtil.getTitleByJS(driver);
		//System.out.println(title);
		
//		//click with JS
//		WebElement signupLink=driver.findElement(By.linkText("Sign up"));
//		JavaScriptUtil.clickElementByJS(signupLink, driver);
//		Thread.sleep(2000);
//		
//         // refresh with JS
//		JavaScriptUtil.refreshBrowserByJS(driver);
//		//  generate alert
//		JavaScriptUtil.generateAlert(driver, "This page is sign up page");
//		
		
		//send keys method
//		WebElement username=driver.findElement(By.id("username"));
//		JavaScriptUtil.sendKeysUsingJSWithID(driver, "username", "abc@sample.com");
//		JavaScriptUtil.drawBorder(username, driver);

//		//flash method with JS
//		WebElement username=driver.findElement(By.id("username"));
//		WebElement password=driver.findElement(By.id("password"));
//		WebElement loginButton=driver.findElement(By.id("loginBtn"));
//		
//		JavaScriptUtil.flash(username, driver);
//		username.sendKeys("abc@sample.com");
//		JavaScriptUtil.flash(password, driver);
//		password.sendKeys("abc@sample.com");
//        JavaScriptUtil.flash(loginButton, driver);
//        loginButton.click();

    // Get page inner Text
  //System.out.println(JavaScriptUtil.getPageInnerText(driver));
	
	// Get browser info
	//System.out.println(JavaScriptUtil.getBrowserInfo(driver));
	
	// Scrolldown method
	//JavaScriptUtil.scrollPageDown(driver);
	
	WebElement privacy=driver.findElement(By.xpath("//a[contains(text(),'Privacy')]"));
	JavaScriptUtil.scrollIntoView(privacy, driver);
	JavaScriptUtil.clickElementByJS(privacy, driver);
	
	}

}
