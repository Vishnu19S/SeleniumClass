package org.FramesClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsandFrames {

	public static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		/*
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		Thread.sleep(2000);
		
		WebElement scrolldown = driver.findElement(By.xpath("//a[normalize-space()='Home']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",scrolldown );
		
		Thread.sleep(2000);
		
		WebElement scrollup = driver.findElement(By.xpath("//h1[normalize-space()='Automation Demo Site']"));
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].scrollIntoView()",scrollup );
		
		Thread.sleep(2000);

		
		driver.get("https://www.opencart.com/");
		
		WebElement scrolldown = driver.findElement(By.xpath("//div[@id='support']//div[1]//p[2]//a[1]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",scrolldown );
		*/
		/*
		//Single Frame
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		WebElement scrolldown = driver.findElement(By.xpath("//a[normalize-space()='Home']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",scrolldown );
		
		Thread.sleep(2000);
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		
		driver.switchTo().frame(frame1);
		
		Thread.sleep(2000);
		
		
		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		textbox.sendKeys("Entered into the Frame");
		
		
		
		
		//Multiple Frames
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		WebElement scrolldown = driver.findElement(By.xpath("//a[normalize-space()='Home']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",scrolldown );
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
		
		
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		
		driver.switchTo().frame(outerframe);
		
		WebElement innerframe = driver.findElement(By.cssSelector("iframe[src='SingleFrame.html']"));
		
		driver.switchTo().frame(innerframe);
		
		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		
		textbox.sendKeys("Finally Entered into the Frame");
		
		*/
		
		
		
		driver.get("https://demoqa.com/frames");
		
		WebElement scrolldown = driver.findElement(By.xpath("/span[normalize-space()='Frames']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",scrolldown );
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
