package com.Class25;

public class Test {
	public static void main(String[] args) {
	System.out.println("Creating an object of Employee class");
	Employee emp=new Employee();
	emp.salary=70000;
	Employee.companyName="Syntax";
	emp.work();
	emp.getPaid();
	
	System.out.println("Creating an object of ScrumTeam class");
	ScrumTeam sm=new ScrumTeam ();
	sm.salary=90000;
	sm.work();
	sm.getPaid();
	sm.artifacts=" Product Backlog, Srint Backlog, Burndown Charts";
	sm.ceremonies="Sprint Demo, planning, retro, Daily Meetings";
	sm.attendScrumMeetings();
	
	System.out.println("Creating an object of Developer class");
	Developer dev=new Developer();
	dev.salary=130000;
	dev.work();
	dev.getPaid();
	dev.code();
	
	dev.artifacts="Sprint Backlog";
	
	System.out.println("Creating an object of Tester class");
	Tester tst=new Tester();
		tst.salary=15000;
		tst.work();
		tst.getPaid();
		tst.test();
		
	}
	
	}

}
