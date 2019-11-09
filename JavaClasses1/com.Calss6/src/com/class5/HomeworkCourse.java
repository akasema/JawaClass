package com.class5;

import java.util.Scanner;

public class HomeworkCourse {
	public static void main(String[]Arg){
	    boolean isWeekend=false;
	    String subject="null";
	    Scanner scan=new Scanner(System.in);
	    
	    System.out.println("Is it weekend?");
	    isWeekend =scan.nextBoolean();
	    
	    if (!isWeekend){
	      subject="Manual testing";
	      
	    }else {
	      subject="Java";
	    }
	    System.out.println("Today you will be learning " +subject);
	  }
}
