package com.Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Util.CommonMethods;

public class WebElement extends CommonMethods{
	public static final String URL="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		
		WebElement userName=(WebElement) driver.findElement(By.xpath("//input[@id='txtUsername']"));
		userName.sendKeys("sohilaryan");
		//it will clear the text box or text area
		userName.clear();
		userName.sendKeys("sohilaryan");
		
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Syntax@12");
		
		//span[@id='spanMessage']
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//Storing the error message element
		WebElement errorMessage=driver.findElement(By.xpath("//span[@id='spanMessage']"));
		//will return either true or false
		System.out.println(errorMessage.isDisplayed());
		
		//String errorMsg=errorMessage.getText();
		//System.out.println(errorMsg);
		
		
		if(errorMessage.isDisplayed()) {//checking if the error message is displayed or not
			String message=errorMessage.getText();//get the visibale text from error message
			if(message.equals("Invalid credentials")) {//compare the text with expected message
				System.out.println("Correct Error Message is Displayed");
			}else {
				System.err.println("Incorect error Message is Displayed");
			}	
		}
		
		
		
		
		
	}

}
