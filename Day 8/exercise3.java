package com.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exercise3 {
public static void main(String [] args)
{
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.manage().window().maximize();
	
	WebElement custid=driver.findElement(By.name("cusid"));
//	custid.click();
	custid.sendKeys("401");
	driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	
	Alert a=driver.switchTo().alert();
	a.dismiss();
	custid.clear();
	
	custid.sendKeys("402");
	driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	a.accept();
	
	Alert b=driver.switchTo().alert();
	String text=b.getText();
	b.accept();
	System.out.println(text);
	
}
}
