package com.Class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Util.CommonMethods;

class ToolsQaWorks extends CommonMethods{
public static String url="https://www.toolsqa.com";
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
 		WebDriver driver=new ChromeDriver();
		CommonMethods.setUp("chrome", url);
		
//		driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
		driver.findElement(By.xpath("//input[@id='sex-0']")).click();
				
//		driver.findElement(By.linkText("firstname")).sendKeys("Kadir");
//		driver.findElement(By.linkText("lastname")).sendKeys("GOK");
//		
		
		Thread.sleep(1000);
		driver.close();

	}

}
