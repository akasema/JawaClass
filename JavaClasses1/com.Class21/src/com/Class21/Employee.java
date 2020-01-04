package com.Class21;

public class Employee {
	public int eID;
	public int salary;	
	static String CEO;

   
	public void displayInfo() {;
	System.out.println(eID+" is working with salary "+salary+" and his Boss is "+CEO);
	 }
	
	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.eID= 12345;
		emp1.salary=1000;
		emp1.CEO="Sumair";
		
		emp1.displayInfo();
		
	}

}
