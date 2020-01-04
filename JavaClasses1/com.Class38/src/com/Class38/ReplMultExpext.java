package com.Class38;

public class ReplMultExpext {
	public void comparingNumber(int num) {
		if (num>10) {
			try {
			System.out.println("Number is greater that 10");
		
			}catch(ArithmeticException e) {
				
				System.out.println("Number is less than 10");
			}
			
		}else {
			System.out.println("Number is less than 10");
			
			}
			
	}
	public static void main(String[] args) {
		ReplMultExpext comp=new ReplMultExpext();
		comp.comparingNumber(9);
	}

}
