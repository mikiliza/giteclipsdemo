package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAmazonOneplus
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");  
	}

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.Amazon.com");
		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus mobile phone",Keys.ENTER);
		driver.findElement(By.xpath("//img[contains(@srcset,'61O6VtZ0MrL._AC_UY654_FMwebp_QL65_')]")).click();
//		by using traversing technique
//		String price = driver.findElement(By.xpath("//span[@id=\"productTitle\"]/../../../../div[41]/div/a/span")).getText();
//		System.out.println("by using traversing technique "+price);
//		by using Axes
		Thread.sleep(1000);
		String cost = driver.findElement(By.xpath("//span[@id=\"productTitle\"]/ancestor::div[@id='centerCol']//descendant::span[@class='a-color-price']")).getText();
		System.out.println("by using Axes "+cost);
		Thread.sleep(1000);
		driver.close();   
	
//		WebDriver driver1=new ChromeDriver();
//		driver1.manage().window().maximize();
//		driver1.get("http://www.flipkart.com");
//		Thread.sleep(1000);
//		driver1.findElement(By.className("//input[@class='LM6RPg']")).sendKeys("oneplus mobile phone",Keys.ENTER);
//		
		
		
		
		
	}
}
