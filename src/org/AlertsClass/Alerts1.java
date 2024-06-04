package org.AlertsClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alerts1 {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications"); // Corrected the argument name

		WebDriver driver = new ChromeDriver(options); // Passing ChromeOptions when creating the ChromeDriver instance

		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();


		Alert myAlert = driver.switchTo().alert();
		String alertText = myAlert.getText();

		// Handle the alert as needed, for example, accept/dismiss it
		myAlert.accept(); // or myAlert.dismiss();
	}

}
