package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Sel_37_AutoPop {
public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
// username="admin"
//password="admin"
// first username, second password.
//https://admin:admin@the-internet.herokuapp.com/basic_auth

driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");// first usage
String username="admin";
String password="admin";
driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");// second usage


	}

}
