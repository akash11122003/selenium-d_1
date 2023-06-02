package com.example.ice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase1 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	
    		WebDriverManager.edgedriver().setup();
            WebDriver driver = new EdgeDriver();
            driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Fauji");
            driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Akash");
            driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("akash451232@gmail.com");
            driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("1234ak5678");
            JavascriptExecutor js=(JavascriptExecutor)driver;
            js.executeScript("window.scrollBy(0,300)","");
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id=\"form-register\"]/fieldset[3]/div/div/div[1]")).click();
            driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
           
    }
}
