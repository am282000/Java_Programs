

//Factorial


import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter no ");
	    int number =sc.nextInt();
	    int result=1;
	    System.out.println("Factorial of " + number + " is :");
		for(int i=2;i<=number;i++){      //initialise ; condition ; reinitialoise
		  result = i*result;
		}
		System.out.println(result);
	}
}


// another method 
/*
for(int i=number;i>=2;i--){
            result = i*result;
    }
*/
