package com.class4;

public class Recap {
	public static void main (String []args ) {
		int num=99;
		num-=200; //-110=901200
		num-=110;
		num+=220;
		
		if (num>0) {
			System.out.println(num+" is a positive number.");
			
		}else if (num==0) {
			System.out.println("Value num is " + num);
			
		}else {
			System.out.println(num+ " is negative number ");
		}
	//even or odd numbers
		int i=133;
		if (i%2==0) {  //or you can write as if (i%2!=0) is noot equal zero
			System.out.println(i+" is an even number.");
			
		}else {
			System.out.println(i + " is an odd number ");
			
			
		}
	}

}
