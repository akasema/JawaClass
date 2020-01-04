package com.Class28;

public class UserInfo extends Homework {
		String userAddress;
		
		UserInfo(String name, String mobNum, String userAddress, String mobileNum) {
			super(name,mobileNum);
			this.userAddress=userAddress;
		
		
	}
		public void info() {
		System.out.println(name+userAddress+mobileNum);
		}
	}


