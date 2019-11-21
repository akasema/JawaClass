package com.Class7;

public class WhileLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i=1;
		//while (i<=20) {
			//System.out.print(i+",");
			//i++;
		//}
int b=1;
 while  (b<=20) {
	 System.out.print(b+" ");
	 b++;
 }
 int z=2;
 while (z<=20) {
	 System.out.print(" z="+ z);
	 z+=2;//increment by 2 
 }
 int q=1;//sadece cift sayýlarý al dersek 
 while (q<=20) {
	 if (q%2==0) {
		 System.out.print(" q="+q);
	 }
	 q++;
 }
 int w=50;//sadece tek sayýlarý al dersek 
 while (w<=100) {
	 if (!(w%2==0)) {
		 System.out.print(" w="+w);
		
	 }
	 w++;
	 
 }
 System.out.println(" ");
 int e=100;
 while (e>=1) { //sadece even numbers
	 if ((e%2==0)) {
		
		 System.out.print(" e="+e);
		
	 }
	 e--;
	 
 }
	}

}
