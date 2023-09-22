package WebDriverExamples;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

public class Youtube {
public static void main(String args[]) throws Exception{
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("https://Youtube.com/");
	driver.findElement(By.name("search_query")).sendKeys("Hukum Jailer song");
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(4000);
	driver.close();

}
}
