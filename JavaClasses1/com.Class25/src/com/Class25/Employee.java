package com.Class25;

public class Employee {
	protected int employeeId;
	int salary;
	static String  companyName;
	
	void work() {
		System.out.println("I am working is "+companyName+" Company");
		}

	void getPaid() {
		System.out.println("I get paid "+salary);
		}
}
