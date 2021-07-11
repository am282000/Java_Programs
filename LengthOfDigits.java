//Length of digits in a no

import java.util.Scanner;
public class LengthOfDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        int numberOfDigits = (int)Math.log10(n)+1;        //normally Math class returns double values
        System.out.println(numberOfDigits);
    }
}

