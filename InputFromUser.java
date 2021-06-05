
//  Input from User

// Scanner is an inbuld classs of java to take input byte user

import java.util.Scanner;

public class InputFromUser{
    public static void main(String[] args){ 
        
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        System.out.println(c);
        
        int a = sc.nextInt();
        System.out.println(a);
        
        double b = sc.nextDouble();
        System.out.println(b);
        
      
    }
}

