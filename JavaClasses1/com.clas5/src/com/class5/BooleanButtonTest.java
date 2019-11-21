package com.class5;

public class BooleanButtonTest {
	public static void main(String[] args) {
		/*if button is displayed we have to verify text on it 
		 * if text equal to sign in--> test case pass
		 * otherwise -->wrong text is displayed
		 */
		
		boolean isDisplayed=true;
		String buttonText=("Sign in");
		if (isDisplayed) {
			System.out.println("Button is displayed");
			
			if (buttonText.equals("Sign in")) {
			System.out.println("Test Case pass");	
			
			}else {
				System.out.println("Wrong Text is Displayed");
			}
		}else {
			System.out.println("Button is not displayed");
		}
	}

}
