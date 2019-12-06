package com.Class26;

public class RunTimePolymorphism {
	public static void main(String[] args) {
		// widening 
		double d=90;//90 ý 90.0 a genisletiyoruz
		
		//narrowing 
		int i=(int)1.99; // 1.99 u 1 e daraltýyoruz
	
	//nonprimtive TypeCasting 
		//widening ---> creating an object of the class 
		// and giving referance to the Parent Class
		
		Animal obj=new Cat();
		
		// narroving 
		// Cat obj2= new Animal () ; ---> cannot convert animal to cat 
		
	}
}
