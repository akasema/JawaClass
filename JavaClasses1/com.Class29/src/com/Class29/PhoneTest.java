package com.Class29;

public class PhoneTest {
	public static void main(String[] args) {
		//Phone phone=new Phone();//compiler tamamlanmam�� bir Clasa object tan�mlamana m�sade etmez
		// we can create indirectly through child class
		Phone phone=new iPhone();
		phone.makeCall();
		phone.sendText();
		phone.playGames();		
		phone.tekePictures();
		
			File file=new WordFile();
			file.open();
			file.edit();
			file.close();
			
		
	}

}
