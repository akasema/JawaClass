import A.A;
import B.B;

public class Main {
//	 
//	  String dogName;
//	  double dogWeight;
//	  static String dogBreed="Mutt";
//	  Main (String str1, String breed, double wgt){
//	    System.out.println(str1+breed+wgt);
//	  }
//	  Main (String str1, double wgt){
//	        System.out.println(str1+wgt);
//	  }
//	  public static void main(String[] args) {
//	    
//	    Main dog1=new Main("Tarzan ","Mutt ", 50.0);
//	    Main dog2=new Main("Tarzan ","Mutt ", 50.0);
//	    
//	    
//	  }
//	String make;
//	String model;
//	int numberOfDoors;
//	int topSpeed;
//	double price;
//	
//	Main (String make,String model,int numDoors,int speed, double price){
//		System.out.println(make+" "+model+" "+numDoors+" "+speed+" "+price);
//	}
//	Main (String make,String model,int speed, double price){
//		System.out.println(make+" "+model+" "+" "+speed+" "+price);
//	}
//	
//	public static void main(String[] args) {
//		Main car1=new Main("Toyota", "Prius",4,120,30000.0);
//		
//		Main car2=new Main("Toyota", "Prius",4,120,30000.0);
//		car2.numberOfDoors=4;
//		Main car3=new Main("unknown", "unknown",4,120,30000.0);
//		Main car4=new Main("Toyota", "Prius",4,90,0.0);
//		
//	}
	
//	  String name;
//	  String lastName;
//	  int employeId;
//	  String startDate;
//	  int salary;
//	  
//	  
//	  Main (){
//	    
//	  }
//	  Main (String name, String lastName,int employeId,String startDate,int salary){
//	    
//	  }
//	  
//	  public static void main(String[]args){
//	    
//	    Main emp1=new Main();
//	    emp1.name="null";
//	    emp1.lastName="null";
//	    emp1.employeId=0;
//	    emp1.startDate="null";
//	    emp1.salary=0;
//	    System.out.println(emp1.name+" "+emp1.lastName+" "+emp1.employeId+" "+emp1.startDate+" "+emp1.salary);
//	    
//	    Main emp2=new Main();
//	    emp2.name="Joe";
//	    emp2.lastName="Smith";
//	    emp2.employeId=12345;
//	    emp2.startDate="01/01/1970";
//	    emp2.salary=35000;
//	    System.out.println(emp2.name+" "+emp2.lastName+" "+emp2.employeId+" "+emp2.startDate+" "+emp2.salary);
//	     }
//		
//	String schoolName;
//	int batch;
//	int year;
//	String lastDayOfClass;
//	
//	Main (){
//		System.out.println("null "+0+" null "+"null");
//			}
//	
//	Main (String schoolName,int batch,String year, String lastDayOfClass){
//		System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
//	}
//	
//	public static void main(String[] args) {
//		Main sch1=new Main();
//		
//		Main sch2=new Main("Syntax", 4, "2019", "07/30/2019");
//		
//		
//	}
//	
//	 String label;
//	 double price; 
//	 String category;
//	 boolean hasExpiration; 
//	 int stock;
//	 
//	 Main (String objLabel,double objPrice,String objCategory, boolean objHasExpiration, int objStock){
//	 label=objLabel;
//	 price=objPrice;
//	 category=objCategory;
//	 hasExpiration=objHasExpiration;
//	 stock=objStock;
//	 }
//	 Main (String label,double price, int stock){
//		 
//	 }
//	 Main (String label,double price){		 
//	 }
//	  void display() {
//		  System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
//	  }
//	  
//	 public static void main(String[]args) {
//		 
//		 Main obj1=new Main("Eggs",3.0,"Produce", true,10);
//		 obj1.display();
//		 Main obj2=new Main("Paper Towels",2.0,"misc",false,24);
//		 obj2.display();
//		 Main obj3=new Main("Paper Towels",2.0,"null",false,0);
//		 obj3.display();
//	 }
//	
//	static String name="Toyota"; 
//	public String model;
//	public int price; 
//	public double quantity;
//
//	Main (String mdl, int prc, double qnt){
//	  this.model=mdl;
//	  this.price=prc;
//	  this.quantity=qnt;
//	}
//
//	  public Main() {
//		// TODO Auto-generated constructor stub
//	}
//
//	void carStockValue(String name,int model,double qnt){
//	  //this.quantity=qnt+this.quantity;
//		this.quantity=qnt;
//	  System.out.println(this.model+" "+model+" Stock Value "+this.quantity);
//	  
//	}
//	  public static void main(String[] args) {
//	   Main toyotaCar = new Main("Toyota ", 2019 ,0); 
//	   toyotaCar.carStockValue("Toyota ",2019 , 25000.0);
//	   Main bMwCar = new Main("BMW ", 2019 ,652980.0); 
//	   bMwCar.carStockValue("BMW ",2019 , 652980.0); 
//	    //Complete Second part
//	    
//	  }
//	String item;
//	double price;
//	int quantity;
//	Main(String item, double price, int quantity){
//		this.item = item;
//		this.quantity = quantity;
//		this.price = price;
//	}
//	double itemStockValue() {
//		double Total = quantity*price;
//		System.out.println(item+" Total Value "+Total);
//		return Total;
//	}
//	public static void main(String[] args) {
//		Main Blancket = new Main ("Blancket",49.99,2);
//		double BlanTotal = Blancket.itemStockValue();
//		Main Mattress = new Main("Mattress",219.59,2);
//		double MatTotal = Mattress.itemStockValue();
//		double sum = BlanTotal+MatTotal;
//		System.out.println("You purchased "+sum+" Today");
//	}
	public static void main(String[] args) {

		A obj1=new A();
		obj1.print();
		B obj2=new B();
		obj2.print();
		C obj3=new C();
		obj3.print();
		}
}