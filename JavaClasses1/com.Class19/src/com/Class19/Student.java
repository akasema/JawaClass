package com.Class19;

public class Student {
	
	char grade;
	
	char getGrade(int score) {
		
	char getGrade = 0;
	
	if (score>90) {
		getGrade='A';
	}else if (score>80) {
		getGrade='B';
	}else if (score>70) {
		getGrade='C';
	}else if (score>50) {
		getGrade='D';
	}else {
		getGrade='F';
	}
	
	return getGrade;	
	}	
	

}
