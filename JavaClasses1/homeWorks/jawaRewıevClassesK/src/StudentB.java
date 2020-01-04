
public class StudentB extends Marks{
	
	double a,b,c,d;
	StudentB(double a,double b, double c, double d){
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		
	}

	@Override
	double getPercen() {
		double averageB=(a+b+c+d)/4;
		return averageB;
	}

}
