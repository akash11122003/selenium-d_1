package com.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exercise2 {
public static void main(String [] args) throws InterruptedException
{
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
	WebElement a=driver.findElement(By.id("draggable"));
	WebElement b=driver.findElement(By.id("droppable"));
//	 driver.switchTo().frame("result");
	Actions ac=new Actions(driver);
	ac.clickAndHold(a).release(b).build().perform();
	Thread.sleep(3000);
	}
}
