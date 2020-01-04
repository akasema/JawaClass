package com.Class7;

public class DowhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num=1;
		
		//while(num<7) {//while checks condition in the first step
			//System.out.print(" num"+num); 
			//num++;
		//}

		int num1=20;//initialze variable
		do { // do checks the condition at the end
			
			if (num1%2==0) {
				System.out.print(" even:" +num1);//execute commands
			}			
			num1++;
			
		}while(num1<=50);//check the condition
	}

}
