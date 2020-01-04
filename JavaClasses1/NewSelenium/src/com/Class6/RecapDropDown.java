package com.Class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Util.CommonMethods;

public class RecapDropDown extends CommonMethods{
	public static final String URL="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		
		 
	}

}
