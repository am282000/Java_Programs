// Advancedpattern 6

/*
import java.util.Scanner;
public class AdvancedPattern
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++){
		    for(int j=1;j<n-i+1;j++){
		        System.out.print("  ");
		    }
		    for(int j=1;j<=i;j++){
		        System.out.print("*  ");
		    }
		    System.out.println();
		}
	}
}
*/

// Advancedpattern 7

/*
import java.util.Scanner;
public class AdvancedPattern
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int number=1;
		
		for(int i=1;i<=n;i++){
		    for(int j=1;j<n-i+1;j++){
		        System.out.print("  ");
		    }
		    for(int j=1;j<=i;j++){
		        System.out.print(number +"  ");    //or we can do number++ + "  " 
		        number++;
		    }
		    System.out.println();
		}
	}
}
*/




//Advancedpattern 8 - in one loop

/*
import java.util.Scanner;
public class AdvancedPattern
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int rows = 2* n-1;
		
    	for(int i=1;i<=rows;i++){
    	    if(i<=n){
    	       for(int j=1;j<=i;j++)
    	           System.out.print("* "); 
	        }else{
	            for(int j=1;j<=rows-i+1;j++)
	                System.out.print("* ");
	        }
	        System.out.println();
	    }
	}
}
*/

//Advancedpattern 9

import java.util.Scanner;
public class AdvancedPattern
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println("* ");    //first row star
		
		for(int i=2;i<=n-1;i++){    // middle rows
		    System.out.print("* ");
		    
		    for(int j=1;j<=i-2;j++)     // for increasing spaces b/w 2 stars
		        System.out.print("  ");
		        
		    System.out.print("* ");
		    System.out.println();
		}
		
		if(n>1){
    		for(int i=1;i<=n;i++)         //last row star
    		    System.out.print("* ");
		}
	}
}

















