package src;

public abstract class Marks {
	abstract int getPercentage();

	abstract int getPercentage(int a, int b, int c, int d);

	abstract int  getPercentage(int a, int b, int c);

	public static void main(String[] args) {
		Marks objA=new A(60,70,80);
		int percA=objA.getPercentage(60,70,80);
		System.out.println(percA);
		
		Marks objB=new B(60,70,80,90);
		int percB=objB.getPercentage(60,70,80,90);
		System.out.println(percB);
	}
}
