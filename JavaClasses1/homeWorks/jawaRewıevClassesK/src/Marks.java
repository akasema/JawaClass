
public abstract class Marks {
	abstract double getPercen();

	public static void main(String[] args) {
		Marks obj=new StudentA(60,80,90);
		double a=obj.getPercen();
		System.out.println("Student A average is="+a);
		
		Marks obj1=new StudentB(60,80,90,95);
		double b=obj1.getPercen();
		System.out.println("Student B average is="+b);
	}
}

