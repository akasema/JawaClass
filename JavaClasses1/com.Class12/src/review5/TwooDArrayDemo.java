package review5;

public class TwooDArrayDemo {

	public static void main(String[] args) {
		// 1D Arrays
//		int [] a= new int [4];
//		for (int i=0; i<a.length; i++) {
//			
//			System.out.println(a[i]);
//		}
// 2D Arrays
		int [][] a=new int[3][4];
		a[0][0]=5;	a[0][1]=6;	a[0][2]=7; //olmayan kolnu 0 g�sterir
		a[1][0]=4;	a[1][1]=5;	a[1][2]=8;
		a[2][0]=3;	a[2][1]=3;	a[2][2]=9;
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("***********************");
		//2D array an other way 
			int [][] b= {
					{2,4,5,6,8},
					{3,6,8,4,6,5,3},//b[i].length o rowun indexini g�sterir
					{6,7,8,3,7,2},
					{1,3,4,6,9},
					};
			for (int i=0; i<b.length; i++) {
				for (int j=0; j<b[i].length; j++) {
					System.out.print(b[i][j]+" ");
					}
				System.out.println();
			}	System.out.println("***********************");
			for (int i=0; i<b.length; i++) {
				for (int j=0; j<b[i].length; j++) {
					if (j != 1 && i !=3) {// 1, st�n ve 3. sat�r� basma 
						System.out.print(b[i][j]+" ");
					}
										}
				System.out.println();
			}
			
	}

}
