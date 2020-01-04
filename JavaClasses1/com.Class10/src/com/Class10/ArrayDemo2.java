package com.Class10;

public class ArrayDemo2 {
	public static void main(String[] args) {
		
		char[] grades=new char[6];//char tanýmlamasý
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		System.out.println(grades[1]);
		System.out.println(grades[2]);
		System.out.println(grades[3]);
		System.out.println(grades[4]);
		System.out.println(grades[5]);
		System.out.println("***********************");
		
		for (int i=0; i<grades.length; i++) {
			System.out.println(grades[i]);
			
		}
		System.out.println("***********************");
		
		String[] animals= {"cat", "Dog","Cow","Snake","Elephant"};
		int size=animals.length;
		for(int i=0; i<size; i++) {
			System.out.println(animals[i]+" ");
		}
		System.out.println("***********************");
		double[] dblNum= {1.1, 2.2, 3.3,4.4,5.5};
		for (int i=0; i<dblNum.length; i++) {
			System.out.println("DoubleNums are:"+dblNum[i]);
		}
		
	}

}
