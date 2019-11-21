package com.Class22;
public class StaticVsNonStatic {
    // template for a students (school, name, grade)
    static String school = "Syntax";
    String name="Kadir";
    char grade='A';
    //instance method, non static
    void getInfo() {
        System.out.println("My name is " + name + " and I am going to " 
                            + school + " and my grade is " + grade);
    }
    //static method
    static void getInfo1() {
        System.out.println("I am attending classes at "+school);
    }
    
    public static void main(String[] args) {
        /* accessing static members within same class
         * --> just use name for a variable
         * or call method by its name only
         */
       StaticVsNonStatic obj1=new StaticVsNonStatic();//Non Static variable yi bu þeklde tanýmlaman lazým
        obj1.getInfo();
    	System.out.println(school);
        getInfo1(); //Static variableyi dogrudan çaðýarbilirsin
    }
}

