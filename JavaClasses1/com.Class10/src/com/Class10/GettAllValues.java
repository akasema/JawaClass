package com.Class10;

public class GettAllValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] animals= {"cat", "Dog","Cow","Snake","Elephant"};
		//i want to print all values from an array 
		//when value is reached dog --> i want to say i love dogs
		
		for (int i=0; i<animals.length; i++) {
			
				if (animals[i].equals("Dog")) { 
					System.out.println("I love Dogs");
				}else {
					System.out.println(animals[i]);
				}
				
		}		

	}

}
