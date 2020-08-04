package SeleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_21_DropDownWithout_Select {
	
public static void main(String[] args) {
	
	 System.setProperty("webdriver.chrome.driver", "/Users/mymac/Documents/Drivers/chromedriver");
	  WebDriver driver =new ChromeDriver();
	   
	  //we need to use list
	  // thread sleep use slow down test case
	//  driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		List<WebElement> dayList = driver.findElements(By.xpath("//select[@id='day']/option"));
		System.out.println(dayList.size());// print size od days..
		
		for(int i= 0; i<dayList.size(); i++) {
			String text = dayList.get(i).getText();// print days here
		//	System.out.println(text);
			if(text.equals("9")) {
				dayList.get(i).click();
				break;
			}
		}

	}


	  
}	


