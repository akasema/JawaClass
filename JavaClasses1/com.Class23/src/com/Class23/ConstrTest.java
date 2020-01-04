package com.Class23;

import com.Class24.ConstructorDemo;

public class ConstrTest {

	public static void main(String[] args) {
		//bu constructorlar  burada çalýþmaz hata verir
		//çünkü sadece o class içinde kullanýlýr 
		ConstructorDemo obj = new ConstructorDemo();		
		ConstructorDemo obj2 = new ConstructorDemo(123, "String");
		ConstructorDemo onbj =new ConstructorDemo(456);
		ConstructorDemo obj3 = new ConstructorDemo("String");
	}

}
