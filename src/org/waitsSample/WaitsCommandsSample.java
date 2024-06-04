package org.waitsSample;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsCommandsSample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
//		driver.manage().window().maximize();
		/*
		driver.get("https://booking-dev.hellolunajoy.com/?referal=website-insurance-validation");
		
		//Implicit Wait -- Global Declaration,Mainly applicable for all the webelement and WebElements
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//		Thread.sleep(5000);
		
		WebElement firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
		
		firstname.sendKeys("VISHNU");
		
		*/
		
		
		driver.get("https://letcode.in/waits");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement simple = driver.findElement(By.xpath("//button[@id='accept']"));
		simple.click();
		
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		
		Alert myalert = driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		myalert.accept();
		
		
		
	}

}
