package org.RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClassSample {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
//		Actions ac = new Actions(driver);
//		
//		WebElement switchto = driver.findElement(By.xpath("//a[normalize-space()='SwitchTo']"));
//		
//		ac.moveToElement(switchto).perform();
//		
//		ac.click(switchto);
//		
//		Robot rc = new Robot();
//		
//		rc.keyPress(KeyEvent.VK_DOWN);
//		
//		rc.keyRelease(KeyEvent.VK_DOWN);
//		
//		Thread.sleep(2000);
//		
//		rc.keyPress(KeyEvent.VK_DOWN);
//		
//		rc.keyRelease(KeyEvent.VK_DOWN);
//		
//		rc.keyPress(KeyEvent.VK_ENTER);
		
		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		
		Robot rc= new Robot();
		
		Actions ac = new Actions(driver);
		
		ac.click(firstname).perform();
		
		
		rc.keyPress(KeyEvent.VK_G);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
