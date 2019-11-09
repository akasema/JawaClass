package com.class5;

public class AndOrHomework {
	import java.util.Scanner;
	class Main {
	public static void main(String[] args){
	 Scanner input=new Scanner(System.in);
	 System.out.println("Please enter two strings");
	 String word1=input.nextLine();
	 String word2=input.nextLine();
	 System.out.println("Please enter two numbers");
	 int int1=input.nextInt();
	 int int2=input.nextInt();
	 if(int1==int2 && word1.equals(word2)){
	   System.out.println("AND");
	 }else if (int1==int2 || word1.equals(word2)){
	   System.out.println("OR");
	 }else if (!(int1==int2 && word1.equals(word2))){
	   System.out.println("NONE");
	 }
	}
	}

}
