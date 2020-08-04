package SeleniumMethods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_38_Windows_Handling {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://popuptest.com/goodpopups.html" );
	driver.findElement(By.linkText("Good PopUp #3")).click();
	Set<String>handles=driver.getWindowHandles();//windowlari toplu handle etmek icin kullaniyoruz bu methodu
	Iterator<String>it=handles.iterator();
	String parentWindowId=it.next();
	
	// window id is always unique
	System.out.println("Parent Window Id"+parentWindowId);
	
	String childWindowID=it.next();
	System.out.println("child window ID"+childWindowID);
	//switch to window
	
	driver.switchTo().window(childWindowID);// bu onemli switch video
	System.out.println("child window titleis"+driver.getTitle());
	//driver.close();
	driver.switchTo().window(parentWindowId);// bu onemli switch video
	System.out.println("parent window title"+driver.getTitle());
	driver.quit();
	

}
}