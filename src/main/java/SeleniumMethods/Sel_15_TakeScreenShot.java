package SeleniumMethods;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_15_TakeScreenShot {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		// for screen shot we have to use maximize
		driver.manage().window().maximize();
		// driver.manage().deleteAllcookkies();
		driver.get("https://www.amazon.com");
		
		
		
		//we have to import java.io.File
		//This line is interview question How can I take a screen shot, we need to explain this file..Takescreenshot is interface.
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);// this part is source file
		//We need to save screenshot and store the file.we will handle this.
		FileUtils.copyFile(src, new File("/Users/mymac/Desktop/berna/berna.png"));// we can use jpeg is not good quality
		driver.close();
		
		
	}

}
