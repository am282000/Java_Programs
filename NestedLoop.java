
//Nested for loop

import java.util.Scanner;

public class NestedTable
{
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int firstLoop = sc.nextInt();
	     int secondLoop = sc.nextInt();
	    for(int i=1;i<=firstLoop;i++){       
	        for(int j=1;j<=secondLoop;j++)
	            System.out.print(j +" ");
	       System.out.println();
	    }
	}
}
