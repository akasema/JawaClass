package com.class5;

public class SwitchCarOrigine {
	import java.util.Scanner;
	
	  public static void main(String[]Arg){
	    
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Please enter your favorite car make");
	    String carMake=scan.nextLine();
	    String carOrigin;
	    
	    switch(carMake){
	      
	      case("BMW"):
	        carOrigin="german car";
	        break;
	        
	      case("Toyota"):
	        carOrigin="japanese car";
	        break;
	      
	      case("Maserati"):
	        carOrigin="italian car";
	        break;
	      
	      default:
	        carOrigin="unknown";
	        break;
	    }
	    System.out.println("Your favorite car is " + carOrigin);
	  }

	}

}
