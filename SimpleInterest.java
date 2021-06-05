// Simple Interest


import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble();
        float interest = sc.nextFloat();
        int time = sc.nextInt();
        
        float amount = (float)(principal * interest * time /100);
        System.out.println(amount);
    }
}

