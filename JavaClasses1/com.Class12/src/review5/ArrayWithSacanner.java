package review5;

import java.util.Scanner;

public class ArrayWithSacanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many rows and colunms?");
		int rows=scan.nextInt();
		int cols=scan.nextInt();
		System.out.println("Your Array will have "+rows+" and columns "+cols);
		String [][] names= new String[rows][cols];
		System.out.println("Please enter your Names");
		for (int i=0; i<names.length; i++) {
			for (int j=0; j<names[i].length; j++) {
				names[i][j]=scan.nextLine();
			}
		}
		System.out.println("Your Names matrix is:");
		for (int i=0; i<names.length; i++) {
			for (int j=0; j<cols; j++) {
				System.out.print(names[i][j]+" ");;
			}System.out.println(" ");
		}
	}

}
