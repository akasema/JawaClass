

public class School {
	public static void main(String[] args) {
		Student std1=new Student();
		std1.stNumber=222;
		std1.name="Temel Laz";
		std1.gradeLevel="Grade 1";
		
		Student std2=new Student();
		
		std2.name="Marry Adams";
		std2.stNumber=312;
		std2.gradeLevel="Grade 3";
		
		Student std3=new Student();
		std3.name="James Best";
		std3.stNumber=431;
		std3.gradeLevel="Grade 3";
		
		Teacher tch1=new Teacher();
		tch1.name="Paul Smith";
		tch1.salary=50000;
		tch1.subject="Math";
		
		Teacher tch2=new Teacher();
		
		tch2.name="Emily Jordan";
		tch2.salary=35000;
		tch2.subject="Phisics";
		
		std1.name();
	}

}
