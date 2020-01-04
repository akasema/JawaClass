package com.Class24;

public class ConstructorDemo {

//	ConstructorDemo(){
//	}

	ConstructorDemo() {
		System.out.println("I am your default constructor");
	}

	private ConstructorDemo(String str) {
		System.out.println("I am private constructor with 1 String parameter " + str);
	}

	protected ConstructorDemo(int num) {
		System.out.println("I am protected constructor with 1 int parameter " + num);
	}

	public ConstructorDemo(int num, String str) {
		System.out.println("I am public constructor with 2 int parameter " + num);
	}

	public static void main(String[] args) {

		ConstructorDemo obj = new ConstructorDemo();
		System.out.println("Code after creating an Object");
		obj.hello();
		ConstructorDemo obj2 = new ConstructorDemo(123, "String");
		ConstructorDemo onbj =new ConstructorDemo(456);
		ConstructorDemo obj3 = new ConstructorDemo("String");
	}

	public void hello() {
		System.out.println("Hello Class");
		System.out.println("Hello Instructors");
	}
		
		

	

}
