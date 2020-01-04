package src;

public class TestShapes {

	public static void main(String[] args) {
	Shape obj1=new Circle(3);
		double area=obj1.calculateArea();
		System.out.println("Circle Area is "+area);
		double perimeter=obj1.calculatePerimeter();
		System.out.println("Circle perimeter is "+perimeter);
	System.out.println("**************************");
	Shape obj2=new Square(2);
		double sqArea=obj2.calculateArea();
		System.out.println("Square Area is "+sqArea);
		double sqPerim=obj2.calculatePerimeter();
		System.out.println("Square perimeter is "+sqPerim);
	
	}

}
