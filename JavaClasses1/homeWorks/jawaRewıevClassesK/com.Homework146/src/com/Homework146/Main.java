package com.Homework146;
import java.util.Scanner;
//public class Main {
//	public static void main(String[] args) {

//		A obj1=new A();
//		obj1.print();
//		B obj2=new B();
//		obj2.print();
//		C obj3=new C();
//		obj3.print();
//		
//		Y obj=new Y();
//	    obj.methodY("Class Y");
//		
//		
//		    C objC=new C();
//			    objC.C();
//			    
//			  }

//		public void meth1(boolean b1){
//		    System.out.println("Final method with boolean parameter");
//		  }
//		  public void meth1(String str){
//		      System.out.println("Final method with String parameter");
//		    }
//		    public static void main(String[]arg){
//		      Main obj=new Main();
//		      obj.meth1(false);// main method bu þlekilde kullanýlýyor
//		      obj.meth1("String");
//}
// 

//	Main (){
//	    System.out.println("Welcome to the syntax solutions");
//	  }
//	Main (String str){
//	   System.out.println("I am the student in syntax solutions");
//	  }
//	  
//	  public static void main(String[] args) {
//	  
//	    Main obj=new Main();// Main Class bu þekilde kullanýlýyor
//	    Main obj1=new Main("Hello"); 
//	  }
//		 Parent obj=new Child();
//		 obj.printInfo();
//}
		public class Main {
//			  public static void main(String[]args){
//			    Parent obj=new Child();
//			    obj.method();
				  
		  public final void meth(int a, int b){
				     int sum=a+b;
				      a=b;
				      b=sum-b;
				      System.out.println("a="+a+" and "+"b="+b);
				        }

				  public static void main(String[]args){
				    Scanner scan=new Scanner(System.in);
				    int a=scan.nextInt();
				    int b=scan.nextInt();
				    Main c=new Main();
				    c.meth(a,b);
				    
				  }
				    				  
			  }



