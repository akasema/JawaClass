package com.Class24;

public class TestChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 child1=new Child1();
		System.out.println(Child1.race);
		System.out.println(child1.eyeColor);
		child1.sing();
		child1.code();
		
		Parents parent=new Parents();
		System.out.println(parent.eyeColor);
		System.out.println(parent.hairColor);
		parent.sing();
		//parent.code();// bu çalýþmaz çunku parent ten child a ulaþamýyor 
		//ama child parente veraset (inheritance yoluya ulaþýyor
		

	}

}
