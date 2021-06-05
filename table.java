// Table 


import java.util.Scanner;

public class Table
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter no ");
	    int table =sc.nextInt();
	    System.out.println("Table of " + table + " is :");
		for(int i=1;i<=10;i++){      //initialise ; condition ; reinitialoise
		    System.out.println(table*i);
		}
	}
}


