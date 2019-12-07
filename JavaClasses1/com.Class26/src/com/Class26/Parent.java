package com.Class26;

public class Parent { 
	void m1() {
		System.out.println("In parent class m1");
	}
	}
	
class Subclass extends Parent{
	void m1(){
		System.out.println("In child class m1");
	}
void m2(){
	System.out.println("In m2");
	}

public static void main(String args[]){
	Parent obj= new Subclass();
	obj.m1();
	//obj.m2();// error
	
	//in child class obj.m2(); error
	//ce:method is not defined}}
}
}
