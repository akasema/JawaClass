package com.Class24;

public class ThisWithConstructor {
	
	
	public ThisWithConstructor() {
		System.out.println("I am non argument constructor");
	}
	public ThisWithConstructor(String str) {
		this();//used to call current class constructor
		System.out.println(str+" I am with argument constructor");
	}
	ThisWithConstructor(String str, String str1){
	this(str);
	System.out.println(str+" I am with 2 arguments constructor. "+str1);
	}
	
	
	public static void main(String[] args) {
		ThisWithConstructor obj=new ThisWithConstructor("Hello");// bu ikinci constructoru çaðýrýr 
		// ikinci constructor da this() oldugundan bund parameter olmadýðýndan parametersiz constructoru çaðýrýr. 
		// iki si de birden çalýþmýþ olur
		System.out.println("******************");
		ThisWithConstructor obj1=new ThisWithConstructor("Hello", "Bye");
		// bu da ikinci constructoru çaðýrý 
		//onun içinde birinciyi çaðýran var böylece 3 ü birden execute olur
		//This callled as CONSTRUCTOR CHANING
	}
}
