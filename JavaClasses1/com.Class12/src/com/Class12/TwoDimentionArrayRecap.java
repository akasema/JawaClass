package com.Class12;

public class TwoDimentionArrayRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array1= new int[2][3];
		//first row
		array1[0][0]=9;
		array1[0][1]=10;
		array1[0][2]=20;
		
		//second row
		 array1[1][0]=9;
		 array1[1][1]=10;
		 array1[1][2]=11;
		 
		 for (int i[]: array1) {
			 for (int j:i) {
				 System.out.println(j);
			 }
		 }
		System.out.println("==============");
		
		int[][] array2= {
				{44,55,67},
	            {11,22,33}    
	        };
	        
	        for (int[] i : array2) {
	        	System.out.println(" ");
	            for (int j : i) {
	                System.out.print(j+" ");
	            }
	        }
	        System.out.println("00000000000000"+array2.length);
	        
	        for (int i=0; i<array2.length; i++) {
	        	System.out.println(" ");
	            for (int j=0; j<=array2.length; j++) {
	                System.out.print(array2[i][j]);
	            }
	        }
	        System.out.println(array2.length);

	}

}
