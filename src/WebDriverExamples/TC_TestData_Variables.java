package WebDriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class TC_TestData_Variables {
	//TestData
    //DT      Variable         VV
static String  url     = "http://183.82.103.245/nareshit/login.php";
static String username = "nareshit";
static String password = "nareshit";
static String title1   = "OrangeHRM - New Level of HR Management";
static String title2   = "OrangeHRM";

public static void main(String args[]) throws Exception{
//Test Steps
WebDriver driver = new ChromeDriver();
driver.navigate().to(url);
System.out.println("Application opened");
//Verify Title
if(driver.getTitle().equals(title1)) {
System.out.println("Title matched");    
}
else {
System.out.println("Title not matched");
System.out.println(driver.getTitle());
}
//TestData : Variable
driver.findElement(By.name("txtUserName")).sendKeys(username);
driver.findElement(By.name("txtPassword")).sendKeys(password);

Thread.sleep(4000);
driver.findElement(By.name("Submit")).click();
Thread.sleep(4000);
System.out.println("Login completed");
//Verify Title
if(driver.getTitle().equals(title2)) {
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