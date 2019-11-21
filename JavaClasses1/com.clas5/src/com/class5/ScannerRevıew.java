package com.class5;

import java.util.Scanner;

public class ScannerRevýew {
	public static void main(String[] args) {
		
	}
//Scanner class to make an input
  Scanner anyVariableName=new Scanner(System.in);
  System.out.println("Please enter boolean value");
  boolean val=anyVariableName.nextBoolean();
  
  System.out.println("Please enter String value");
  String val1=anyVariableName.nextLine(); //take entire line
  
 String val2=anyVariableName.next();//take first word until space
  
 
}
