package jawaRewievClasses;

public class ForLoopExample {
	public static void main(String[] args) {
		
		for (int i=0;    i<=4;           i++) {
			System.out.print("Good morning**");
			}
			//print numbers from 1-10;
		System.out.println(" ");
			for (int i=1; i<=10; i++) {
			System.out.print(" i="+i);
			}
			//print even numbers from 10-1
			System.out.println(" ");
			System.out.println(" even Numbers");
			for (int i=10; i>=1; i--) {
				if(i%2==0)
			System.out.print(" i="+i);
			}
			System.out.println(" ");
			System.out.println(" Numbers+5 ");
			for (int i=0; i<=50; i+=5) {
			System.out.print(" i="+i);//5, 10, 15, 20
			}
			System.out.println(" ");
			System.out.println(" Odd Numbers");
			//odd numbers
			int sum=0;
			for (int i=0; i<=20; i++) {
				if (i%2>0)
					
			System.out.print(" i="+i+" Sum="+sum);
				sum=sum+i;
			}
	}

}
