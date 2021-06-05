// Array

/*
public class Main
{
	public static void main(String[] args) {
		int [] marks = new int[5];      // or we can write as marks[] 
		marks[1]=777;
		System.out.println(marks[0] +" " + marks[1]);  // by default all the values are 0.
	}
}

// Note: We can also assign values directly as    int marks[]  ={1,2,3,4,4,4};

*/

//Average Scores

import java.util.Scanner;

public class Array{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter total no of Subjects ");
     int n = sc.nextInt();
     
     float marks[] = new float[n];
     
     System.out.println("Enter Marks ");
     for(int i=0;i<n;i++)
        marks[i]=sc.nextFloat();
     
     float avgMarks=0;
     for(int i=0;i<n;i++)
        avgMarks += marks[i];
     
     avgMarks /=n;
    
    System.out.println("Avg Marks "+avgMarks); 
    }
}


 