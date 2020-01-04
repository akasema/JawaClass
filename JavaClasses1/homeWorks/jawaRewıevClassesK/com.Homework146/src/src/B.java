package src;

public class B extends Marks{
	int a,b,c,d;
	B(int a,int b,int c,int d){
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}

	@Override
	int getPercentage(int a, int b, int c,int d) {
		int percB=(a+b+c+d)/4;
	return percB;
	}

	@Override
	int getPercentage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	int getPercentage(int a, int b, int c) {
		// TODO Auto-generated method stub
		return 0;
	}

}
