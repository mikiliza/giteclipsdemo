package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoflipkart1 {
	static
	{
	System.setProperty("webdriver.chrome.driver","./driver/chomedtiver.exe");
	}
public static void main (String[]args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.Flipkart.com");
	Thread.sleep(2000);
	driver.findElement(By.name("q").sendKeys("iphonexr","ENTER"));
	Thread.sleep(2000);
	
}
}
