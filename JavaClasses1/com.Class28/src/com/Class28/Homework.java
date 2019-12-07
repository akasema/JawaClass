package com.Class28;
/*Write program: userClass  that has a constructor that initializes name and mobile number istance variables. 
 * Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call. 
 * Print users name, mobile number and address in userDetails method. 
 * Test your code.
 * 
 */
public class Homework {
	String name;
	String mobileNum;
	
	Homework(String name, String mobileNum){
		this.name=name;
		this.mobileNum=mobileNum;
		
	}
public static void main(String[] args) {
	UserInfo ui=new UserInfo( "Kadir", "ggg", "941 lee", "0273456");
	ui.info();
}
}
