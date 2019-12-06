package com.Class26;

public class FullTime extends Employee {
	 int bonus;
	public void getPaid() {//overriding
		System.out.println("Full time Employee get paids "+ salary+" and "+bonus);
	}

}
