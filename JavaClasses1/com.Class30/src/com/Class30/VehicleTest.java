package com.Class30;

public class VehicleTest {

public static void main(String[] args) {
		
//		Car car=new BMW();
//		car.drive();
//		car.stop();
//		car.start();
//		car.speed();
//		car.breaking();
//		
//		Vehicle vehicle=new BMW();
//		vehicle.drive();
//		vehicle.stop();
//		vehicle.start();
//		vehicle.speed();
		BMW bmw=new BMW("767jbh676","Sedan", "BMW", "X6");
		bmw.display();
		bmw.start();
		bmw.stop();
		bmw.speed();
		Vehicle car1=new BMW("iyjwsd56","Truck", "BMW", "X5");
		car1.drive();
		car1.speed();
		car1.start();
		car1.stop();
		Vehicle car2=new BMW("iyjwsd56","Truck", "BMW", "X5");
		car2.drive();
		car2.speed();
		
		Vehicle.displayTotal();
		
}
}



