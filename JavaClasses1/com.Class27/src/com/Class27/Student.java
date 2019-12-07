package com.Class27;

public class Student {
	public void study() {
		System.out.println("Study Classes");	}
	private void homeworks() {
		System.out.println("Does Homeworks");	}
	protected void research() {
		System.out.println("Stu do research");	}
	public void attendClass() {
		System.out.println("Student attends Class");}
	}

class SyntaxStudent extends Student{
	@Override
	public void study() {
		System.out.println("Syntax students Study Classes");	}
	@Override
	public void research() {
		System.out.println("Syntax students do research");	}	
	@Override
	public void attendClass() {
		System.out.println("Syntax students Student attends Class");}
}
class CollegeStudent extends Student{
	public void play() {
		System.out.println("Plays Football");	}	}

class SchoolStudent extends Student{
	public void walkToSchool() {
		
	}



}
