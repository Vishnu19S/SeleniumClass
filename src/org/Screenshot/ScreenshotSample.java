package org.Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotSample {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstname.sendKeys("Vishnu");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastname.sendKeys("Welcome");
		
		TakesScreenshot ts = (TakesScreenshot)driver; //DownCasting
		
		File source = ts.getScreenshotAs(OutputType.FILE);  //ScreenShot
		
		File destination = new File("C:\\Users\\Dell\\eclipse-workspace\\Selenium\\Screenshots\\"+"New.png");
		
		FileUtils.copyFile(source, destination);
		
		
		
		
		
		
		
		
		
	}

}
