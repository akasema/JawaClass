package com.Class18;

public class Hello {
	
	void sayHello(String name) {// method with parameters
		System.out.println("Hello "+name);
	}

	public static void main(String[] args) {
		
		Hello obj=new Hello();
		obj.sayHello("Kadir");
		obj.sayHelloDiffLang("Turkey");
		
		obj.sayNameAndAge("Jack", 29);
		obj.isSnow(false);
		
	}
	/*create a method that will say Hello in different language
	 * based on the value that will be passed when  user calls a method
	 */
	void sayHelloDiffLang(String country) {
		
		switch (country.toLowerCase()) {
			case"usa":
			System.out.println("Hello");
			break;
		
		case"turkey":
			System.out.println("Merhaba");
			break;
		case"russia":
			System.out.println("Privet");
			break;
			default:
			System.out.println("i dont know");
		}
	}
	//method to say name and age
	
	void sayNameAndAge(String name, int age) {
		System.out.println("My name is "+name+" and i am "+age+" years old.");
	}
	// Create a method that will check if it is snowing
	// if it is snow--> stay at home 
	//otherwise go for walk 
	void isSnow(boolean isSnow) {
				
		if (isSnow) {
			System.out.println("Stay at home");
		}else {
			System.out.println("Go for walk");
			
		}
		
	}
}
