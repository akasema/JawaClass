package com.Class10;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		
		int[] nums=new int[4];
		nums[0]=12;
		nums[1]=13;
		nums[2]=14;
		nums[3]=15;
		System.out.println(nums.length);//nums un array buyuklugunu basar (4)
		//Property of an array denir
		
		
		//Shorter way of creating an array
				// index :  0		1		2			3
		String[] array= {"winter", "Fall","Summer", "Spring"};//string taýmlamasý
		System.out.println("Iwas born in "+array[2]);//i was born in Summer
		// baska bir sey
		int arraySize=array.length;
		System.out.println(arraySize);//4 basar
		
		System.out.println("********************");
		char[] abc=new char[5];//char tanýmlamasý
		abc[0]='A';
		abc[1]='B';
		abc[2]='D';
		abc[3]='E';
		abc[4]='F';
		System.out.println(abc[1]);
		
		System.out.println("********************");
		//index        0    1    2     3
		char[] abc1= {'A', 'B', 'C', 'D'};
		System.out.println(abc1[1]);
		
		System.out.println("********************");
		String[] days= {"Java", "Saturday","day", "coding"};
		System.out.println(days[1]+" is "+days[0]+" "+days[3]+" "+days[2]);
		
		System.out.println("********************");
		
		String[] days1=new String[4];
		days1[0]="Java";
		days1[1]="Saturday";
		days1[2]="day";
		days1[3]="coding";
		System.out.println(days[1]+" is "+days[0]+" "+days[3]+" "+days[2]);
		
		char[] word={'s', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x'};
	    System.out.print(word[0]);
	    for (int i=1; i<=10; i++){
	      if (i%2==0){
	        System.out.print(word[i]);
	      }
	    }
	    String[] wrd={"This", "is", "array", "of", "strings"};
	    for (int i=0; i<=5; i++){
	      System.out.print(wrd[i]+" ");
	    }
	    
	    String[] weekdays={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	    
	    Scanner scan=new Scanner(System.in);
	    for (int i=0; i<=6; i++){
	        System.out.println("Please Enter the Day of the week");
	    int day=scan.nextInt();
	    System.out.println(weekdays[day]);
	    } 
	}

	}
