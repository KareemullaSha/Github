package WebDriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class TC_FileUpload {
public static void main(String args[]) throws Exception{
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	System.out.println("Application Opened");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(4000);
	System.out.println("Login completed");
	//Enter into frame
	driver.switchTo().frame("rightMenu");
	//Click on Add button
	driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("Kareemulla");
	driver.findElement(By.name("txtEmpLastName")).sendKeys("Sha");
	//To upload a file
	WebElement fileInput = driver.findElement(By.xpath("//input[@type='file'][@name='photofile']"));                      
	fileInput.sendKeys("D:\\pxfuel.jpg");
	Thread.sleep(3000);
	System.out.println("File Uploaded Successfully");
	driver.findElement(By.id("btnEdit")).click();
	Thread.sleep(3000);System.out.println("New Employee added");
	//Exit from
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(2000);
	System.out.println("Logout completed");
	driver.close();
}
}
