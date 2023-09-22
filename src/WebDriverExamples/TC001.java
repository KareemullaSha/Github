package WebDriverExamples;
import org.openqa.selenium.WebDriver;//To Access WebDriver classes & methods
import org.openqa.selenium.chrome.ChromeDriver;//To access Chrome Browser
import org.openqa.selenium.By;//To access object identification/Element locators
public class TC001 {
public static void main(String args[]) throws Exception{
	//Test Steps
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Thread.sleep(4000);
	System.out.println("Application Opened");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	Thread.sleep(4000);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(4000);
	System.out.println("Login Completed");
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout Completed");
	Thread.sleep(4000);
	driver.close();
}
}
