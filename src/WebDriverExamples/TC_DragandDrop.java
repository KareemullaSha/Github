package WebDriverExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static org.testng.Assert.assertEquals;

public class TC_DragandDrop {
public static void main(String args[]) throws Exception{
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("https://jqueryui.com/droppable/");
	Thread.sleep(4000);
	//Verify Title(Stop execution in case of condition fails):assert statement
	assertEquals(driver.getTitle(),"Droppable | jQuery UI");
	System.out.println("Title Matched");
	Thread.sleep(4000);
	//Entering into Frame
	driver.switchTo().frame(0);
	Actions ac = new Actions(driver);
	ac.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).build().perform();
	System.out.println("Drag & Drop done");
	Thread.sleep(4000);
	//Exit from Frame
	driver.switchTo().defaultContent();
	driver.quit();
}
}
