package com.Class17;

public class Computer {
	// define features , attributes
	String brand, name, mouse;
	int scrSize, memory, ram, cpu;
	boolean keyboard;
	
	// define behavior, actions
	void playGames() {// method header
		//method body
	System.out.println("I can do play Game on my "+ name);
	}
	void javaCoding() {// method header
			//method body
		System.out.println("I can do java cooding on my "+ name);		
	}	
	void watchMovies() {// method header
				//method body
		System.out.println("I can do watch Movies on my "+ name);
	}
	public static void main(String[]Arg) {
		Computer comp1=new Computer();
		comp1.brand="Apple";
		comp1.name="MacBook Pro";
		comp1.memory=250;
//Accessing behavior to first object		
		comp1.javaCoding();
		comp1.watchMovies();
		comp1.playGames();
		
		System.out.println("I have "+comp1.brand+" "+comp1.name);
		
		System.out.println("Creating of 2nd objects of computer type--- ");
		
		Computer comp2=new Computer();
		comp2.brand="Dell";
		comp2.name="420 Pro";
		comp2.memory=125;
//Accessing behavior to second object		
		comp2.javaCoding();
		comp2.watchMovies();
		comp2.playGames();
		
		
		
		
	}

}
