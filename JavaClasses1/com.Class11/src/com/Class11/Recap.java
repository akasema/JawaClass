package com.Class11;

public class Recap {

	public static void main(String[] args) {
		// single dimension Array
// How we can express the arrays
		
//		int[] h=new int[3];
//		int e [];
//		int y[], u; // y is array, u is single variable
//		y=new int [3];		
//		u= 12 ; 
		String [] car1= {"mercedes", "Honda","Toyota"};//birinci yol 
		String [] car=new String[6];
		car[0]="Mercedes";
		car[1]="Masarati";
		car[2]="Honda";
		car[3]="Mazda";
		car[4]="Nissan";
		car[5]="Toyota";
		
		for (int i=0; i<=5; i++){
		
		System.out.println(car[i]);
	}
		int [] a= {1,3,4,6,7,8};
		int sum=0;
		
		for (int j=0; j<6; j++) {
		sum = sum + a[j];		
		}
		System.out.println(sum);		
	
	 String [] country1= {"Russia", "Turkey", "USA"};
	 for (int k=0; k<3; k++) {
		
	switch(country1[k]) {
	 
	  case "Russia":
		  System.out.println("Moscow");
		 
		break;
	  case"Turkey":
		  System.out.println("Ankara");
		  break;
	  case"USA":
		  System.out.println("WasDC");
		  break;
	 }
	 }
		
		  String [] country= {"Turkey", "USA", "Germany"};
	        
	        for(int i=0; i<country.length; i++) {
	            
	            switch(country[i]) {
	            case "Turkey":
	            System.out.println("Ankara");
	            break;
	            case "USA":
	            System.out.println("Washington DC");
	            break;
	            case "Germany":
	            System.out.println("Berlin");
	            break;
	            }
	            System.out.println("********");
	            
	        for(String cap:country) {
	            switch(country[i]) {
	            case "Turkey":
	            System.out.println("Ankara");
	            break;
	            case "USA":
	            System.out.println("Washington DC");
	            break;
	            case "Germany":
	            System.out.println("Berlin");
	            break;
	            }
	            System.out.println(cap);
	        }
	}
	
}}