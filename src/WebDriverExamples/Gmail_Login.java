package WebDriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Gmail_Login {
public static void main(String args[]) throws Exception{
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("https://mail.google.com/");
	Thread.sleep(4000);
	System.out.println("Application Opened");
	driver.findElement(By.name("identifier")).sendKeys("kareemullashashaik@gmail.com");
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(4000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(4000);
	
	



}
}
