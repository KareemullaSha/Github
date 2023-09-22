package WebDriverExamples;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class JS_Executor {
public static void main(String args[]) throws Exception{
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
    driver.navigate().to("http://183.82.103.245/nareshit/login.php");
    System.out.println("Application Opened");
    driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	// Using Java Script Executor to click on Login Button
	WebElement loginbutton = driver.findElement(By.name("Submit"));
	JavascriptExecutor executor = (JavascriptExecutor) driver;
	executor.executeScript("arguments[0].click();",loginbutton);
	Thread.sleep(4000);
	System.out.println("Login completed");
    // Using Java Script Executor to click on Logout Button
	WebElement logoutbutton = driver.findElement(By.linkText("Logout"));
	JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	executor1.executeScript("arguments[0].click();", logoutbutton);
	System.out.println("Logout completed");
	Thread.sleep(3000);
	driver.close();
}
}
