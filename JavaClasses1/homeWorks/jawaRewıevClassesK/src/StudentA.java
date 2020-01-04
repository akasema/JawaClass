
public class StudentA extends Marks{
	
	double a,b,c;
	StudentA(double a,double b, double c){
		this.a=a;
		this.b=b;
		this.c=c;
		
		
	}
	
	@Override
	double getPercen() {
		double averageA=(a+b+c)/3;
		return averageA;
	}

}
