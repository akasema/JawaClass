package com.Class21;

//class SubClass{
//	  //Declare variables here
//	  protected int integerNumber = 222;
//	  
//	  protected int prnVar(){
//	    System.out.println(integerNumber);
//	  
//	  return integerNumber;
//	  }
//	}
//
//	class Main {
//	  public static void main(String[] args) {
//	    SubClass twice=new SubClass();
//	   twice.prnVar();
//	   int i1=twice.prnVar();
////	   System.out.println(i1);
//	    
//	  }

//class Main {
//	  
//private String prv(){
//    String name="private";
//    return name;
//    }
// void def(){
//   System.out.println("default");
//   }
//protected String pro(){
//    String name="protected";
//    return name;
//    }
//public void pub(){
//     System.out.println("public");
//   }
//   
//   public static void main(String[]args){
//     
//     Main mn=new Main();
//     mn.prv();
//     
//   }
//   
//}
class Main  {
	  private int batch=3;
	private String name="SyntaxSolutions";

	public static void main(String[]args) {

	Main nVar=new Main();
	int nBatch=nVar.batch;
	String n1=nVar.name;
	System.out.println(nBatch);
	System.out.println(n1);
	}
}
	