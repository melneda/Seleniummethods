package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_46_DragandDrop {
public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://jqueryui.com/resources/demos/droppable/default.html");


WebElement sourceElement=driver.findElement(By.id("draggable"));
WebElement targetElement=driver.findElement(By.id("droppable"));

Actions actions=new Actions(driver);
//actions.dragAndDrop(sourceElement, targetElement).build().perform();
//clickandhold method another usage
actions.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();

// in action class we have methods drag anddrop method and clickandhold method

	}

}
