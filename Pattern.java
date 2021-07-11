
//Pattern 1

/*
import java.util.Scanner;

public class Pattern
{
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     
	    for(int i=1;i<=n;i++){       //rows
	        for(int j=1;j<=n;j++)   //columns
	            System.out.print("* ");
	       System.out.println();
	    }
	}
}
*/

//Pattern 2

/*
import java.util.Scanner;

public class Pattern
{
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     
	    for(int i=1;i<=n;i++){       
	        for(int j=1;j<=i;j++)
	            System.out.print("* ");
	       System.out.println();
	    }
	}
}

*/


//Pattern 3

/*
import java.util.Scanner;

public class Pattern
{
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     
	    for(int i=1;i<=n;i++){       
	        for(int j=1;j<=i-1;j++)         //If we write i here it will print some extra spaces at start 
	            System.out.print("  ");     //print spaces  
	        for(int j=1;j<=n-i+1;j++)       // to decreasing the amount of stars
	            System.out.print("* ");     //print star
	       System.out.println();
	    }
	}
}
*/

//Pattern 4

/*
import java.util.Scanner;

public class Pattern
{
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     
	    for(int i=1;i<=n;i++){       
	        for(int j=1;j<=n-i+1;j++)   //n-1+1 becoz we want to leave 0 spaces in start
	            System.out.print("* ");
	       System.out.println();
	    }
	}
}
*/

//Pattern 5


import java.util.Scanner;

public class Pattern
{
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     
	    for(int i=1;i<=n;i++){       
	        for(int j=1;j<=n-i+1;j++)         //becoz spaces zyade se km krne h
	            System.out.print("  ");     // by removing 1 space we get an amazing pattern
	        for(int j=1;j<=i;j++)       // jitni i ki value utne spaces
	            System.out.print("* ");     
	       System.out.println();
	    }
	}
}