package com.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task2 {
	
public static void main(String [] args) throws InterruptedException
{
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://j2store.net/free/");
	driver.manage().window().maximize();
	String MEINURL=driver.getCurrentUrl();
	String ActualURL="https://j2store.net/free/";
	if(MEINURL.equals(ActualURL))
	{
		System.out.println("Yeah, true");
	}
	else
	{
		System.out.println("Nein, false");
	}
	Thread.sleep(3000);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1000)", "");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
	String NACHSTEURL=driver.getCurrentUrl();
	String ActualURL2="https://j2store.net/free/index.php/shop?filter_catid=11";
	if(NACHSTEURL.equals(ActualURL2))
	{
		System.out.println("Yes, true");
	}
	else
	{
		System.out.println("No, false");
	}
	
}
}
