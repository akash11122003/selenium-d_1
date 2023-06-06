package com.day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task3 {
	public static void main(String [] args) throws InterruptedException

	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
		JavascriptExecutor ps=(JavascriptExecutor) driver;
		ps.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);
		List<WebElement> elementName = driver.findElements(By.xpath("//h2[@class='product-title']"));
		System.out.println(elementName.size());
		for (WebElement element : elementName) {
		    System.out.println(element.getText());
		}
	}
}