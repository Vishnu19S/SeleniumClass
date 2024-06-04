package org.WindowHandling;

import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		WebElement switchto = driver.findElement(By.xpath("//a[normalize-space()='SwitchTo']"));
		
		WebElement frames = driver.findElement(By.xpath("//a[normalize-space()='Frames']"));
		
		WebElement home = driver.findElement(By.xpath("//a[normalize-space()='Home']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView()", home);

		Actions ac = new Actions(driver);
		
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
		
		Thread.sleep(3000);
		
		rc.keyPress(KeyEvent.VK_DOWN);
		rc.keyRelease(KeyEvent.VK_DOWN);
		
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);
		
		
		Set<String> windowHandles = driver.getWindowHandles(); //To avoid Duplicates
		 
		
		ArrayList<String> windows =new ArrayList<String>(windowHandles); // Insertion Order
		
		
		driver.switchTo().window(windows.get(1));
		
		
//		for (String windowHandle : windowHandles) {
//		    driver.switchTo().window(windowHandle);
//		    // Perform actions in the window
//		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement home1 = driver.findElement(By.xpath("//a[normalize-space()='Home']"));
		
		WebElement switchto1 = driver.findElement(By.xpath("//a[normalize-space()='SwitchTo']"));
		
		WebElement windows1 = driver.findElement(By.xpath("//a[normalize-space()='Windows']"));
		
		js.executeScript("arguments[0].scrollIntoView()", home1);
		
		ac.moveToElement(switchto1).perform();
		
		ac.click(switchto1).perform();
		
		
		rc.keyPress(KeyEvent.VK_DOWN);
		rc.keyRelease(KeyEvent.VK_DOWN);
		
		rc.keyPress(KeyEvent.VK_DOWN);
		rc.keyRelease(KeyEvent.VK_DOWN);
		
		ac.contextClick(windows1).perform();
		
		Thread.sleep(3000);
		
		rc.keyPress(KeyEvent.VK_DOWN);
		rc.keyRelease(KeyEvent.VK_DOWN);
		
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		System.out.println(windowHandles1);
		ArrayList<String> win =new ArrayList<String>(windowHandles1);
		
		System.out.println(win.size());
		driver.switchTo().window(win.get(2));
		
		
		Thread.sleep(2000);
		
//		driver.switchTo().window(win.get(0));
//		
//		
//		driver.switchTo().window(win.get(2));
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
