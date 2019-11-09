package com.class4;

public class ElseRecap {
	public static void main(String[] args) {
		/* class schedule 
		 * if tuesday --> sdlc
		 * wednesday --> java rewiev
		 * thursday--> sdlc
		 * saturday --> java coding
		 * if sunday --> my favorite java coding 
		 */
		
		int day;
		day=2;
		
		if (day==2) {
			System.out.println("Sdlc class");
		}else if (day==3) {
			System.out.println("Review class");
		
		}else if (day==4) {
			System.out.println("Sdlc class");
			
		}else if (day==6) {
			System.out.println("Java class");
		}else if (day==7) {
			System.out.println("y Favorite Java class");
		}else {
			System.out.println("No class for today");
	}

}
}
