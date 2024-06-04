package org.FramesClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;


public class Frames1 {

public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/");
		driver.manage().window().maximize();
	/*	
		 //Single frame
		WebElement scrdown = driver.findElement(By.xpath("//a[normalize-space()='Home']"));
		
		Thread.sleep(2000);
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView()", scrdown);
		
		
//		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
//		text.sendKeys("WELCOME");
		
		WebElement singleframe = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		
		driver.switchTo().frame(singleframe);
		
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("WELCOME TO FRAMES");
		
//		
//		WebDriver frame1 = driver.switchTo().frame("singleframe");
//
//		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
//		
//		textbox.sendKeys("Vishnu");
//		
		
		//Multiple Frames
		
				
		WebElement scrdown = driver.findElement(By.xpath("//a[normalize-space()='Home']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView()", scrdown);
		
		WebElement newelement = driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']"));
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		
		
		
		
		js1.executeScript("arguments[0].click()", newelement);
		
		
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		
		driver.switchTo().frame(outerframe);
		
		WebElement innerframe = driver.findElement(By.cssSelector("iframe[src='SingleFrame.html']"));
		
		driver.switchTo().frame(innerframe);
		
		
		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		textbox.sendKeys("WELCOME");
		
		driver.close();
		
		*/
		
		
		
		
		
	
	
	}

	
	
}
