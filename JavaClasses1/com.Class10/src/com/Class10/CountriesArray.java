package com.Class10;

public class CountriesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] countries= {"Turkey", "USA","Russia","Canada"};//if le de yapýlabiir switch le de 
		
	for (int i=0; i<countries.length; i++) {
			
		switch(countries[i]) {
		
		case "USA":
			System.out.println(countries[i]+" Capital is Washington DC");
			break;
		case "Turkey":
			System.out.println(countries[i]+" Capital is Ankara");
			break;
		case "Russia":
			System.out.println(countries[i]+" Capital is Moscow");
			break;
		case "Canada":
			System.out.println(countries[i]+" Capital is Montreal");
			break;
		}
	}
	}

}// next class 2d arrays and advanced for loop 
