package com.class5;

import java.util.Scanner;

public class TimeOfDayAndOr {
	public static void main(String[] args) {
		int time=20;
		String timeOfDay=null; //in java all variables must be initialized before use it
		// default values int-->0, double-->0.0,  boolean-->false, string -->null
		
		
		if (time>=1 && time<=11) {
			timeOfDay="Morning";
		}else if (time>=12 && time<=15) {
			timeOfDay="Noon";
		}else if (time>=16 && time>=20) {
			timeOfDay="Evening";
		}else if (time>20) {
			timeOfDay="Evening";
		}else {
			System.out.println("Out of range");
		}
		System.out.println(timeOfDay);
	}

}
