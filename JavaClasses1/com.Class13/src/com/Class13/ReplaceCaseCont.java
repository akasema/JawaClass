package com.Class13;

public class ReplaceCaseCont {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Today is  our java class";
		System.out.println(str.replace(" ", ""));// bo�lu�u kald�r�r
		System.out.println(str.replaceAll("\\s", ""));// bo�lu�u kald�r�r
		
		String doc="Video Welcome to YouTube's Spotlight channel, your daily video go-to for discovering what's new and trending around the world. video From music to culture to Internet phenomen ...";
		System.out.println(doc.toLowerCase().replace("video", "Audio"));
		System.out.println(doc.replaceAll("powerful(.*)", ""));
	}

}
