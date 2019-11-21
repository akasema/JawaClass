package com.Class17;
public class ObjectsOfCarClass {
	public static void main(String[] args) {
		// TO create an object syntax is;
		//ClassName variable =new ClassName();  as;
		//String str=new String();
		
	Car car1=new Car();
		car1.make="Tesla";
		car1.model="S3";
		car1.year=2020;
		car1.color="Black";
		car1.wheels=4;
		car1.windows=5;
		car1.speed=200;
		
//Accessing behavior to first object
		car1.start();// calling the start method in the Car class
		car1.accelerate();
		car1.drive();
		
		
		System.out.println("***********************");
	Car car2=new Car();
		car2.make="BMW";
		car2.model="i8";
		car2.year=2019;
		car2.wheels=4;
		car2.windows=6;
		car2.speed=300;
		car2.make="Toyota";
		
//Accessing behavior to second object
		car2.start();
		car2.accelerate();
		car2.drive();
		
		
		//print features of the car
				// I have black Tesla
				System.out.println("I have "+car1.color+" "+car1.make);
				//I drive bmw 2019
				System.out.println("I drive "+car2.make+" "+car2.year);
				//Bus bus1=new Bus();
				

	}

}
