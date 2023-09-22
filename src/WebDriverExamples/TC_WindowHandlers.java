package WebDriverExamples;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

import org.openqa.selenium.By;

public class TC_WindowHandlers {
public static void main(String args[]) throws Exception{
	WebDriver driver = new FirefoxDriver();
	//1st window
	driver.get("file:///D:/multiplewindows.html");
	Thread.sleep(3000);
	//2nd window
	driver.findElement(By.id("btn2")).click();
	Thread.sleep(3000);
	//3rd window
	driver.findElement(By.id("btn3")).click();
	Thread.sleep(3000);
	ArrayList<String> windowinfo = new ArrayList<>(driver.getWindowHandles());
	driver.switchTo().window(windowinfo.get(0));
	Thread.sleep(3000);
	driver.quit();
}
}
