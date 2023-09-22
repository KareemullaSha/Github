package WebDriverExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {
		public static void main (String args[]) throws Exception{
			WebDriver driver= new ChromeDriver();
			driver.navigate().to("http://183.82.103.245/nareshit/login.php");
			System.out.println("Application open");
			driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
			driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
			driver.findElement(By.name("Submit")).click();
			System.out.println("login complted");
			Thread.sleep(3000);
			//enter into frame
			driver.switchTo().frame("rightMenu");
			Select st=new Select(driver.findElement(By.name("loc_code")));
			List<WebElement> dropdown = st.getOptions();
			for(WebElement drop:dropdown ){
			System.out.println(drop.getText());
			Thread.sleep(3000);
			}
			//exit from
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
			System.out.println("logout complted");
			Thread.sleep(3000);
			driver.close();
		
  }
}

