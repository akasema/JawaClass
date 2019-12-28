package com.Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/config/login");
		
		driver.findElement(By.id("login-username")).sendKeys("kadirgok@yahoo.com");
	
	driver.findElement(By.id("login-signin")).click();
driver.findElement(By.id("login-passwd")).sendKeys("sema1960");
	
	driver.findElement(By.id("login-signin")).click();
	
	}

}
