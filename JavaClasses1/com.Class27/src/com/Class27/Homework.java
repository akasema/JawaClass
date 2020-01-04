package com.Class27;
import java.util.Scanner;
public class Homework {
	
	final String reverseString(String str) {
	  char[] in=str.toCharArray();
	  char temp;
	  for (int i=str.length()-1; i>=0;i--) {
		in[i]=str.charAt(str.length()-1-i);
		 } 
	  return new String(in);
	  
	}
	  public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	  System.out.println("Please enter a word");
	  String str=scan.nextLine();
	  Homework nstr=new Homework();
		String s=nstr.reverseString(str);
			  System.out.println(s);
}
}