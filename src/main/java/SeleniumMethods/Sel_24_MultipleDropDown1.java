package SeleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel_24_MultipleDropDown1 {
public static void main(String[] args) {
	

System.setProperty("webdriver.chrome.driver", "/Users/mymac/Documents/Drivers/chromedriver");
WebDriver driver =new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

driver.findElement(By.id("justAnInputBox")).click();
//To click all options, find common class for all options from dropdown menu
List<WebElement>dropList=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
System.out.println(dropList.size());

for(int i=0; i<dropList.size(); i++) {
	String text=dropList.get(i).getText();
	System.out.println(text);
	
//	// Ignore empty value;
//	if(!text.isEmpty()) {
//		dropList.get(i).click();// we click all value
//		
//	if (text.equals("choice5")) {
//		dropList.get(i).click();
//		break;
//		
//		
//	}
	
	
		WebElement choice5 =driver.findElement(By.xpath("//span[(text()contains,'choice 5']"));
       Select select=new Select(choice5);
		 
		
	}
	
	
	
}
		

}

