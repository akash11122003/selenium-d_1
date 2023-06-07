package com.day5;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task5 {
	public static void main(String [] args)
	{
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("");
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)","");
	WebElement clkSuperAdmin = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[1]/a[1]"));
	clkSuperAdmin.click();
	WebElement clkSignin = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/form/button"));
	clkSignin.click();
	String textName = driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[4]/a/span")).getText();
	System.out.print(textName);
	String tagName = driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[4]/a/span")).getTagName();
	System.out.print(tagName);
	
}
}
