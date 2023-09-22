package WebDriverExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_002 {
public static void main (String args[]) throws Exception{
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	System.out.println("Application Opened");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(4000);
	System.out.println("Login Completed");
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath("//*[@id='loc_code\']")).click();
	Thread.sleep(4000);
	System.out.println("Dropdown list:");
	System.out.println("----------------------");
	Select st = new Select(driver.findElement(By.name("loc_code")));
	List<WebElement> dropdown = st.getOptions();
	int i=0;
	for (WebElement a : dropdown) {
		System.out.println(i + " " +a.getText());
		System.out.println("----------------------");
		i++;
	}
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout Completed");
	driver.close();
}
}
