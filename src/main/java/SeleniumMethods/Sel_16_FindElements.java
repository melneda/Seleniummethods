package SeleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_16_FindElements {
     
	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    //  driver.get("https://www.amazon.com");
	
	
      //findelements== tagName
	
	List<WebElement> linkList = driver.findElements(By.tagName("a"));// tag name provides links
	// there ara many empty links on amazon page
	
	//Size
	System.out.println("Total links are: "+ linkList.size()); //115
	
	
	// prints all available links
	for(int i=0; i<linkList.size(); i++) {
		String text=linkList.get(i).getText();
	//	System.out.println(text);// This is print all empty and non empty links
		
//		if(!text.isEmpty()){// this is helps print non empty links so We ignore empty links.
//			System.out.println(text);
//		}
		
		if(text.equals("Forgot Password?")){
			linkList.get(i).click();
			break;
		}
		
	}

}
}
