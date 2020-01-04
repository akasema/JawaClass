package com.Class19;

import java.util.Scanner;


public class Tasks {
	
//	Create e mail.
	
	String name, surname,eMailType;
	
	void createMail(String name, String surname,String emType) {
		String emailBody=name+surname;
		switch (emType){
		case ("gmail"):
			System.out.println(emailBody+".gmail.com");
		break;
		case ("yahoo"):
			System.out.println(emailBody+".yahoo.com");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tasks newMail=new Tasks();
		newMail.createMail("kadir", "gok1", "gmail");		
		
		IsPrime prm1= new IsPrime();
		System.out.println(prm1.isPrm(4));
		
		Student newSt1=new Student();
		System.out.println(newSt1.getGrade(35));
		
		
	}

}
