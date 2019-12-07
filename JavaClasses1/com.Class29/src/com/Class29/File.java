package com.Class29;

public abstract class File {
	
public abstract void open();

public void edit() {
	System.out.println("This is behavoir of open");
}
public void close() {
	System.out.println("This is behavoir of close");
}
}
class JavaFile extends File {
	
@Override
public void open() {
	// TODO Auto-generated method stub
	System.out.println("Jawa File");
	
}}
class WordFile extends File {

@Override
public void open() {
// TODO Auto-generated method stub
	System.out.println("Word File");

}}
class PdfFile extends File{

@Override
public void open() {
// TODO Auto-generated method stub
	System.out.println("Pdf File");

}

}
