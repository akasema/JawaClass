package com.Class28;

public class Apple extends Device{
	 
	public Apple(String deviceType, String name) {
		super (deviceType, name);
		
		}
		
 public void printInfo() {
	 
	 System.out.println(deviceType+name);
 }

 public static void main(String[]args) {
		Apple dev=new Apple("IPhone ", " x11");
		dev.printInfo();
		
	}

}