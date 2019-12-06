package com.Class26;

public class TestWbDrivers {
	
		public static void main(String[] args) {
			ChromeDriver chrome=new ChromeDriver();
			chrome.refresh();
			chrome.open();
			
			FirefoxDriver firefox=new FirefoxDriver();
			firefox.refresh();
			firefox.open();
	System.out.println("Runtime Polymorphisim");
			// Creating an object of child class and
			//given referance to the Parent calass
			WebDriver driver=new ChromeDriver();
			driver.open();
			driver.refresh();
			//driver.getTitle();
			// we can not do this becouse it is in chld class
			
		}
	}


