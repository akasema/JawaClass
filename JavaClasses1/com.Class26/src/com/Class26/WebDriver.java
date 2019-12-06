package com.Class26;

public class WebDriver {

	
	public void open(){
		
		System.out.println("Opening Browser");
	}
	public void refresh() {
		System.out.println("Refreshing Browser");
	}
}
class ChromeDriver extends WebDriver{
	
	public void open() {
		System.out.println("Opening chrome Browser");
	}
}
class FirefoxDriver extends WebDriver{
	public void open() {
		System.out.println("Opening Firefox Browser");
	}
	public void getTitle() {
		System.out.println("Getting T,tle on Firefox browser");
	}
}

