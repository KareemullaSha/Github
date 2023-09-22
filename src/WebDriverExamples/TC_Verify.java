package WebDriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class TC_Verify {
public static void main(String args[]) throws Exception{
	//Test Steps
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(4000);
		System.out.println("Application Opened");
	//Verify Title
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
		//Actual result   compare  Expected result
			System.out.println("Title matched");    
			}
			else {
			System.out.println("Title not matched");
			System.out.println(driver.getTitle());
			}
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(4000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
		System.out.println("Login Completed");
		//Verify Title
		if(driver.getTitle().equals("OrangeHRM")) {
		System.out.println("Title matched");    
		}
		else {
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
		}
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(4000);
		System.out.println("Logout completed");
		driver.close();
}
}
