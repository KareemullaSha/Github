package WebDriverExamples;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
public class TC_Alerts {
public static void main(String args[]) throws Exception{
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(4000);
	Alert b = driver.switchTo().alert();
	System.out.println(b.getText());
	b.accept();
	Thread.sleep(4000);
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(4000);
	System.out.println("Login Completed");
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout Completed");
	driver.close();
}
}
