package org.DropDown;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {
public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/index.php");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("vishnu19S");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Admin@123");
		
		driver.findElement(By.xpath("//input[@id='login']")).click();
		
		
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		Select locdd=new Select(location);
		
		Thread.sleep(2000);
		
//		locdd.selectByVisibleText("London");
	
//		locdd.selectByIndex(9);
		
		locdd.selectByValue("Sydney");
		
		
		/*//Find No Of Options
		
		List<WebElement> options = locdd.getOptions();
		
		System.out.println(options.size());
		
		//Capture all the options
		
		for(WebElement alloptions:options) {
			
			System.out.println(alloptions.getText());//
			
			*/
			
			
			
		}


}
