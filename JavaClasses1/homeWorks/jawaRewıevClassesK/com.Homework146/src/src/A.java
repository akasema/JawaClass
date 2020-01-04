package src;

public class A extends Marks{

	int a,b,c;
	A(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	@Override
	int getPercentage(int a, int b, int c) {
		int percA=(a+b+c)/3;
	return percA;
	}
	@Override
	int getPercentage() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	int getPercentage(int a, int b, int c, int d) {
		// TODO Auto-generated method stub
		return 0;
	}

}
