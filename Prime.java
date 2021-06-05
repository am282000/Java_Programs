// Prime

import java.util.Scanner;

public class Prime
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter no ");
	    boolean isPrime = true;
	    int n =sc.nextInt();
	    
	    for(int i=2;i<n;i++){
	        if(n%i==0)     //reminder 0 => means divide hora h => not prime
	            isPrime=false;
                break;	        
	    }
	    if(n<2) isPrime=false; 
	    
	    System.out.println(isPrime);
	}
}


// optimized - (root n) tk mai factor mil jate hai agr hote h toh 


/*
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter no ");
	    boolean isPrime = true;
	    int n =sc.nextInt();
	    
	    for(int i=2;i*i<=n;i++){    // this means i = root n
	        if(n%i==0)     
	            isPrime=false;
                break;	        
	    }
	    if(n<2) isPrime=false; 
	    
	    System.out.println(isPrime);
	}
}

*/



















