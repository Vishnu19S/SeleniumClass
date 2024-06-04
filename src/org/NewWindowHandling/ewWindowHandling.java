package org.NewWindowHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ewWindowHandling {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		WebElement home = driver.findElement(By.xpath("//a[normalize-space()='Home']"));
		
		WebElement switchto = driver.findElement(By.xpath("//a[normalize-space()='SwitchTo']"));
		
		WebElement frames = driver.findElement(By.xpath("//a[normalize-space()='Frames']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver; //Downcasting
		js.executeScript("arguments[0].scrollIntoView()", home);
		
		Actions ac = new Actions(driver); //Upcasting
		
		
		ac.moveToElement(switchto).perform();
		
		ac.click(switchto).perform();
		
		Robot rc = new Robot();
		
		rc.keyPress(KeyEvent.VK_DOWN);
		rc.keyRelease(KeyEvent.VK_DOWN);
		
		rc.keyPress(KeyEvent.VK_DOWN);
		rc.keyRelease(KeyEvent.VK_DOWN);
		
		rc.keyPress(KeyEvent.VK_DOWN);
		rc.keyRelease(KeyEvent.VK_DOWN);
		
		
		ac.contextClick(frames).perform();
		
		
		rc.keyPress(KeyEvent.VK_DOWN);
		rc.keyRelease(KeyEvent.VK_DOWN);
		
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);
		
	/*	//option 1
		
		Set<String> windowHandles = driver.getWindowHandles(); //To avoid Duplicates
		
		System.out.println(windowHandles.size());//2
		
		for(String windowhandle:windowHandles) {
			
			driver.switchTo().window(windowhandle);
			
		}
		*/
		
		Set<String> windowHandles = driver.getWindowHandles(); //Random Order
		
		ArrayList<String> windows = new ArrayList<String>(windowHandles); // Insertion Order //Index Based
		
		driver.switchTo().window(windows.get(1));
		
		Thread.sleep(3000);
		
		driver.switchTo().window(windows.get(0));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
