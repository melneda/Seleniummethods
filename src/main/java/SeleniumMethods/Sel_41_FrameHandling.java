package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_41_FrameHandling {
	public static void main(String[] args) {
	
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("http://londonfreelance.org/courses/frames/index.html");
driver.switchTo().frame(driver.findElement(By.name("main")));// we have to use switchto method 
System.out.println(driver.getTitle());
WebElement header=driver.findElement(By.xpath("//h2[contains(text(),'Title bar ')]"));
System.out.println(header.getText());// frame concept text
System.out.println(driver.getTitle());//main page title we are in main page

driver.switchTo().defaultContent();// come back to main html, we use defaultcontent
System.out.println(driver.getTitle());


}
}