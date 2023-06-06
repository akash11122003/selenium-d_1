package com.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class task5 {
	WebDriver driver=new EdgeDriver();
	@BeforeMethod
	public void beforeity()
	{
		WebDriverManager.edgedriver().setup();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
  @Test
  public void test01() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.findElement(By.name("username")).sendKeys("suvitha");
	  driver.findElement(By.name("password")).sendKeys("12345");
	  String myURL=driver.getCurrentUrl();
	  String actualURL="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
//	  if(myURL.equals(actualURL))
//		  System.out.println("True");
//	  else
//		  System.out.println("false");
	  Assert.assertEquals(myURL, actualURL);
	  
  }
  
  @AfterMethod
  public void afterity()
  {
	  driver.close();
  }
}
