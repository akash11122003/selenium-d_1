package com.example.ice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase2 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	
    		WebDriverManager.edgedriver().setup();
    		WebDriver driver=new EdgeDriver();
    		String url="https://demo.opencart.com/";
    		driver.navigate().to(url);
    		driver.manage().window().maximize();
    		WebElement search=driver.findElement(By.name("search"));
    		search.sendKeys("mobiles");
    		//to scroll down
    		JavascriptExecutor js=(JavascriptExecutor) driver;
    		js.executeScript("window.scrollBy(0,3800)","");
    		Thread.sleep(3000);
    		//returns
    		WebElement returns=driver.findElement(By.linkText("Returns"));
    			returns.click();
    			
    		js.executeScript("window.scrollBy(0,3800)","");
    		Thread.sleep(3000);
    		//returns
    		driver.findElement(By.linkText("Gift Certificates")).click();
    		driver.navigate().back();
    		driver.quit();
    }
}
