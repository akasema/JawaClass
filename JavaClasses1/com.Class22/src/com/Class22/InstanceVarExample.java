package com.Class22;

public class InstanceVarExample {
	
	String myInstanceVar="instance variable";
		int aa;
	  String name;
	  float salary;
	  boolean value;
	  double age;
	
	public static void main(String args[]){
		InstanceVarExample obj = new InstanceVarExample();
		InstanceVarExample obj2 = new InstanceVarExample();
		
		System.out.println(obj.myInstanceVar);
		System.out.println(obj2.myInstanceVar);
		
		obj2.myInstanceVar = "Changed Text";
		System.out.println(obj.myInstanceVar);
		System.out.println(obj2.myInstanceVar);
		
		InstanceVarExample a1=new InstanceVarExample();
	    System.out.println(a1.aa);
	    InstanceVarExample name1=new InstanceVarExample();
	    System.out.println(name1.name);
	    InstanceVarExample salary1=new InstanceVarExample();
    System.out.println(salary1.salary);
    InstanceVarExample value1=new InstanceVarExample();
    System.out.println(value1.value);
    InstanceVarExample age1=new InstanceVarExample();
    System.out.println(age1.age);
		
		
		}
	}


