package webElementsmethods1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CtestboxXY extends BaseAsgn
{

	public static void main(String[] args) throws InterruptedException
	{
		BaseAsgn.openweb("chrome");
		Thread.sleep(1000);
		WebElement un1 = driver.findElement(By.id("email"));
		int xun1 = un1.getLocation().getX();
		System.out.println(xun1);
		int yun1 = un1.getLocation().getY();
		System.out.println(yun1);
		
		WebElement pwd1 = driver.findElement(By.id("password"));
		int xpwd1 = pwd1.getLocation().getX();
		System.out.println(xpwd1);
		int ypwd1 = pwd1.getLocation().getY();
		System.out.println(ypwd1);
		
		if (xun1==xpwd1)
		{
			System.out.println("Allignment is proper");
		}
		else
		{
			System.out.println("Allignment is not proper");
		}
		
		int a;
		a=ypwd1-yun1;
		System.out.println("Gap between email and password textbox is "+a);

	}

}
