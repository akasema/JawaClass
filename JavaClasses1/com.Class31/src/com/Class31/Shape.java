package com.Class31;

public interface Shape {
	double pi=3.14;
	public void calculateArea();
	public void calculatePerimeter();

}
class Circle implements Shape{
	public double areaCircle(int dia) {
		return pi*(dia*dia);
	}
	public double areaRect(double side1, double side2) {
		return side1*side2;
	}
	public double perimCircle(double dia) {
		return 2*pi*dia;
	}
	public double perimRect(double side1,double side2) {
		return 2*(side1+side2);
	}
	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		
	}
}