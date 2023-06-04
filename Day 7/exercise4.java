package com.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exercise4 {
	WebDriver driver;
	@BeforeMethod
	public void beforetest()
	{
	WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	  driver.manage().window().maximize();
	  String URL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
//	  driver.get(URL);
//	  or
	  driver.navigate().to(URL);
	 

	}
	
  @Test
  public void success() throws InterruptedException {
	  Thread.sleep(3000);
	  WebElement enterName=driver.findElement(By.name("username"));
	  enterName.sendKeys("Admin");
	  WebElement enterPass=driver.findElement(By.name("password"));
	  enterPass.sendKeys("admin123");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  String actualURL=driver.getCurrentUrl();
	  Assert.assertEquals(actualURL, "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
  }
  
  @Test(dependsOnMethods="success")
  public void finished() throws InterruptedException
  {
	  Thread.sleep(3000);
	  WebElement loggoutt=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i"));
	  loggoutt.click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
	  String loggedoutURL=driver.getCurrentUrl();
	  Assert.assertEquals(loggedoutURL,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }
  
  @AfterMethod
  public void aftertest() throws InterruptedException
  {
	  Thread.sleep(2000);
	  driver.close();
  }
}
