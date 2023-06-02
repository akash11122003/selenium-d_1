package com.example.ice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase3
{
	public static void main(String [] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
//		driver.get("https://demo.opencart.com/");
//		can also be given as navigate
		String URL="https://demo.opencart.com/";
		driver.navigate().to(URL);
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollby(0,1000)", "");
		WebElement ele=driver.findElement(By.xpath ("//*[@id=\"content\"]/h3"));
		System.out.println(ele.isDisplayed());
		driver.quit();
		
	}
}