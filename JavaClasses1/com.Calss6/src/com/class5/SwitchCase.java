package com.class5;

public class SwitchCase {
	public static void main(String[] args) {
		/* 77 weekdays
		 * 1 monday.. etc
		 */
		int day=5;
		
		String weekDay;
		
		
		if (day==1) {
			weekDay = "Monday";			
		}else if (day==2) {
			weekDay="Tuesday";			
		}else if (day==3) {
			weekDay ="Wedn";			
		}else if (day==4) {
			weekDay="Thursday";			
		}else if (day==5) {
			weekDay = "Friday";		
		}else if (day==6) {
			weekDay = "Saturday";
		
		}else if (day==6) {
			weekDay = "Sunday";
			
		}else {
				weekDay = "Invalid";
			}
		System.out.println(weekDay);
		
		int day2=3;
		
	 switch(day2){
	 case 1:
		 weekDay = "Monday";
		break;
	 case 2:
		 weekDay = "Tuesday";
		 break;
	 case 3:
		 weekDay = "Wedn2";
		 break;
		default:
			weekDay = "Invalid2";
	 }
	 System.out.println(weekDay);
		 
	 }
	}

