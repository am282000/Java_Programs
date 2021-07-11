// Series Sum - 1 - 1/2 + 1/3 - 1/4 + 1/5 .......infinity
// This is called as lograthmic of 2 series ...means log2 base e. 

import java.util.Scanner;

public class SeriesSum2
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter no ");
	    
	    int n =sc.nextInt();
	    float result =0;
	    float evenRes=0,oddRes=0;
	    
	    for(float i=1;i<=n;i++){  
	        if(i%2==0){
	            evenRes-=1/i;       // or we can also store output of both in result variable too 
	        }else{
	            oddRes+=1/i;
	        }
	    }
	    result=evenRes+oddRes;
	    System.out.println(result);
	}
}











