package com.Class26;

public class Degree {
	public void GetDegree() {
		System.out.println("I got a degree ");
	}
	public static void main(String[] args) {
		UnderGraduate dgr=new UnderGraduate();
//		System.out.println("I am an Undergraduate");
//		dgr.GetDegree();
		dgr.gDegree();
	
		PostGraduate dgr1=new PostGraduate();
		System.out.println("I am a Postgraduate");
		dgr1.GetDegree();
	}
	
}


class UnderGraduate extends Degree{
	public void gDegree() {
		System.out.println("I am in UnderGraduate");
		}
	}

class PostGraduate extends Degree {
	public void gDegree() {
	System.out.println("I am in UnderGraduate");
		
	}
}