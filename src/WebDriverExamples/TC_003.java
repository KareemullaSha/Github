package WebDriverExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_003 {
public static void main(String args[]) throws Exception{
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("https://www.Google.com/");
	System.out.println("Application Opened");
	 List<WebElement> AllLinks = driver.findElements(By.tagName("a"));
	 for(WebElement link : AllLinks){
		 System.out.println("Links:");
		 System.out.println(link.getText() + " - " + link.getAttribute("href"));
		 }
	 driver.close();
}
}
