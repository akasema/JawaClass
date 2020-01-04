package com.Class30;


public interface Main{
	 @Override
	  public void parentMethod();
	  @Override
	  public void childMethod(){
	    System.out.println("Child Method-----hi syntax solutions how are you");
	  }
	  
	  public static void main(String[] args) {
	    Main obj=new Main();
	    obj.parentMethod();
	    obj.childMethod();
	    
	  }
	}

