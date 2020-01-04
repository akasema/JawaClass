package com.Class30;

public interface Drivable {// interfaces look like class but some bigger thing than it
	//interfaces can only have abstruct (unimplemented)methods
	//interface variables are public static final variables
	boolean DRIVE_FAST=true;// constatnlarý genelde böyle upercase yazýyorlar mecbur deðil
	
	//public abstract void drive(); boyle yazacaðýna compiler default olarak public ve abstructý yazar
	void drive();// public ve abstruct default olarak eklidir.
class Cars{
	public void stop() {
		System.out.println("Car stop by pressing break");
	}
}
class Toyota extends Cars implements Drivable{
	@Override
	public void drive() {// you can not reduce visibility you can not make this protected.
		System.out.println("Toyota can drive");
		}
	}
}
