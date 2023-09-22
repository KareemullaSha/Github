package WebDriverExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class TC_WebTable {
public static void main(String args[]) throws Exception{
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("file:///D:/WebTable.html");
	Thread.sleep(3000);
	//Count
	int row = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr")).size();
	int column = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr[1]/td")).size();
	int row_column = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size();
	System.out.println("Row Count " + row);
	System.out.println("Col count " + column);
	System.out.println("Row_Col " + row_column);
	//Data - Cell
	String celldata = driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr[2]/td[2]")).getText();
	System.out.println(celldata);
	//Data - Table
	for(int i=1; i<=row; i++) {
	String data=driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText();
	System.out.println(data);
	Thread.sleep(3000);
	}
	driver.close();
}
}
