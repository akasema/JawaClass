package com.Class31;

interface TakeScreenShot{
		//public static final
		String fileExtention=".png";
		void takesScreen();
		// added from jdk 1.8
		static void takeSelfie() {
			System.out.println(" I am defined static methot of TakeScreenShot interface");
			}
		default void takePictures() {
			System.out.println(" I am default defined methot of TakeScreenShot interface");
		}
}
interface Application{
	void application();
}
public interface WebDriver extends TakeScreenShot {
	void openBrowser();
	void closeBrowsr();
	void maximizeWindow();
	void findElement();
	
}
class Firefox extends Browser implements WebDriver,Application{

	@Override
	public void openBrowser() {
		System.out.println("Open FireFox Browser");
		
	}

	@Override
	public void closeBrowsr() {
		System.out.println("Close Firefox Browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximize window in Firefox Browser");
		
	}

	@Override
	public void findElement() {
		System.out.println("Find Element by CCS selector");
		
	}

	@Override
	public void refresh() {
		System.out.println("Refresh window in Firefox Browser");
		
	}

	@Override
	public void takesScreen() {
		System.out.println("Takes ScreenShot window in Firefox Browser");
		
	}

	@Override
	public void application() {
		System.out.println("Application in Firefox Browser");
		
		
	}
	
}
abstract class Browser{
	public abstract void refresh();
}

class Chrome extends Browser implements WebDriver,Application{

	@Override
	public void openBrowser() {
		System.out.println("Open Chrome Browser");
		
	}

	@Override
	public void closeBrowsr() {
		System.out.println("Close Chrome Browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximize window in Chrome Browser");
		
	}

	@Override
	public void findElement() {
		System.out.println("Find Element by XPath");
		
	}

	@Override
	public void refresh() {
		System.out.println("Refresh window in Chrome Browser");
		
	}
	@Override
	public void takesScreen() {
		System.out.println("Takes ScreenShot window in Chrome Browser");
		
	}

	@Override
	public void application() {
		System.out.println("Application in Chrome Browser");
		
	}
	
}