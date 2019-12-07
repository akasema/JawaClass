package com.Class27;

public class TestStudent {

	public static void main(String[] args) {
		
		Student st1=new Student();
		st1.study();
		//st1.homeworks();// hommework private oldugundan buradan ulaþamýyoruz
				
		Student st2=new CollegeStudent();
		st2.study();
		//st2.homeworks();
		st2.attendClass();
		st2.research();
		
		SyntaxStudent ss=new SyntaxStudent();
		ss.study();
		ss.attendClass();
		//ss.homeworks();
		ss.research();
	 
		Student st3=new SyntaxStudent();
		
		//st3.homeworks();// hommework private oldugundan buradan ulaþamýyoruz
		
	}

}
