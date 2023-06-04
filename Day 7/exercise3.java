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

public class exercise3 {
	WebDriver driver;
  @BeforeMethod
  public void beforeMethod() 
  {
	  
	 WebDriverManager.edgedriver().setup();
	 driver=new EdgeDriver();
	 String URL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	 driver.navigate().to(URL);
	 driver.manage().window().maximize();
  }
  @Test
  public void login() throws InterruptedException
  {
	  Thread.sleep(3000);
	  WebElement enterName=driver.findElement(By.name("username"));
	  enterName.sendKeys("Admin");
	  WebElement enterPass=driver.findElement(By.name("password"));
	  enterPass.sendKeys("admin123");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  String actualURL=driver.getCurrentUrl();
	  Assert.assertEquals(actualURL, "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	  
  }
  @AfterMethod
  public void afterMethod()
  {
	  driver.close();
  }
 
}
