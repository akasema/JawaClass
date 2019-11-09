package com.Class12;

public class BigInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
			};
	//should be 8
	int high=0;
	for (int i=0; i<3; i++){
	  for (int j=0; j<=a.length; j++){
	    if (a[i][j]>high){
	      high=a[i][j];
	    }
	    
	  }
	}System.out.println(high);


		
	}

}
