package com.Class21;

public class School {
	public static void main(String[] args) {
		
	Student student1=new Student();
		
		student1.studentName="Erick";
		student1.GPA= 3.95;
		student1.school ="Syntax";
		
	Student student2 = new Student();
		student2.studentName="Jaime";
		student2.GPA=3.90;
		student2.school="Syntax";
		
		
		int hours=3;		
		student1.displayInfo();
		student1.study(hours);
		
		hours=5;
		student2.displayInfo();
		student2.study(hours);
		
	}
	

}
