package com.example.ice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase4 {
	public static void main(String [] args) throws InterruptedException
{
//	in140194
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		driver.manage().window().maximize();
		driver.findElement(By.name("to_name")).sendKeys("Akash");
		driver.findElement(By.name("to_email")).sendKeys("akashsasikumar11@gmail.com");
		driver.findElement(By.name("from_name")).sendKeys("Aakash");
		driver.findElement(By.name("from_email")).sendKeys("aakash11@gmail.com");
		driver.findElement(By.id("input-theme-8")).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)","");
		driver.findElement(By.id("input-amount")).sendKeys("1234567890");
		Thread.sleep(3000);
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();
}
}
