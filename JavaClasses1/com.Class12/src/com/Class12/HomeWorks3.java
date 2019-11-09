package com.Class12;

public class HomeWorks3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = {
				{5,2,3,7},
				{1,5,2,2},
				{1,2,3,4}
			};
			
	     //should print 10
		 int sum = 0;
	     for (int j=0; j<=a.length; j++){
	    	 sum=sum+a[2][j];
	   	   } System.out.println(sum);
			
		
	}

}
