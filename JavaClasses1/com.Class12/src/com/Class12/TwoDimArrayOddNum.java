package com.Class12;

public class TwoDimArrayOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] array= {
				{1,3,4,6},
				{2,5,6,7},
				{4,5,7,8},				
		};
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<=array.length; j++) {
				if (array[i][j]%2==0) {
					System.out.println("Even Numbers Of Array "+ array[i][j]);
					
			}
						
			}
			
			}
		
	}

}