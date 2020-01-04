package src;
	
public class Square implements Shape{
	int a;
	Square(int a){
		this.a=a;
	}
	@Override
	public double calculateArea() {
		double sqArea=a*a;
		return sqArea;
	}

	@Override
	public double calculatePerimeter() {
		double sqPerim=4*a;
		return sqPerim;
	}

}
