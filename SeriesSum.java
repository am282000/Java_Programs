// Series Sum

import java.util.Scanner;

public class SeriesSum
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter no ");
	    
	    int n =sc.nextInt();
	    float result =0;
	    
	    for(float i=1;i<=n;i++){  // if we take i=0 than 1/0 becomes infinity
	        result+=1/i;
	    }
	    System.out.println(result);
	}
}











