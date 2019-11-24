package com.Class24;

public class Country {
	
	public String capital, name;
	public int population;
	public Country(){
		System.out.println("I am non argument constructor");
	}
	Country(String name, String capital, int population) {
		this.name=name;
		this.capital=capital;
		this.population=population;
	}
	public void displayInfo() {
		System.out.println(name+" "+capital);
	}
	//break till 11:45
	public static void main(String[] args) {
		Country country1=new Country("USA", "Washington DC", 350);
		Country country2=new Country("Kazakhstan", "Astana", 18 );
		Country country3=new Country();
		country1.displayInfo();
		country2.displayInfo();
		country3.displayInfo();

}
}