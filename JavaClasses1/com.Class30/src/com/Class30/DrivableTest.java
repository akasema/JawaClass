package com.Class30;

import com.Class30.Drivable.Toyota;

public class DrivableTest{
	public static void main(String[] args) {
		Drivable obj=new Toyota();
		obj.drive();
		// Drivable.DRIVE_FAST=false; final value cannnot be reassigned
		Toyota toyota=new Toyota();
		toyota.drive();
		toyota.stop();
	}
}


