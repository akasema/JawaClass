package com.Class9;

public class Trials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for (int i=1; i<6; i++){
//		      for (int j=1; j<6; j++){
//		        if (6-j>i){
//		          System.out.print(" ");
//		        }else {
//		          System.out.print(i);
//		        }
//		      }
//		      System.out.println();
//		        }
//		    
//		for (int i=1; i<5; i++){
//			System.out.println("");
//			for (int j=1; j<5; j++) {
//				
//				if (i==2 || i==3) {
//				 if (j==2 || j==3) {
//						System.out.print(" ");
//						}
//				 else{
//				System.out.print("$");
//				} 
//			}
//			}}
////		
		int n = 4;
        for(int i = 0; i < n; i++){
          
           System.out.print('$');
            
            for(int j = 0; j < n-2; j++){
              if(i > 0 && i < n-1){
                System.out.print(" ");
              }
              else{
                System.out.print('$');
              }
          }
          System.out.println('$');
        }
      }
}
		
	 
	


