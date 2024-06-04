package org.FramesClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesNewClass {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		WebElement scrolldown = driver.findElement(By.xpath("//a[normalize-space()='Home']"));
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", scrolldown);
		
		
		
//		WebElement singleframe = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
//		
//		driver.switchTo().frame(singleframe);
//		
//		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
//		textbox.sendKeys("Entered into Frame");
		
		 driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
		 
		 WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		
		driver.switchTo().frame(outerframe);
		
		WebElement innerframe = driver.findElement(By.cssSelector("iframe[src='SingleFrame.html']"));
		
		driver.switchTo().frame(innerframe);
		
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("Multiple frames");
		
		
		Thread.sleep(3000);
		
//		WebElement scrollup = driver.findElement(By.xpath("//h1[normalize-space()='Automation Demo Site']"));
//		JavascriptExecutor js1 = (JavascriptExecutor)driver;
//		js1.executeScript("arguments[0].scrollIntoView()", scrollup);	
//		
//		
//		Thread.sleep(3000);
		

	}

}
