package com.Class17;

public class Dog {
	String family, name;
	int age;
	
	void bark() {
		System.out.println("My dog name "+name+" can bark");
		}
	void walk() {
		System.out.println("My dog name "+name+" can walk");
		}
	void catc() {
		System.out.println("My dog name "+name+" can catch cats");
		}
	public static void main(String[] args) {
		
	
	Dog dog1=new Dog();
	dog1.age=4;
	dog1.family=" Husky";
	dog1.name="Budy";
	
	System.out.println("Your Dog name is "+dog1.name+" and age is "+dog1.age+" and family is "+dog1.family);
	System.out.println("your dog "+dog1.name);
	dog1.bark();
	dog1.catc();
	dog1.walk();
	
	}

	}


