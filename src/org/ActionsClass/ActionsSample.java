package org.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSample {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Static.html");
		
//		WebElement switchto = driver.findElement(By.xpath("//a[normalize-space()='SwitchTo']"));
//		
		Actions ac= new Actions(driver);
//		
//		ac.moveToElement(switchto).perform();
//		
//		ac.contextClick(switchto).perform();
		
//		WebElement home = driver.findElement(By.xpath("//a[normalize-space()='Home']"));
//		
//		ac.moveToElement(home);
//		
//		ac.click(home).perform();
		
//		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
//		
//		firstname.sendKeys("Vishnu");
//		
//		ac.doubleClick(firstname).perform();
		
		WebElement source = driver.findElement(By.xpath("//div[@class='col-xs-10 col-xs-offset-2']//img[@id='mongo']"));
		
		WebElement target = driver.findElement(By.xpath("//div[@id='droparea']"));
		
		ac.dragAndDrop(source, target).perform();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
