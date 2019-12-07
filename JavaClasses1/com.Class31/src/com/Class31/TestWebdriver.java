package com.Class31;

public class TestWebdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver=new Firefox();
		driver.openBrowser();
		driver.closeBrowsr();
		driver.findElement();
		driver.maximizeWindow();
		driver.takesScreen();
		driver.takePictures();
		
		WebDriver driver0=new Chrome();
		driver0.openBrowser();
		driver0.closeBrowsr();
		driver0.findElement();
		driver0.maximizeWindow();
		driver0.takesScreen();
		
		
	TakeScreenShot driver1=new Chrome();
//		driver1.openBrowser(); dosent works not inside takescreenshot
//		driver1.closeBrowsr();
//		driver1.findElement();
//		driver1.maximizeWindow();
		driver1.takesScreen();

	}

}
