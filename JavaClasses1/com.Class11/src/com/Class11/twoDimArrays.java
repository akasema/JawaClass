package com.Class11;

public class twoDimArrays {
	public static void main(String[] args) {
		
		int [] [] array=new int[3][4];
		//1st row 
		array [0][0]=10;
		array [0][1]=11;
		array [0][2]=12;
		array [0][3]=3;
		//2nd row
		//3rd row
		//4th row
		
		//ikinci yaz�m �ekli
		
		int [][] numbers= {
				{8,7,5,3,8},
				{1,5,6,4,9},
				{3,6,8,0,7}
				};
				
							
				System.out.println("The value in index 1 and 4 is"+numbers[1][4]);	
				//to identify the numbers of rows
				System.out.println("The Number of rows are="+numbers.length);
				//to identify the numbers of columns/elements in a row
				System.out.println("The Number of columns are="+numbers[0].length);
		
				System.out.println("-----------------");
			for (int i=0; i<numbers.length; i++) {
				for (int j=0; j<numbers[i].length; j++) {
					System.out.print(numbers[i][j]);
				}
				System.out.println(" ");
			}
				
	}
	
	}
		
	


