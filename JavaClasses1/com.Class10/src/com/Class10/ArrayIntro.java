package com.Class10;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;//normal integer
		a=10;
		
		int [] b; //Deceleration of an array 
		int c []; //other way of decleration
		//b=[19],[20],[30],[40]
		b=new int[4];//Initialing array saying it has 4 values
		// or we can do all in one line(declaration and initialization)
		int[] array=new int[4];//array is name of array we defined
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		
		System.out.println(array[2]);
		
		//array to store classes
		String[] classes=new String[4];
		classes[0]="Java";
		classes[1]="SDLC";
		classes[2]="Manual Testing";
		classes[3]="GIT";
		//Today we have java class
		System.out.println("Today we have "+classes[0]+ " class");
		
		int[] nums=new int[3];
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		//how can we change 1 to 100?
		nums[0]=100;
		System.out.println(nums[0]);//100 basar
		System.out.println(nums[0]+nums[2]);
		// size of an array is fixed
		String[] names=new String[3];
		names[0]="Diana";
		names[1]="Seda";
		names[2]="Jaime";
		//names[3]="Olga";// bu Arrayýn içinde deðil bu 4. deðiþken
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
		//at com.Class10.ArrayIntro.main(ArrayIntro.java:45)
		// bu hatayý verir ArrayIntro classýnýn içinde 45. satýrda hata var )

		System.out.println(names[2]);
	}

}
