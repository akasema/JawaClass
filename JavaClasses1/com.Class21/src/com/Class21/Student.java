package com.Class21;

public class Student {
	public String studentName;
	 public double GPA;
	 public String school;
	 
	 
	 public void displayInfo() {;
	System.out.println(studentName+" attending "+school+" has a GPA of:"+GPA);
	 }
	 
	 protected void study (int hours) {
		 System.out.println(studentName+" Studying "+hours);
	
	 }
}
