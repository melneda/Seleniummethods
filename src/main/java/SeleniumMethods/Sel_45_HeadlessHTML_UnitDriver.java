package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_45_HeadlessHTML_UnitDriver {
public static void main(String[] args) {
WebDriverManager.firefoxdriver().setup();
WebDriver driver= new HtmlUnitDriver();
driver.get("https://siliconelabs.com");
System.out.println(driver.getCurrentUrl());

}

}
