package com.Class25_1;

public class CalculateArea extends HomeWork{
	public static void main(String[] args) {
		
		HomeWork calc=new HomeWork();
		
		System.out.println("Area of Rect is "+ calc.areaRect(2, 4));
		
		System.out.println("Area Square is "+ calc.areaSquare(2));

		System.out.println("Area Box is "+ calc.areaBox(2, 4, 6));
		System.out.println("**************other overloading Methos*****");
		calc.area(4);
		calc.area(2, 4);
		calc.area(3, 4, 5);
	}

}
