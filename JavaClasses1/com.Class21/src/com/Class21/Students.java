package com.Class21;

public class Students {
	String studentName;
	int studentID; 
	public static int numberOfStudents;
	
	public void displayInfo() {;
	System.out.println(numberOfStudents);
	 }
	
	public static void main(String[] args) {
		Students std1=new Students();
		std1.studentID=12345;
		std1.numberOfStudents++;
		std1.studentName="Kadir";
		
		std1.displayInfo();
		
		Students std2=new Students();
		std2.studentID=12345;
		Students.numberOfStudents++;// 1 er artırmak için ++ yazdı , 
		//Students olması uygun çünkü değişkene ait değil de classa ait bir variable
		
		std2.studentName="Kadir";
		
		std2.displayInfo();
		
		
	}

}
