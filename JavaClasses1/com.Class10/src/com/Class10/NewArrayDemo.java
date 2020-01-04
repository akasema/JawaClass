package com.Class10;

import java.util.Scanner;

public class NewArrayDemo {
	public static void main(String[] args) {
		
//	
	 Scanner scan=new Scanner(System.in);
//	  String[] days1=new String[7];
//    for (int j=0; j<=6; j++){    	
//       System.out.println("Please Enter the day "+j+" of the week");
//       days1[j]=scan.nextLine();		
//	    }
//   
//    for (int i=0; i<7; i++){    	
//        System.out.println(days1[i]);
//        }  
		
		
		  
		  int [] in=new int[5];
			
			for (int i=0; i<5; i++){
			  in[i]=scan.nextInt();
			}
			for (int j=4; j>=0; j--){
			  System.out.println(in[j]);
			}
			
		
}
}