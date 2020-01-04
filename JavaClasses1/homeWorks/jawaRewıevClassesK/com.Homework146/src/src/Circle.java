package src;

public class Circle implements Shape{
	int r;
	Circle(int r){
		this.r=r;
	}
	@Override
	public double calculateArea() {
		double area=3.14*r*r;
		return area;
	}

	@Override
	public double calculatePerimeter() {
		double perimeter=2*3.14*r;
		return perimeter;
		
	}
}
