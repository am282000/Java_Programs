import java.util.Scanner;

public class Calculator
{
    
	public static void main(String[] args) {
	    float result=0;
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter a ");
		float a = sc.nextFloat();
		System.out.println("Enter b ");
		float b = sc.nextFloat();
	    System.out.println("Enter operator ");
	    sc.nextLine();
		char c = sc.nextLine().charAt(0);
		
		switch(c){
		    case '+':
		        result =a+b;
		        break;
		    case '-':
		        result =a-b;
		        break;
		    case '*':
		        result =a*b;
		        break;
		    case '/':
		        result =a/b;
		        break;
		    default:
		        System.out.println("Invalid Operator");
		}
		System.out.println(result);
	}
}



