package org.AlertsClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Alerts2 {

//	public static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
	/*	
//		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
//		driver.get("https://username:password@the-internet.herokuapp.com/basic_auth");
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		driver.switchTo().alert().accept();
		
	
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		
		Alert myalert = driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		System.out.println(myalert.getText());
		
		myalert.sendKeys("WELCOME");
		
		//myalert.accept(); //OK
		myalert.dismiss();// Cancel
*/
	
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.hdfcbank.com/");
		
		driver.manage().window().maximize();
	
	
	}

	
}
