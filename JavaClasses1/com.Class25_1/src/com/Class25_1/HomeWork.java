package com.Class25_1;

public class HomeWork {
	
	int areaRect(int a, int b)	{
	 int s=a*b;
		return s;
	}
	int areaSquare(int a) {
		int s=a*a;
		return s;
	}
	int areaBox(int a, int b, int c) {
	int s=a*b*c;
	return s;
	}
	void area(int a) {
		System.out.println("Area Of A Square is "+(a*a));
	}
	void area(int a,int b) {
		System.out.println("Area Of A Rect is "+(a*b));
	}
	void area(int a,int b, int c) {
		System.out.println("Area Of A Square is "+(a*b*c));
	}
}
