package com.Class6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Util.CommonMethods;

public class RadioRecap extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		 CommonMethods.setUp("chrome", "http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
		//handle 1 radio or checkbox
		 driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		 
		//handle multiple radio or checkbox
		 
		 List<WebElement> allCheckBoxes=(List<WebElement>) driver.findElement(By.xpath("//input[@class='cb1-element']"));
		 
		 Thread.sleep(1000);
		 driver.close();

	}

}
