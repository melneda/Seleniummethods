package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel_02_WebDriverBasicWithFireFox {

	public static void main(String[] args) {
        // Set porperty
		System.setProperty("webdriver.gecko.driver", "/Users/mymac/Documents/Drivers/geckodriver");
		
		//setup browser  
		//webdriver interface and has many methods inside
		
		WebDriver driver =new FirefoxDriver();
		
		//launch browser// get used to navigate url
		driver.get("https://siliconelabs.com/");
		
		// get title
		
	String title=	driver.getTitle();
	System.out.println(title);
	
	// Verify title
	if(title.equals("Homepage - SiliconeLabs")) {
		
	System.out.println("correct title");
	}
	else {
		System.out.println("incorrect title");
	}
	//Verify URL
	String URL=driver.getCurrentUrl();
	System.out.println("Current url:"+URL );
	
	
	// to reach page source it has many code, it is not very usable
	//System.out.println(driver.getPageSource());
	
	driver.close();// close current browser
	//driver.quit();// after before method
	
	
	
	}

}
