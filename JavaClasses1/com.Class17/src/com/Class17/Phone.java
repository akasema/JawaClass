package com.Class17;

public class Phone {
	String type, brand, model;
	int screenSize, ram, speed;
	
	void playMusic() {
		System.out.println("My Phone "+brand+" can play Music");
	}
	void showMovies() {
		System.out.println("My phone "+brand+" and "+model+" can Show Movies in its screen"+screenSize+" inch");
	}
	
public static void main(String[] args) {
	Phone phn1=new Phone();
	phn1.type="Andrid";
	phn1.brand="Samsung";
	phn1.model="Note8";
	phn1.screenSize=16;
	
	System.out.println("I am using "+phn1.type+" of phone"+" with "+phn1.brand+" brand"+" and "+ phn1.model+" model");
	
	phn1.playMusic();
	phn1.showMovies();
	
		}

}
