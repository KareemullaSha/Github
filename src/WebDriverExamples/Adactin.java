package WebDriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
public class Adactin {
public static void main(String args[]) throws Exception{
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://adactinhotelapp.com/");
	Thread.sleep(4000);
	System.out.println("Application Opened");
	driver.findElement(By.name("username")).sendKeys("Kareemullasha");
	driver.findElement(By.name("password")).sendKeys("k");
	driver.findElement(By.name("login")).click();
	System.out.println("Login Completed");
	//Search Hotel
	Select st = new Select(driver.findElement(By.name("location")));
	st.selectByVisibleText("New York");
	Thread.sleep(3000);
	Select s = new Select(driver.findElement(By.name("hotels")));
	s.selectByVisibleText("Hotel Sunshine");
	Thread.sleep(3000);
	Select sa = new Select(driver.findElement(By.name("room_type")));
	sa.selectByVisibleText("Deluxe");
	Thread.sleep(3000);
	Select sb = new Select(driver.findElement(By.name("adult_room")));
	sb.selectByValue("2");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	System.out.println("Search Hotel done");
	//Select Hotel
	driver.findElement(By.name("radiobutton_0")).click();
	driver.findElement(By.name("continue")).click();
	Thread.sleep(3000);
	System.out.println("Select Hotel done");
	//Book Hotel
	driver.findElement(By.name("first_name")).sendKeys("Subba");
	Thread.sleep(3000);
	driver.findElement(By.name("last_name")).sendKeys("Rao");
	Thread.sleep(3000);
	driver.findElement(By.name("address")).sendKeys("5-95,HMT Hills,JNTU Kukatpally,Telangana");
	Thread.sleep(3000);
	driver.findElement(By.name("cc_num")).sendKeys("7894562391232575");
	Thread.sleep(3000);
	Select sc = new Select(driver.findElement(By.name("cc_type")));
	sc.selectByValue("VISA");
	Thread.sleep(3000);
	Select sd = new Select(driver.findElement(By.name("cc_exp_month")));
	sd.selectByValue("3");
	Select se = new Select(driver.findElement(By.name("cc_exp_year")));
	se.selectByValue("2025");
	Thread.sleep(3000);
	driver.findElement(By.name("cc_cvv")).sendKeys("1301");
	Thread.sleep(3000);
	driver.findElement(By.name("book_now")).click();
	Thread.sleep(3000);
	System.out.println("Booking Confirmation Completed");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@value='My Itinerary']")).click();
	System.out.println("Booked Itinerary Opened");
	Thread.sleep(4000);
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout Completed");
	Thread.sleep(4000);
	driver.close();
}
}
