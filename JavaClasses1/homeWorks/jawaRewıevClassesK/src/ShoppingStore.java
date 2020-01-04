
public class ShoppingStore {
	String item;
	double price;
	int quantity;
	
	ShoppingStore(String item,double price,int quantity){
		this.item=item;
		this.price=price;
		this.quantity=quantity;
	}	
	double itemTotalPrice() {
		double totalValue=price*quantity;
		System.out.println(item+" "+" Total Value "+totalValue);
		return totalValue;
	}
	 
	  public static void main(String[] args) {
		  ShoppingStore blancket = new ShoppingStore("Blancket" , 49.99, 2);
	      double blankTotal=blancket.itemTotalPrice();
	      ShoppingStore mattress = new ShoppingStore("Mattress" , 219.59, 2);
	      double matressTotal=mattress.itemTotalPrice();
	      //Complete the Application
	     double sum=blankTotal+matressTotal;

	      System.out.println("You purchased "+sum+" Today");
	  }
	

}
