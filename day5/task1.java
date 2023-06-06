package com.day5;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class task1 {
	
		public static void main(String args[]) throws InterruptedException
		{
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://j2store.net/free/");
	    driver.manage().window().maximize();
	    String actualtitle=driver.getTitle();
	    String Title="Home";
	    if(actualtitle.equals(Title))
	    {
	    	System.out.println("Ja, true");
	    }
	    else
	    System.out.println("Nein, false");
	    
	    Thread.sleep(0);
	    JavascriptExecutor js =(JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,500)", "");
	    driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
	    String thetitle=driver.getTitle();
	    String secondtitle="Shop";
	    if(thetitle.equals(secondtitle))
	    {
	    	System.out.println("Yeah!");
	    }
	    else
	    System.out.println("Nooooo!");
	    
	    
	    
	}

}
