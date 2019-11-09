package review5;

public class Maxin2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] b= {
				{2,4,5,6,8},
				{3,6,8,4,6},
				{6,7,8,13,7},
				{1,3,4,6,9},
				};
		int sum=0;
		System.out.println();
		int max= b[0][0];
		for (int i=0; i<b.length; i++) {
			for (int j=0; j<b[i].length; j++) {
				sum=sum+b[i][j]; //SUMMATION
				if (b[i][j]>max) {// MAXIMUM 
					max=b[i][j];
				}
			}
		}System.out.println(" Max is"+max+"; Sum is " +sum);
	}

}
