package com.Class18;

import java.util.Scanner;

public class BuiltinAndUserDefinedMethods {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hello";
		str=str.replace("Hello", "Hi");
		System.out.println(str);
		Scanner scan=new Scanner(System.in);
		String str2=scan.nextLine();
		System.out.println(str2);
		
				
		BuiltinAndUserDefinedMethods obj= new BuiltinAndUserDefinedMethods();
		obj.myMethod();
			
		}
	void myMethod() {// method without parameters
		System.out.println("This is user defined method that i create it");
		
		
	}

	
}
