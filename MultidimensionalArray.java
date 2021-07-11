
//Multidimensional Array


public class MultidimensionalArray
{
	public static void main(String[] args) {
		int a[][] = new int[3][5];     //Row then Column
		int b[][] ={
		                {1,4,7,3,2,7,3,6},
		                {2,4,6},
		                {9,4,6,7,777,2}
		            };
		System.out.println(a[1][1]);    //Printing array elements
		System.out.println(b[2][4]);
	}
}