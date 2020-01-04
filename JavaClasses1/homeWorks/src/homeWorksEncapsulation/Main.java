package homeWorksEncapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Person pr=new Person();
//		pr.setFirstname("john");
//		pr.setLastname("Doe");
//		pr.setBirthmonth(10);
//		pr.setBirthday(25);
//		pr.setBirthyear(1900);
//		pr.setSsn("123-45-6789");
//		String birthdate=pr.formatBirthday(10,25,1900);
//			 
//		System.out.println(pr.getFirstname());
//		System.out.println(pr.getLastname());
//		System.out.println(birthdate);
//		System.out.println(pr.getSsn());
//		
//	}
//		EncapsulationDemo emp=new EncapsulationDemo();
//	
//		emp.setEmpName("John");
//		String e1=emp.getEmpName();
//		emp.setEmpAge(30);
//		int empAge=emp.getEmpAge();
//		System.out.println("Employee Name: "+e1);
//		System.out.println("Employee Age: "+empAge);
//		}
		   Account acc=new Account();
		     acc.setAccount_no(756050400);
		    long ac1=acc.getAccount_no();
		   
		    acc.setName("Sumair");
		    String n1=acc.getName();
		   
		     acc.setEmail("sumair@syntaxsolutions.com");
		     String em=acc.getEmail();
		     
		     acc.setAmount(50000.0);
		     double a=acc.getAmount();
		     System.out.print(ac1+"0"+" "+n1+" "+em+" "+a);
		    
		    
		  }
		  }


