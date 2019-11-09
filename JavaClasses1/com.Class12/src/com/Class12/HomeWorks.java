package com.Class12;

public class HomeWorks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[][] a = {
				{1.4,2.0,3.3,2},
				{4,1.5,6.1,1},
				{1.2,3.1,4,1.6}
			};
		double b;
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<=a.length; j++) {
				
				b=a[i][j]*2;
				System.out.print(b+";");
			}
			System.out.println(" ");
		}
		
	}

}
