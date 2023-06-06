package com.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task4 {
public static void main(String [] args) throws InterruptedException
{
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://j2store.net/free/");
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)","");
	driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
	Thread.sleep(5000);
	driver.navigate().back();
	driver.navigate().refresh();
	driver.navigate().forward();
	driver.close();
}
}
