package com.Class14;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewQuestions {

	public static void main(String[] args) {
		

// qw No1: swap 2 variables without 3rd var. same as strings 
		int a=10;
		int b=20;
		System.out.println("a="+a+"b="+b);
		a=a+b;//30
		b=a-b;//30-20=10=b
		a=a-b;//30-10=20=a
		System.out.println("a="+a+"b="+b);
		System.out.println("*************************");
		String as="Hello";
		String bs="World";
		System.out.println("as="+as+" bs="+bs);
		bs=as+bs;		
		System.out.println("bs="+bs);//HelloWorld
		System.out.println("*************************");
		bs=bs.substring(0,bs.length()-as.length());
		System.out.println("bs= "+bs);
//		as=bs.substring(as.length(), bs.length()+as.length());
//		System.out.println("as= "+as);
		System.out.println("*************************");
//qw no: 2; write a java program to find the second largest in array, max, min
		
		int [] arr= {2,4,5,7,9};
//Easiest way 
		Arrays.sort(arr);
		int min1=arr[0];
		int max1=arr[arr.length-2];
		System.out.print("min="+min1);
		System.out.println("; 2nd max="+max1);
		System.out.println("*************************");
// second way 		
		int max=arr[0];
		int min=arr[0];
		int secondLargest=0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]>max) {
				secondLargest=max;
				max=arr[i];
//	other way of second large
				//if (i==arr.length-2) {
//					secondLargest=arr[i];	}
			}
			if (arr[i]<min) {
				min=arr[i];
			}						
		}System.out.println("max is "+max+"; min is "+ min);
		System.out.println("Second Largest "+secondLargest);
		System.out.println("*************************");
//3rd QW: find how many alpha character s present in a string 
		
		String str="%&/)/%+** Hello world mom and dad we are studying java class.";
		String str2= str.replaceAll("[^a-zA-Z]", "");
		System.out.println("alpha characters present in a string");
		System.out.print(str2.length());
		System.out.println("*************************");
//4th Qw: how to find out the part of the string , what is substring ,
//		//find number of words in a string 
		String substr=str.substring(9, 15);
		System.out.println("Substring 9,15 is "+substr);
		//*******************
		String[] array=str.split(" ");
		
		System.out.println("New string array value is "+array.length);
		//to find array words
		int num=0;
//		for (int i=0; i<array.length; i++) {
//			System.out.println(array[i]);
//			num=i+1;
////		}
//		System.out.println("Number of substring is "+num);
//5th Qw; Reverse string word by word
 	System.out.println("Reverse string word by word"); 
		for (int i=array.length-1; i>=0; i--) {
			System.out.print(array[i]+" ");
			num=i+1;
		}
		System.out.println();
		System.out.println("*********************");
//5th Qw; Reverse string letter by letter
//		String given="we are studying java class";
//		String replaced1="";
//		char[] charArray = given.toCharArray();
//		for (int i= charArray.length-1; i<=0; i--) {
//			replaced1=replaced1+charArray(i)-1; // dostyadan al�p d�zelt
//			System.out.println(replaced);
//		}
		
// 6Th QW: if a word is a palindrome 
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter a word to check whether is palindrome");
//		String pal=scan.nextLine();
//		
//		for (int i=0; i<pal.length()-1; i++) {
//			int lng=pal.length()-(i);		
//		if (pal.charAt(i)!=pal.charAt(lng-1)) {
//		//	System.out.println(pal.charAt(i)+"  "+ pal.charAt(lng-1));
//			System.out.println("Word is NOT a Palindrome "+ pal);
//			break;
//		}else {
//		//	System.out.println(pal.charAt(i)+"  "+ pal.charAt(lng-1));
//			System.out.println("Word is a Palindrome "+ pal);	
//			break;
//		}
//		
//		}
		
		String original="kayak";
		char reversed=' ';
		char forward=' ';
		for (int i=original.length()-1; i>=0; i--) {
			reversed=original.charAt(i);
			forward=original.charAt((original.length())-i);
		if (reversed==forward) {
			System.out.println("plaindrome");
		}else {
			System.out.println("Not palindrome");
			
		} break;
		}
		System.out.println("**********");
//Qw7 write a program to find first 10 prime numbers.
		//int [] prm= {1, 2, 3, 5, 8, 13, 21, 34};
		int [] prm= {2, 3, 5, 7, 11, 13, 17};
		int c1=0,a1=0;
		for (int i=1; i<prm.length-1; i++) {
			a1=prm[i];
			c1=prm[i-1];
			if (a1%c1==0) {
				System.out.println("Array is not Prime");
				break;
			}else {
				System.out.println("Array is Prime");
				break;
			}
		}
//	whether given number is Prime or not 
		//prime number divisible by itself and by 1;
 
		System.out.println("**********");
		
// qw write a program to print fibonach
		
	//	int [] fib= {2,33,5,7,9,12,11,56};
//		int [] fib= {1, 1, 2, 3, 5, 8, 13, 21, 34};
//		
//		for (int i=1; i<fib.length-1; i++) {
//			if (fib[i+2]!=fib[i]+fib[i+1]) {
//				System.out.println("Array is not Fibonachi");
//				break;
//			}else {
//				System.out.println("Array is Fibonachi");
//				break;
//			}
//		}
//		int[] fib= new int[12];
//			int a=0,b=1,c=0;	
//		for (int i=2; i<10; i++) {
//			c=fib[i];
//			b=fib[i-1];
//			a=fib[i-2];
		// System.out.println(c);
//			if (c==b+a) {
//				fib[i]=c;
//				System.out.print(fib[i]);
//			}
//		}
		System.out.println("**********");
		int  e=0, f=1, g;
		for (int i=0; i<10; i++) {
			System.out.print(e+" ");
			g=e+f;
			e=f;
			f=g;			
		}
//   an other method 
		
		System.out.println();
		int maxNumber = 10; 
		 int previousNumber = 0;
		 int nextNumber = 1;
		 
	        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");

	        for (int i = 1; i <= maxNumber; ++i)
	        {
	            System.out.print(previousNumber+" ");
	            /* On each iteration, we are assigning second number
	             * to the first number and assigning the sum of last two
	             * numbers to the second number
	             */
    
	            int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	        }
	
	}
	}


