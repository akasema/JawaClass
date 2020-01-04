package com.Util;


import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//command+o--> to see all methods within the class 
public class CommonMethods {
	
	public static WebDriver driver;
	
	/** 
	 * Use this method in need of opening browser and target url
	 * @param browser The desired browser
	 * @param url	 The desired url
	 */
	public static void setUp(String browser, String url){
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers/chromeDriver.exe");
			driver=new ChromeDriver();
			driver.get(url);
		
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get(url);
		}else {
			System.err.println("Browser not supported");
		}
		
	}
	
	/**
	 * This method will accept the alert
	 * 
	 * @throws NoAlertPresentException if alert is not present 
	 */
	public static void acceptAlert() {
		
		try {
			Alert alert=driver.switchTo().alert();
			alert.accept();
		}catch (NoAlertPresentException e) {
			System.out.println("Alert is not present");
		}
	}
	
	/**
	 * This methods will dismiss the alert
	 * 
	 * @throws NoAlertPresentException if alert is not present 
	 */
	public static void dismissAlert() {
		
		try {
			Alert alert=driver.switchTo().alert();
			alert.dismiss();
		}catch(NoAlertPresentException e) {
			System.out.println("Alert is not prresent");
		}
	}
	
	/**
	 * This method will get a text from the alert
	 * 
	 * @return text of the alert
	 * @throws NoAlertPresentException if alert is not present
	 */
	
	public static String getAlertText() {
		
		try {
			Alert alert=driver.switchTo().alert();
			return alert.getText();
		}catch(NoAlertPresentException e) {
			System.out.println("Alert is not present");
			return null;
		}
	}
	
	/**
	 * This method with switch to the frame 
	 * @param 
	 */
	public static void switchToFrame(WebElement element){
		try {
			driver.switchTo().frame(element);
		}catch (NoSuchFrameException e) {
			System.out.println("Frame is not Present");
		}
	}
	
	/**
	 * This method with switch to the frame 
	 * @param element
	 */
	public static void switchToFrame(int index){
		try {
			driver.switchTo().frame(index);
		}catch (NoSuchFrameException e) {
			System.out.println("Frame is not Present");
		}
	}
	
	
//	public static WebDriver setUp(String browser){
//		
//		if(browser.equalsIgnoreCase("chrome")) {
//			System.setProperty("webdriver.chrome.driver", "drivers/chromeDriver");
//			driver=new ChromeDriver();
//		
//		}else if(browser.equalsIgnoreCase("firefox")) {
//			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
//			driver=new FirefoxDriver();
//		}
//		
//		return driver;
//	}

}
