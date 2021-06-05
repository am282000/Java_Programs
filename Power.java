// Power

import java.util.Scanner;

public class Power
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter no a raise to b");
	    int a =sc.nextInt();
	    int b =sc.nextInt();
	   
	    System.out.println("Power is : ");
	    int result =1;
	    
		for(int i=0;i<b;i++){     
		  result*=a;
		}
		System.out.println(result);
	}
}











