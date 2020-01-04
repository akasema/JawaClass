package com.Class31;

public class Main implements Functions {

	@Override
	public void displParam() {
		System.out.println("Result is ::: "+result);
	}

	@Override
	public double addParam(double firstNumber, double secondNumber) {
		double result=firstNumber+secondNumber;
		return result;
	}

	@Override
	public double subtractPar(double firstNumber, double secondNumber) {
		double result=firstNumber-secondNumber;
		return result;
	}

	@Override
	public double multiplyPar(double firstNumber, double secondNumber) {
		double result=firstNumber*secondNumber;
		return result;
	}

	@Override
	public double dividePar(double firstNumber, double secondNumber) {
		double result=firstNumber/secondNumber;
		return result;
	}public static void main(String[] args) {
		Main obj=new Main();
	
		System.out.println("Result is ::: "+obj.addParam(100.0, 20.0));
		System.out.println("Result is ::: "+obj.subtractPar(100.0, 20.0));
		System.out.println("Result is ::: "+obj.multiplyPar(100.0, 20.0));
		System.out.println("Result is ::: "+obj.dividePar(100.0, 20.0));
	}	
}

