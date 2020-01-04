package com.Class31;

public class AccountTest {
//
//	public static void main(String[] args) {
//		
//			
//			Account acc=new Account();
//			acc.setAccountNumber(12345678);
//			long accountNum=acc.getAccountNumber();
//			System.out.println(accountNum);
//			
//			acc.setBalance(-200);
//			double myBalance=acc.getBalance();
//			System.out.println(myBalance);
//			
//			
//			int num=123;
//			String.valueOf(num); //converts given value to String
//		}
//	
	public static void main (String[]args){
		Account emp=new Account();
		emp.setEmpName("John");
		String e1=emp.getEmpName();
		emp.setEmpAge(30);
		int empAge=emp.getEmpAge();
		System.out.println("Employee Name: "+e1);
		System.out.println("Employee Age: "+empAge);
		}
		}	



