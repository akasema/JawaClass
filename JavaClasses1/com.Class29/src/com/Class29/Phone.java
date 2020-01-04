package com.Class29;

public abstract class Phone {
	//implemented Medthods
	public void makeCall() {
		System.out.println("Any phone Make Call");
	}
	public void sendText() {
		System.out.println("Any phone Send Text");
	}
	//unimplemented Methods
	public abstract void tekePictures();
	public abstract void playGames();
}
//concrete class
class iPhone extends Phone{

	@Override
	public void tekePictures() {
		System.out.println("Iphone can not take good pictures");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playGames() {
		System.out.println("Iphone can not play good games ");
		// TODO Auto-generated method stub
		
	}
}
class Samsung extends Phone{

	@Override
	public void tekePictures() {
		System.out.println("Samsung can take good pictures");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playGames() {
		System.out.println("Samsung can play good games");
		// TODO Auto-generated method stub
		
	}
	
}