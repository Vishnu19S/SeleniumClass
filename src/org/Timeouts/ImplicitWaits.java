package org.Timeouts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWaits {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		/*
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Implicit Wait
		//Global Declare
		//only Find Element & Elements
		
		driver.get("https://booking-dev.hellolunajoy.com/?referal=website-insurance-validation");
		
//    	Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.xpath("//input[@id='firstName']"));
		
		username.sendKeys("Vishnu");
//		Thread.sleep(3000);	
		
		/*
		driver.get("https://letcode.in/waits");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		//Thread.sleep(3000);
	
		driver.findElement(By.xpath("//button[@id='accept']")).click();
		
//		Thread.sleep(10000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		Alert until = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(until.getText());
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		*/
		
		driver.get("https://letcode.in/waits");
		
		WebElement simpleAlert = driver.findElement(By.xpath("//button[@id='accept']"));
		
		simpleAlert.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert myalert = driver.switchTo().alert();
		
		myalert.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	 
			}

}
