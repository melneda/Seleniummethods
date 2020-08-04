package SeleniumMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_22_IsMultiple {

	public static  WebDriver driver;
	public static void main(String[] args) {
// Bunu kullandigimizda true yazarsak browser acilmadan kodu test ediyor.False yazarsak hic birsey degismiyor
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions= new ChromeOptions();
		chromeOptions.setHeadless(false);
		driver=new ChromeDriver(chromeOptions);
		
		driver.get("https://www.facebook.com");
		
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));

	 Select select= new Select(month);
	 //dropdown is multiple or not
	 System.out.println(select.isMultiple());
	 //To verify dropdown is selected or not
	 
	 //Burda  web pagein default olarak  sectigini yazdiriyorusun.
	 WebElement option =select.getFirstSelectedOption();
//	 System.out.println(option.getText()); not prof
	 String  selectext =option.getText();
	 System.out.println(selectext);
	 
		
		
	}

}
