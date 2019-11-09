package com.Class12;

public class SingleArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array1=new int[4];
		array1[0]=12;
		array1[1]=13;
		array1[2]=14;
		array1[3]=14;
		
		int [] array2= {2,5,4,7};
		
		for (int s=0; s<4; s++) {
			System.out.print(array1[s]);
		}
		System.out.println();
		System.out.print(" -------------------");
		System.out.println();
		
		for (int i:array1) {// Array da loop un baska þekli
			System.out.print(i);
		}
		
	}

}
