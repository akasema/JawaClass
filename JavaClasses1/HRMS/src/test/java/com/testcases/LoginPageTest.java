package com.testcases;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.pages.LoginPage;
import com.hrms.util.CommonMethods;

public class LoginPageTest extends CommonMethods{
	
	@Test 
	public void login() {
		LoginPage login=new LoginPage();
		sendText(login.username, "Admin");
		sendText(login.password, "Hum@nhrm123");
		click(login.loginBtn);
		
	}
	@Test
		public void nLoginWithoudPass() {
			LoginPage login=new LoginPage();
			sendText(login.username, "Admin");
			click(login.loginBtn);
			String expected="Password cannot be empty";
			//Assert.assertEquals(login.errMsg.getText(), expected);
		}
	@Test
	public void nLoginWithoutCreditentials() {
		LoginPage login=new LoginPage();
		//sendText(login.username, "Admin");
		click(login.loginBtn);
		String expected="Password cannot be empty";
		Assert.assertEquals(((WebElement) login.errorMsg).getText(), expected," is not mached");
	}

}
